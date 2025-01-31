package FactoryMethod;

import P_SportsPredictor.*;
import java.time.LocalDateTime;
import java.util.List;

public interface DeporteFactory {
    void crearEvento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos, 
                     List<Estadistica> participantes, List<Equipos> equipos);
}

