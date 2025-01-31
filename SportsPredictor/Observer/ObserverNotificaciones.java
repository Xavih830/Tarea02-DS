package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ObserverNotificaciones {

    private List<Observer> suscriptores; // Lista de observadores genéricos
    private List<Notificadores> notificadores;
    private static final Logger logger = Logger.getLogger(ObserverNotificaciones.class.getName());

    public ObserverNotificaciones() {
        this.suscriptores = new ArrayList<>();
        this.notificadores = new ArrayList<>();
    }

    // Método para suscribir un observador
    public void subscribir(Observer observador) {
        if (!suscriptores.contains(observador)) {
            suscriptores.add(observador);
            logger.info("Observador suscrito correctamente.");
        }
    }

    // Método para desuscribir un observador
    public void desubscribir(Observer observador) {
        if (suscriptores.contains(observador)) {
            suscriptores.remove(observador);
            logger.info("Observador desuscrito correctamente.");
        }
    }

    // Método para agregar un notificador
    public void agregarNotificador(Notificadores notificador) {
        if (!notificadores.contains(notificador)) {
            notificadores.add(notificador);
            logger.info("Notificador agregado correctamente.");
        }
    }

    // Método para notificar a los observadores
    public void notificar(String mensaje) {
        for (Observer observador : suscriptores) {
            for (Notificadores notificador : notificadores) {
                String notificacion = notificador.enviarNotificacion(observador, mensaje);
                logger.info(notificacion);
            }
        }
    }

    // Método para obtener una copia de la lista de suscriptores (solo lectura)
    public List<Observer> getSuscriptores() {
        return new ArrayList<>(suscriptores); // Devuelve una copia para evitar modificaciones externas
    }

    // Método para obtener una copia de la lista de notificadores (solo lectura)
    public List<Notificadores> getNotificadores() {
        return new ArrayList<>(notificadores); // Devuelve una copia para evitar modificaciones externas
    }
}