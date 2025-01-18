package Observer;

import P_SportsPredictor.*;
import java.util.ArrayList;
import java.util.List;

public class ObserverNotificaciones {

    private List<Usuario> suscriptores;
    private List<Notificadores> notificadores;

    public ObserverNotificaciones() {
        this.suscriptores = new ArrayList<>();
        this.notificadores = new ArrayList<>();
    }

    public void subscribir(Usuario usuario) {
        if (!suscriptores.contains(usuario)) {
            suscriptores.add(usuario);
            System.out.println("Usuario " + usuario.getNombre() + " suscrito correctamente.");
        }
    }

    public void desubscribir(Usuario usuario) {
        if (suscriptores.contains(usuario)) {
            suscriptores.remove(usuario);
            System.out.println("Usuario " + usuario.getNombre() + " desuscrito correctamente.");
        }
    }

    public void agregarNotificador(Notificadores notificador) {
        notificadores.add(notificador);
    }

    public void notificar(String mensaje) {
        for (Usuario usuario : suscriptores) {
            for (Notificadores notificador : notificadores) {
                System.out.println(notificador.enviarNotificacion(usuario, mensaje));
            }
        }
    }
}

