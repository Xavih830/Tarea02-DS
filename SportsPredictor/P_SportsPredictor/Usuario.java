package P_SportsPredictor;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Usuario extends Persona {
    private int puntos;
    private List<Pronostico> pronosticos;
    private static final Logger logger = Logger.getLogger(Usuario.class.getName());

    public Usuario(String nombre, String email) {
        super(nombre, email);
        this.puntos = 0;
        this.pronosticos = new ArrayList<>();
    }

    public String getPrediccion(Evento evento) {
        // Validar si el evento es nulo
        if (evento == null) {
            logger.warning("El evento proporcionado es nulo.");
            return "No se puede realizar una predicción para un evento nulo.";
        }

        // Buscar el pronóstico correspondiente al evento
        for (Pronostico pronostico : pronosticos) {
            if (pronostico.getEvento().equals(evento)) {
                return pronostico.getPrediccion(); 
            }
        }

        // Si no se encuentra un pronóstico para el evento
        return "No se ha realizado un pronóstico para este evento.";
    }

    public void recibirNotificacion(String mensaje) {
        logger.info("Usuario " + getNombre() + " recibió la notificación: " + mensaje);
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public List<Pronostico> getPronosticos() {
        return pronosticos;
    }
}

