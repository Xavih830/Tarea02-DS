package Observer;

import P_SportsPredictor.*;

public class mensajeEmail implements Notificadores {

    @Override
    public String enviarNotificacion(Usuario usuario, String mensaje) {
        return "Enviando notificación por Email a " + usuario.getEmail() + ": " + mensaje;
    }
}

