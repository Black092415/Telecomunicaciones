import java.util.UUID;

public class Usuario {
    public UUID id;
    public String nombre = " pedro perez ";
    public String email = "usuario@gmail.com";
    public int telefono = 1232123123;


    public void MostrarDatos(){
        System.out.println(" -- datos -- \n" +
                "- Id: " + this.id +
                "- Nombre: " + this.nombre +
                "- email: " + this.email
        );
    }

}
