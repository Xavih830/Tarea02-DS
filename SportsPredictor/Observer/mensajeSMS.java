package Observer;

import P_SportsPredictor.*;

public class mensajeSMS implements Notificadores {

    @Override
    public String enviarNotificacion(Usuario usuario, String mensaje) {
        return "Enviando notificación por SMS a " + usuario.getNombre() + ": " + mensaje;
    }
}

