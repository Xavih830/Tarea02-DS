import java.sql.Date;

public class crearEventoBaloncesto extends FabricadeEventos{

    @Override
    public void crearEvento(String nombre, Date fecha) {
        System.out.println("Evento Baloncesto Creado");
    }

}