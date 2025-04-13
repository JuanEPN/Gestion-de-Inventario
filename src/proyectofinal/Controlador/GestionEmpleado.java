package proyectofinal.Controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectofinal.Modelo.Empleado;
import proyectofinal.Vista.Vistaadministrador;

public class GestionEmpleado {
    
    Vistaadministrador admin;

    public GestionEmpleado(){
    }
    
    public void registrarEmpleado(){
        Empleado e = new Empleado();
        e.setIdempleado(Integer.parseInt(this.admin.getCuadroIDE().getText()));
        e.setNombreempleado(this.admin.getCuadroNombreE().getText());
        e.setNumeroempleado(this.admin.getCuadroTelefonoE().getText());
        e.setHorarioempleado(this.admin.getCuadroHorarioE().getText());
        e.setSueldoempleado(Integer.parseInt(this.admin.getCuadroSueldoE().getText()));
        e.setRolempleado(this.admin.getCuadroIDrolE().getText());
        
        e.registrarEmpleadobd();
        consultarEmpleado();
    }
    
    public void actualizarEmpleado (int idE){
        Empleado e = new Empleado();
        
        e.setIdempleado(Integer.parseInt(this.admin.getCuadroIDE().getText()));
        e.setNombreempleado(this.admin.getCuadroNombreE().getText());
        e.setNumeroempleado(this.admin.getCuadroTelefonoE().getText());
        e.setHorarioempleado(this.admin.getCuadroHorarioE().getText());
        e.setSueldoempleado(Integer.parseInt(this.admin.getCuadroSueldoE().getText()));
        e.setRolempleado(this.admin.getCuadroIDrolE().getText());
        
        
        e.actualizarEmpleadobd();
        consultarEmpleado();
    }
    
    public void consultarEmpleado(){
        Empleado e=new Empleado(); 
        e.consultarEmpleadoTodos(); 
    }
    
    
    
    public void eliminarEmpleado(int idE){
        Empleado e = new Empleado();
        e.eliminarEmpleadobd(idE);
        consultarEmpleado();
    }
    
    public ArrayList<Empleado>   buscarporId(int id){
       Empleado e = new Empleado(); 
       e.setIdempleado(id);
       return e.consultarEmpleadoTodos(); 
   }
      
    public Vistaadministrador getGestionEmpleado(){
        return admin;
    }
    
    public void setGestionEmpleado (Vistaadministrador admin){
        this.admin = admin;
    }
}