
package proyectofinal.Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import proyectofinal.Controlador.Conexion;


public class Empleado {
    private String nombreempleado; 
    private String numeroempleado; 
    private String rolempleado; 
    private int idempleado;
    private String horarioempleado; 
    private int sueldoempleado; 
    
    public Empleado (String nombreempleado, String numeroempleado, String rolempleado, int idempleado, String horarioempleado, int sueldoempleado){
        this.horarioempleado=horarioempleado; 
        this.idempleado=idempleado; 
        this.nombreempleado=nombreempleado; 
        this.numeroempleado=numeroempleado; 
        this.rolempleado=rolempleado; 
        this.sueldoempleado=sueldoempleado;
    }
    
    public Empleado(){
        
    }

    public String getNombreempleado() {
        return nombreempleado;
    }

    public String getNumeroempleado() {
        return numeroempleado;
    }

    public String getRolempleado() {
        return rolempleado;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public String getHorarioempleado() {
        return horarioempleado;
    }

    public int getSueldoempleado() {
        return sueldoempleado;
    }

    public void setNombreempleado(String nombreempleado) {
        this.nombreempleado = nombreempleado;
    }

    public void setNumeroempleado(String numeroempleado) {
        this.numeroempleado = numeroempleado;
    }

    public void setRolempleado(String rolempleado) {
        this.rolempleado = rolempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public void setHorarioempleado(String horarioempleado) {
        this.horarioempleado = horarioempleado;
    }

    public void setSueldoempleado(int sueldoempleado) {
        this.sueldoempleado = sueldoempleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreempleado=" + nombreempleado + ", numeroempleado=" + numeroempleado + ", rolempleado=" + rolempleado + ", idempleado=" + idempleado + ", horarioempleado=" + horarioempleado + ", sueldoempleado=" + sueldoempleado + '}';
    }

    
     public ArrayList<Empleado> consultarEmpleadoTodos(){
    String sql = "select * from empleados where id_empleado="+idempleado;
    ArrayList<Empleado> em = new ArrayList<>();
    Conexion c = new Conexion();
    c.abrirConexion();
    ResultSet rs= c.ejecutarConsulta(sql);
    try{
        while(rs.next()){
            Empleado e = new Empleado();
             e.setIdempleado(rs.getInt("id_empleado"));
             e.setNombreempleado(rs.getString("nombre_empleado"));
             e.setNumeroempleado(rs.getString("telefono_empleado"));
             e.setHorarioempleado(rs.getString("horario"));
             e.setSueldoempleado(rs.getInt("sueldo"));
             e.setRolempleado(rs.getString("rol_empleado"));
     
             em.add(e); 
        }
    }catch(java.sql.SQLException e){
        
    }
    return em; 
}
    
    
    public void actualizarEmpleadobd(){
    Conexion c = new Conexion();
    c.abrirConexion();
    String ejecutarAct="update empleados set id_empleado ='"+this.idempleado+"', nombre_empleado="+this.nombreempleado+",telefono_empleado ="+this.numeroempleado+", horario="+this.horarioempleado+", sueldo="+this.sueldoempleado+", rol_empleado="+this.rolempleado+" where id_empleado="+this.idempleado; 
    c.ejecutar(ejecutarAct);
}
  
    public void registrarEmpleadobd() {
        Conexion c= new Conexion(); 
        c.abrirConexion();
        String insert="insert into empleados (id_empleado, nombre_empleado, telefono_empleado, horario, sueldo, rol_empleado) values('"+idempleado+"','"+nombreempleado+"','"+numeroempleado+"', '"+horarioempleado+"',"+sueldoempleado+",'"+rolempleado+"')"; 
        System.out.print(insert);
        c.ejecutar(insert);
        
    }
    
    public void eliminarEmpleadobd(int id){
     Conexion c = new Conexion();
     c.ejecutar("delete from empleados where id_empleado="+idempleado);
    
     
     
     
}
   
    

}
