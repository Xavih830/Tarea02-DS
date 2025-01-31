package FactoryMethod;

import P_SportsPredictor.*;
import java.time.LocalDateTime;
import java.util.List;

public abstract class EventoDeportivo {
    public abstract Deportes crearEvento(String nombre, LocalDateTime fecha, 
                                         List<Pronostico> pronosticos, List<Estadistica> participantes, 
                                         List<Equipos> equipos);
}
