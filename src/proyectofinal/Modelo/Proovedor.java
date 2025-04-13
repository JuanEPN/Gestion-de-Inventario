package proyectofinal.Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import proyectofinal.Controlador.Conexion;


public class Proovedor {
    private String idproovedor; 
    private String nombreproovedor; 
    private String direccionproovedor; 
    private String numeroproovedor; 
    private String correoproovedor; 
    
    public Proovedor(String idproovedor, String nombreproovedor, String direccionproovedor,  String numeroproovedor, String correoproovedor){
        this.correoproovedor=correoproovedor;
        this.direccionproovedor=direccionproovedor; 
        this.idproovedor=idproovedor;
        this.nombreproovedor=nombreproovedor; 
        this.numeroproovedor=numeroproovedor; 
    }
    
    public Proovedor(){
        
    }

    public String getIdproovedor() {
        return idproovedor;
    }

    public String getNombreproovedor() {
        return nombreproovedor;
    }

    public String getDireccionproovedor() {
        return direccionproovedor;
    }

    public String getNumeroproovedor() {
        return numeroproovedor;
    }

    public String getCorreoproovedor() {
        return correoproovedor;
    }

    public void setIdproovedor(String idproovedor) {
        this.idproovedor = idproovedor;
    }

    public void setNombreproovedor(String nombreproovedor) {
        this.nombreproovedor = nombreproovedor;
    }

    public void setDireccionproovedor(String direccionproovedor) {
        this.direccionproovedor = direccionproovedor;
    }

    public void setNumeroproovedor(String numeroproovedor) {
        this.numeroproovedor = numeroproovedor;
    }

    public void setCorreoproovedor(String correoproovedor) {
        this.correoproovedor = correoproovedor;
    }

    @Override
    public String toString() {
        return "Proovedor{" + "idproovedor=" + idproovedor + ", nombreproovedor=" + nombreproovedor + ", direccionproovedor=" + direccionproovedor + ", numeroproovedor=" + numeroproovedor + ", correoproovedor=" + correoproovedor + '}';
    }
    
    
    
     public ArrayList<Proovedor> consultarProveedoresTodos(){
    String sql = "select * from proveedores where id_proveedor="+idproovedor;
    ArrayList<Proovedor> provee = new ArrayList<>();
    Conexion c = new Conexion();
    c.abrirConexion();
    ResultSet rs= c.ejecutarConsulta(sql);
    try{
        while(rs.next()){
            Proovedor p = new Proovedor();
             p.setIdproovedor("id_proveedor");
             p.setNombreproovedor(rs.getString("nombre_proveedor"));
             p.setDireccionproovedor(rs.getString("direccion_proveedor"));
             p.setNumeroproovedor(rs.getString("telefono_proveedor"));
             p.setDireccionproovedor(rs.getString("correo_proveedor"));
     
             provee.add(p);
        }
    }catch(java.sql.SQLException e){
        
    }
    return provee; 
}
    
    
    public void actualizarProveedorbd(){
    Conexion c = new Conexion();
    c.abrirConexion();
    c.ejecutar("update proveedores set id_proveedor ="+this.idproovedor+", nombre_proveedor="+this.nombreproovedor+",direccion_proveedor ="+this.direccionproovedor+", telefono_proveedor="+this.numeroproovedor+", correo_proveedor="+this.correoproovedor+" where id_proveedor="+this.idproovedor);
}
  
    public void registrarProveedorbd() {
        Conexion c= new Conexion(); 
        c.abrirConexion();
        String ejecutar="insert into proveedores (id_proveedor, nombre_proveedor, direccion_proveedor, telefono_proveedor, correo_proveedor) values("+idproovedor+",'"+nombreproovedor+"','"+direccionproovedor+"', '"+numeroproovedor+"','"+correoproovedor+"')"; 
        c.ejecutar(ejecutar);
        
    }
    
    public void eliminarProveedorbd(int id){
     Conexion c = new Conexion();
     c.abrirConexion();
     c.ejecutar("delete from proveedores where id_proveedor="+id);
    
     
     
     
}
}
