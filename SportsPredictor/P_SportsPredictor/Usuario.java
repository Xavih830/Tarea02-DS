package P_SportsPredictor;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import Observer.Observer;

public class Usuario extends Persona implements Observer {
    private int puntos;
    private List<Pronostico> pronosticos;
    private static final Logger logger = Logger.getLogger(Usuario.class.getName());

    public Usuario(String nombre, String email) {
        super(nombre, email);
        this.puntos = 0;
        this.pronosticos = new ArrayList<>();
    }

    @Override
    public void actualizar(String mensaje) {
        logger.info("Usuario " + getNombre() + " recibió la notificación: " + mensaje);
    }

    // Resto de los métodos de Usuario...
}