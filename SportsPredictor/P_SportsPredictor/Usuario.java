package P_SportsPredictor;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private int puntos;
    private List<Pronostico> pronosticos;

    public Usuario(String nombre, String email) {
        super(nombre, email);
        this.puntos = 0;
        this.pronosticos = new ArrayList<>();
    }

    
    
    public String getPrediccion(Evento evento) {
        for (Pronostico pronostico : pronosticos) {
            if (pronostico.getEvento().equals(evento)) {
                return pronostico.getPrediccion(); 
            }
        }
        return "No se ha realizado un pronóstico para este evento.";
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println("Usuario " + getNombre() + " recibió la notificación: " + mensaje);
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

