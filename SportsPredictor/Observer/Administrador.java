package Observer;

import P_SportsPredictor.*;
import java.util.List;

public class Administrador extends Persona {

    public Administrador(String nombre, String email) {
        super(nombre, email);
    }

    public void configurarOpciones(Evento evento, List<CategoriaPronostico> opciones) {
        System.out.println("Configurando opciones para el evento: " + evento.getNombre());
        // Implementar la lógica de configuración de opciones
    }

    public void gestionarReglasPuntuacion() {
        System.out.println("Gestionando reglas de puntuación.");
        // Implementar lógica para modificar reglas de puntuación
    }
}

