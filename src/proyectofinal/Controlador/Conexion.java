package proyectofinal.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {

    private Connection conexion;
    public String usuario = "postgres";
    public String password = "POSTGRES";

    public Conexion() {
        // No inicies la conexión aquí, hazlo según sea necesario en tus métodos.
    }

    public void abrirConexion() {
        try {
            // Registramos el driver de PostgreSQL
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver de PostgreSQL registrado correctamente.");

            // Establecemos la conexión con la base de datos
            this.conexion = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/minimarket",
                    usuario, password);

            System.out.println("Conexión a la base de datos establecida correctamente.");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al establecer la conexión: " + ex);
        }
    }

    

    public void ejecutar(String sql) {
        try (PreparedStatement stm = this.conexion.prepareStatement(sql)) {
            stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la consulta: " + ex);
        }
    }

    public ResultSet ejecutarConsulta(String sql) {
        try {
            PreparedStatement stm = this.conexion.prepareStatement(sql);
            return stm.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la consulta: " + ex);
        }
        return null;
    }

    // Otros métodos según tus necesidades

    public static void main(String[] args) {
        // Ejemplo de uso
        

        // Realizar operaciones con la base de datos

       
    }
}

