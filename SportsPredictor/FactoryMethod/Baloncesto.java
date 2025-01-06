package FactoryMethod;
import java.time.LocalDateTime;

public class Baloncesto implements Deportes{

    @Override
    public void crearEvento(String nombre, LocalDateTime fecha) {
        System.out.println("Evento de baloncesto creado");
    }

    
}
