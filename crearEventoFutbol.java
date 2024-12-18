import java.sql.Date;

public class crearEventoFutbol extends FabricadeEventos{

    @Override
    public void crearEvento(String nombre, Date fecha) {
        System.err.println("Evento Futbol Creado");
    }

}