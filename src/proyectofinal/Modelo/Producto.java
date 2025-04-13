package proyectofinal.Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import proyectofinal.Controlador.Conexion; 


public class Producto {
    private String nombre; 
    private int stock; 
    private String categoria; 
    private int id;
    private int precio; 
    
    
    
    public Producto(int stock, String nombre, int id, int precio, String categoria){
        this.nombre=nombre; 
        this.stock=stock; 
        this.categoria= categoria; 
        this.id=id; 
        this.precio=precio; 
    }
    
    
    
    public Producto(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", stock=" + stock + ", categoria=" + categoria + ", id=" + id + ", precio=" + precio + '}';
    }
    
    //consultar sql 
    
    
    public ArrayList<Producto> consultarProductosTodos(){
    String sql = "select * from inventario where id_producto="+id;
    ArrayList<Producto> productos = new ArrayList<>();
    Conexion c = new Conexion();
    c.abrirConexion(); 
    ResultSet rs= c.ejecutarConsulta(sql);
    try{
        while(rs.next()){
            Producto p = new Producto();
             p.setId(rs.getInt("id_producto"));
             p.setNombre(rs.getString("nombre_producto"));
             p.setStock(rs.getInt("stock"));
             p.setPrecio(rs.getInt("precio"));
             p.setCategoria(rs.getString("categoria"));
     
     
             productos.add(p);
        }
    }catch(java.sql.SQLException e){
        
    }
    
    return productos; 
}
    
    
   
    
    public void actualizarProductobd(){
    Conexion c = new Conexion();
    c.abrirConexion();
    String ejecutarActP="update inventario set id_producto =" + this.id + ", nombre_producto='" + this.nombre + "', stock=" + this.stock + ", precio=" + this.precio + ", categoria='" + this.categoria + "' where id_producto=" + this.id; 
    c.ejecutar(ejecutarActP);
}
  
    public void registrarProductobd(int stock1, String nombre1, int id1, int precio1, String categoria1) {
        Conexion c= new Conexion(); 
        c.abrirConexion(); 
        String insert1="insert into inventario (id_producto, nombre_producto, stock, precio, categoria) values("+id+",'"+nombre+"',"+stock+","+precio+",'"+categoria+"')"; 
        String insert2="insert into entradas (id_entrada, id_producto, cantidad_compra) values("+id+",'"+id+"',"+stock+")"; 
        System.out.print(insert1);
        System.out.print(insert2);
        c.ejecutar(insert1); 
        c.ejecutar(insert2); 
        
    }
    
    public void venderProductodb(){
        Conexion c= new Conexion(); 
        c.abrirConexion(); 
        int id_venta=id+100; 
        int id_salida=id+1000; 
        
        String insert3="insert into historial_ventas (id_venta, id_producto, nombre_producto, id_salida, cantidad_vendida, precio_venta) values("+id_venta+","+id+",'"+nombre+"',"+id_salida+","+stock+","+precio+")"; 
        System.out.print(insert3);
        c.ejecutar(insert3); 
        c.ejecutar("update inventario set stock=stock-1 where id_producto="+id);
    }
    
    
   
    public void eliminarProductobd(int id){
     Conexion c = new Conexion();
     c.abrirConexion();
     c.ejecutar("delete inventario where id_producto="+id);
    
     
     
     
}
    
    
    
    
    
    
    

   
}
