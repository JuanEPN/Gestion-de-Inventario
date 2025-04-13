package proyectofinal.Controlador;

import proyectofinal.Vista.Login;
import proyectofinal.Vista.Vistaadministrador;
import proyectofinal.Vista.Vistabodega;
import proyectofinal.Vista.Vistatendero;

public class Gestion {
    private final Login ingresar;
    private final Conexion entrar;
    private final Vistabodega bodega;
    private final Vistatendero tendero;
    private final Vistaadministrador administrar;

    public Gestion(){
        System.out.println("Punto de control B");
        ingresar = new Login();
        System.out.println("Punto de control c");
        entrar = new Conexion();
        System.out.println("Punto de control d");
        bodega = new Vistabodega();
        System.out.println("Punto de control e");
        tendero = new Vistatendero();
        System.out.println("Punto de control f");
        administrar = new Vistaadministrador();
        System.out.println("Punto de control g");
    }

    private static final String USUARIO_ADMIN = "admin";
    private static final String CONTRASENA_ADMIN = "admin123";

    private static final String USUARIO_TENDERO = "tendero";
    private static final String CONTRASENA_TENDERO = "tendero123";

    private static final String USUARIO_BODEGA = "bodega";
    private static final String CONTRASENA_BODEGA = "bodega123";

    // Resto de tu código...

    public void iniciar(String valorSeleccionado, String idSeleccionado, String contraseñaSeleccionada) {
        ingresar.setVisible(true);

        try {
            System.out.println("Punto de control D");
        if ((USUARIO_ADMIN.equals(idSeleccionado) && CONTRASENA_ADMIN.equals(contraseñaSeleccionada))){
                        System.out.println("Punto de control D");
                        switch (valorSeleccionado) {
                    case "Administrador" -> {
                        System.out.println("Punto de control D");
                        administrar.setVisible(true);
                        break;
                    }
                    case "Tendero" -> {
                        tendero.setVisible(true);
                        break;
                    }
                    case "Bodega" -> {
                        bodega.setVisible(true);
                        break;
                    }
                    // Otras opciones del switch
                }
                ingresar.dispose();
            }
        else if ((USUARIO_TENDERO.equals(idSeleccionado) && CONTRASENA_TENDERO.equals(contraseñaSeleccionada))) {

                        tendero.setVisible(true);
       

                // Cerrar la ventana de login después de seleccionar un rol
                ingresar.dispose();
            } else if((USUARIO_BODEGA.equals(idSeleccionado) && CONTRASENA_BODEGA.equals(contraseñaSeleccionada))){

                        bodega.setVisible(true);
                        ingresar.dispose();} 
         else{
                // Mostrar mensaje de error si las credenciales son incorrectas
                System.out.println("Credenciales incorrectas. Por favor, inténtelo de nuevo.");
            }
    }finally{}
            
        
 
        

    }
}

    