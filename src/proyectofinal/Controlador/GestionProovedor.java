package proyectofinal.Controlador;
import java.util.ArrayList;
import proyectofinal.Vista.Vistaadministrador; 
import proyectofinal.Modelo.Proovedor; 


public class GestionProovedor {
    Vistaadministrador administrar;
    Proovedor nuevoProveedor; 
    

    public GestionProovedor(Vistaadministrador vistaadministrador) {
        administrar = vistaadministrador;
        nuevoProveedor= new Proovedor(); 
        System.out.print("Control de constructor de proveedor");
        
    }
    
    public void limpiarCamposProveedor() {
        administrar.getCuadroNombreProovedor().setText("");
        administrar.getCuadroIDProovedor().setText("");
        administrar.getCuadroTelefonoProovedor().setText("");
        administrar.getCuadroCorreoProovedor().setText("");
        administrar.getCuadroDireccionProovedor().setText("");
    }

    // Registrar un nuevo proveedor
    public ArrayList<Proovedor> registrarProveedor() {
        System.out.print("Punto de control registrar proveedor");
        String nombre = administrar.getCuadroNombreProovedor().getText();
        String id = administrar.getCuadroIDProovedor().getText();
        String telefono = administrar.getCuadroTelefonoProovedor().getText();
        String correo = administrar.getCuadroCorreoProovedor().getText();
        String direccion = administrar.getCuadroDireccionProovedor().getText();
        nuevoProveedor= new Proovedor(id, nombre, direccion,  telefono, correo); 
        nuevoProveedor.registrarProveedorbd();
        limpiarCamposProveedor(); 
        return consultarProveedores(); 
    }

    public ArrayList<Proovedor> actualizarProveedor(int id) {
        String nombre = administrar.getCuadroNombreProovedor().getText();
         
        String telefono = administrar.getCuadroTelefonoProovedor().getText();
        String correo = administrar.getCuadroCorreoProovedor().getText();
        String direccion = administrar.getCuadroDireccionProovedor().getText(); 
        
        nuevoProveedor.actualizarProveedorbd(); 
        limpiarCamposProveedor();
        return consultarProveedores();
    }


    public ArrayList<Proovedor> consultarProveedores() {
        return 
        nuevoProveedor.consultarProveedoresTodos(); 
    }
    
    public ArrayList<Proovedor> buscarporId(String id){
        nuevoProveedor.setIdproovedor(id);
        return nuevoProveedor.consultarProveedoresTodos(); 
    } 

    // Eliminar un proveedor
    public ArrayList<Proovedor> eliminarProveedor() {
        int id = Integer.parseInt(administrar.getCuadroIDProovedor().getText());
        
        nuevoProveedor.eliminarProveedorbd(id);
        limpiarCamposProveedor();
        return consultarProveedores();
    }   
}
