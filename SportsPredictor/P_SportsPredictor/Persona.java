
package P_SportsPredictor;

public class Persona {
    private final String nombre; // Atributo final para evitar modificaciones
    private final String email;  // Atributo final para evitar modificaciones

    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    // Eliminados los setters innecesarios
}