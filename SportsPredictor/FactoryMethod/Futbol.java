package FactoryMethod;

import P_SportsPredictor.*;
import java.time.LocalDateTime;
import java.util.List;

public class Futbol implements Deportes {
    @Override
    public void crearEvento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos, 
                            List<Estadistica> participantes, List<Equipos> equipos) {
        Evento evento = new Evento(nombre, fecha, pronosticos, participantes, equipos);
        System.out.println("Evento de fútbol creado: " + nombre);
    }
}

