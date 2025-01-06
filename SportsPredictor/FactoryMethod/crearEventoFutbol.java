package FactoryMethod;
import java.time.LocalDateTime;

public class crearEventoFutbol extends FabricadeEventos{

    @Override
    public Deportes crearEvento(String nombre, LocalDateTime fecha) {
        return new Futbol();
    }

}