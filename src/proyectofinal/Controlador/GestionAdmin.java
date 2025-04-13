package proyectofinal.Controlador;
import java.util.ArrayList;
import proyectofinal.Vista.Vistaadministrador; 
import proyectofinal.Modelo.Empleado; 



public final class GestionAdmin {
    Vistaadministrador administrar;
    Empleado nuevoEmpleado; 
    
    public GestionAdmin(Vistaadministrador vistaadministrador) {
        administrar = vistaadministrador;
        nuevoEmpleado= new Empleado(); 
        System.out.print("Control de constructo de empleador");
    }

    
    public void limpiarCamposEmpleado() {
        System.out.print("Punto de control limpiar campos empleado");
        administrar.getCuadroNombreE().setText("");
        administrar.getCuadroIDE().setText("");
        administrar.getCuadroTelefonoE().setText("");
        administrar.getCuadroCorreoE().setText("");
        administrar.getCuadroIDrolE().setText("");
        administrar.getCuadroSueldoE().setText("");
        //administrar.getCuadroRol().setText("");
    }
    
    public ArrayList<Empleado> registrarEmpleado() {
        System.out.print("Punto de control registrar empleado");
        String nombre = administrar.getCuadroNombreE().getText();
        int id = Integer.parseInt(administrar.getCuadroIDE().getText());
        String telefono = administrar.getCuadroTelefonoE().getText();
        String ID_rol = administrar.getCuadroIDrolE().getText();
        int sueldo = Integer.parseInt(administrar.getCuadroSueldoE().getText());
        //String rol = administrar.getCuadroRol().getText(); 
        String horario=administrar.getCuadroHorarioE().getText(); 
        nuevoEmpleado= new Empleado(nombre, telefono, ID_rol, id, horario, sueldo); 
        nuevoEmpleado.registrarEmpleadobd();
        limpiarCamposEmpleado();
        return consultarEmpleados();
    }
    
    public ArrayList<Empleado> actualizarEmpleado(int id) {
        System.out.print("Punto de control actualizar empleados");
        String nombre = administrar.getCuadroNombreE().getText();
        String telefono = administrar.getCuadroTelefonoE().getText();
        String correo = administrar.getCuadroCorreoE().getText();
        String ID_rol = administrar.getCuadroIDrolE().getText();
        double sueldo = Double.parseDouble(administrar.getCuadroSueldoE().getText());
        //String rol = administrar.getCuadroRol().getText();
        
        nuevoEmpleado.actualizarEmpleadobd();
        limpiarCamposEmpleado();
        return consultarEmpleados();
    }
    
    public ArrayList<Empleado> consultarEmpleados() {
        System.out.print("Punto de control consultar empleados");
        return 
        nuevoEmpleado.consultarEmpleadoTodos();
    }
    
    public ArrayList<Empleado> buscarporId(int id){
       nuevoEmpleado.setIdempleado(id);
       return nuevoEmpleado.consultarEmpleadoTodos(); 
   }
    
    public ArrayList<Empleado> eliminarEmpleado() {
        int id = Integer.parseInt(administrar.getCuadroIDE().getText());
        System.out.print("Punto de control eliminar empleados");
        
        nuevoEmpleado.eliminarEmpleadobd(id);
        limpiarCamposEmpleado();
        return consultarEmpleados();
    }
}
