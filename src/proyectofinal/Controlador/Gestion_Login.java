package proyectofinal.Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import proyectofinal.Vista.Login;
import proyectofinal.Vista.Vistaadministrador;
import proyectofinal.Vista.Vistabodega;
import proyectofinal.Vista.Vistatendero;

public final class Gestion_Login {
    
    Login login = new Login();
    Conexion conexion = new Conexion(); 
    
    public void entrar () throws SQLException {
        String usuario = login.getCuadroIDLogin().getText();
        String contraseña = login.getCuadroContraseña().getText();
        String cargoUsuario = (String) login.getRoleslist().getSelectedItem();
        
        String consulta = "SELECT * FROM usuarios WHERE usuario = '"+ usuario +"' AND contraseña = '"+ contraseña +"' AND cargo = '"+ cargoUsuario +"'";
        
        
        ResultSet resultado = conexion.ejecutarConsulta(consulta);
        if (resultado.next()) {
            if ("Administrador".equals(cargoUsuario)){
                Vistaadministrador admin = new Vistaadministrador();
                admin.setVisible(true);
            }
            else if ("Tendero".equals(cargoUsuario)){
                Vistatendero tendero = new Vistatendero();
                tendero.setVisible(true);
            }
            else if ("Bodega".equals(cargoUsuario)){
                Vistabodega bodega = new Vistabodega();
                bodega.setVisible(true);
            }
        } else {
        System.out.println("Credenciales incorrectas o usuario no encontrado");
        }
    }
}