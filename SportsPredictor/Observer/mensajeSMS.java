
package Observer;

public class mensajeSMS implements Notificadores{

    @Override
    public String enviarNotificacion(Usuario usuario, String menssaje) {
        return "Notificacion SMS";
    }
    
}
