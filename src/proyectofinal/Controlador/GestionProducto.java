package proyectofinal.Controlador;
import java.util.ArrayList;
import proyectofinal.Modelo.Producto; 
import proyectofinal.Vista.Vistabodega; 
import proyectofinal.Vista.Vistatendero; 

public class GestionProducto {
    Vistatendero tendero; 
    Producto nuevoProducto = new Producto();
    Vistabodega bodega; 

    

    public GestionProducto(Vistabodega Vistabodega){
        bodega = Vistabodega;
        nuevoProducto= new Producto(); 
        System.out.print("Control de constructor de productos 1");
    }

    public GestionProducto(Vistatendero Vistatendero, Vistabodega Vistabodega) {
        tendero = Vistatendero;
        bodega=Vistabodega; 
        nuevoProducto= new Producto(); 
        System.out.print("Control de constructor de productos 2");
    }

 
    
    public  ArrayList<Producto> venderProducto() {
        System.out.print("Producto vendido");
        String nombre = tendero.getCuadroNombreCompra().getText();
        int id = Integer.parseInt(tendero.getCuadroIDCompra().getText());
        int  precio = Integer.parseInt(tendero.getCuadroPrecioCompra().getText());
        int cantidadV = Integer.parseInt(tendero.getCuadroCantidadCompra().getText());
        String categoria=bodega.getCuadroCategoria().getText(); 
        nuevoProducto= new Producto(cantidadV, nombre, id, precio, categoria ); 
        
        nuevoProducto.venderProductodb();
        nuevoProducto.eliminarProductobd(id);
        limpiarCamposA(); 
        limpiarCampos(); 
        return consultarProductos(); 
    }
    
     public void limpiarCamposA() {
        tendero.getCuadroNombreCompra().setText("");
        tendero.getCuadroIDCompra().setText("");
        tendero.getCuadroCantidadCompra().setText("");
        tendero.getCuadroPrecioCompra().setText("");
    }
    
    public void limpiarCampos() {
        bodega.getCuadroNombreProducto().setText("");
        bodega.getCuadroIDproducto().setText("");
        bodega.getCuadroStock().setText("");
        bodega.getCuadroCategoria().setText("");
        bodega.getCuadroPrecio().setText("");
    }
    
     public ArrayList<Producto> registrarProducto() {
         System.out.print("Producto registrado");
         String nombre = bodega.getCuadroNombreProducto().getText();
         int id = Integer.parseInt(bodega.getCuadroIDproducto().getText());
         int stock = Integer.parseInt(bodega.getCuadroStock().getText());
         String categoria = bodega.getCuadroCategoria().getText();
         int precio = Integer.parseInt(bodega.getCuadroPrecio().getText());
         nuevoProducto= new Producto();
         nuevoProducto.registrarProductobd(stock, nombre, id, precio, categoria);
         limpiarCamposA(); 
         limpiarCampos(); 
         return consultarProductos();
     }
     
  


    public ArrayList<Producto> actualizarProducto(int id) {

        String nombre = bodega.getCuadroNombreProducto().getText();
        int stock = Integer.parseInt(bodega.getCuadroStock().getText());
        String categoria = bodega.getCuadroCategoria().getText();
        int precio = Integer.parseInt(bodega.getCuadroPrecio().getText());
        
        nuevoProducto.actualizarProductobd();
        
        limpiarCampos(); 
        return consultarProductos();
    }

   public ArrayList<Producto> consultarProductos() {
       return 
       nuevoProducto.consultarProductosTodos(); 
   }
   
   public ArrayList<Producto>   buscarporId(int id){
       nuevoProducto.setId(id);
       return nuevoProducto.consultarProductosTodos(); 
   }
   
   public ArrayList<Producto> eliminarProducto() {
    int idcompra=Integer.parseInt(tendero.getCuadroIDCompra().getText()); 
    int id = Integer.parseInt(bodega.getCuadroIDproducto().getText());
    nuevoProducto.eliminarProductobd(id);
    limpiarCampos(); 
    return consultarProductos();
}

}