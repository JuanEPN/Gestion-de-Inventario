package proyectofinal;
import proyectofinal.Controlador.Conexion;
import proyectofinal.Vista.Login; 

public class Proyectofinal {
    public static void main(String[] args) {
        Login start = new Login();
        start.setVisible(true);
        Conexion conexion = new Conexion();
        conexion.abrirConexion();
    }
}