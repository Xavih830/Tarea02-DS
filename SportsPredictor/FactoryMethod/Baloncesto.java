package FactoryMethod;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import P_SportsPredictor.*;

public class Baloncesto implements Deportes{



    @Override
    public void crearEvento(String nombre, LocalDateTime fecha) {

        List<Pronostico> pronosticos = {
            new Pronostico(),
            new Pronostico("Ganador", "Equipo B")};


        Evento evento = new Evento(nombre, fecha, List<Pronostico> pronosticos, null, null);

        System.out.println("Evento de baloncesto creado");
    }

    
}
