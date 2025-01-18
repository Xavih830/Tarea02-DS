package FactoryMethod;

import P_SportsPredictor.*;
import java.time.LocalDateTime;
import java.util.List;

public class crearEventoFutbol extends FabricadeEventos {
    @Override
    public Deportes crearEvento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos, 
                                List<Estadistica> participantes, List<Equipos> equipos) {
        Futbol futbol = new Futbol();
        futbol.crearEvento(nombre, fecha, pronosticos, participantes, equipos);
        return futbol;
    }
}
