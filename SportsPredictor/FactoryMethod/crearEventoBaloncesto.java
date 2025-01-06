package FactoryMethod;
import java.time.LocalDateTime;

public class crearEventoBaloncesto extends FabricadeEventos{
    
    @Override
    public Deportes crearEvento(String nombre, LocalDateTime fecha) {
        return new Baloncesto(); 
    }

}

