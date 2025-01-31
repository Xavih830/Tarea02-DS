package Observer;

import P_SportsPredictor.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ObserverNotificaciones {

    private List<Usuario> suscriptores;
    private List<Notificadores> notificadores;
    private static final Logger logger = Logger.getLogger(ObserverNotificaciones.class.getName());

    public ObserverNotificaciones() {
        this.suscriptores = new ArrayList<>();
        this.notificadores = new ArrayList<>();
    }

    // Método para suscribir un usuario
    public void subscribir(Usuario usuario) {
        if (!suscriptores.contains(usuario)) {
            suscriptores.add(usuario);
            logger.info("Usuario " + usuario.getNombre() + " suscrito correctamente.");
        }
    }

    // Método para desuscribir un usuario
    public void desubscribir(Usuario usuario) {
        if (suscriptores.contains(usuario)) {
            suscriptores.remove(usuario);
            logger.info("Usuario " + usuario.getNombre() + " desuscrito correctamente.");
        }
    }

    // Método para agregar un notificador
    public void agregarNotificador(Notificadores notificador) {
        if (!notificadores.contains(notificador)) {
            notificadores.add(notificador);
            logger.info("Notificador agregado correctamente.");
        }
    }

    // Método para eliminar un notificador
    public void eliminarNotificador(Notificadores notificador) {
        if (notificadores.contains(notificador)) {
            notificadores.remove(notificador);
            logger.info("Notificador eliminado correctamente.");
        }
    }

    // Método para notificar a los suscriptores
    public void notificar(String mensaje) {
        for (Usuario usuario : suscriptores) {
            for (Notificadores notificador : notificadores) {
                String notificacion = notificador.enviarNotificacion(usuario, mensaje);
                logger.info(notificacion);
            }
        }
    }

    // Método para obtener una copia de la lista de suscriptores (solo lectura)
    public List<Usuario> getSuscriptores() {
        return new ArrayList<>(suscriptores); // Devuelve una copia para evitar modificaciones externas
    }

    // Método para obtener una copia de la lista de notificadores (solo lectura)
    public List<Notificadores> getNotificadores() {
        return new ArrayList<>(notificadores); // Devuelve una copia para evitar modificaciones externas
    }
}