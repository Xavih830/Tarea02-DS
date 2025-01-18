package FactoryMethod;

import P_SportsPredictor.*;
import java.time.LocalDateTime;
import java.util.List;

public class crearEventoTennis extends FabricadeEventos {
    @Override
    public Deportes crearEvento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos, 
                                List<Estadistica> participantes, List<Equipos> equipos) {
        Tennis tennis = new Tennis();
        tennis.crearEvento(nombre, fecha, pronosticos, participantes, equipos);
        return tennis;
    }
}
 
    

