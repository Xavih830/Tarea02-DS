package FactoryMethod;
import java.time.LocalDateTime;

public class crearEventoBaloncesto extends FabricadeEventos{

    @Override
    public Deportes crearEvento() {
        return new Baloncesto(); 
    }

}