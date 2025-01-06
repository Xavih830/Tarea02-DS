package FactoryMethod;
import java.time.LocalDateTime;

public class crearEventoTennis extends FabricadeEventos{

    @Override
    public Deportes crearEvento( String nombre, LocalDateTime fecha) {
        return new Tennis();
    }

} 
    

