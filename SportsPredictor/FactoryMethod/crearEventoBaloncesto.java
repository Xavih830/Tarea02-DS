package FactoryMethod;

import P_SportsPredictor.*;
import java.time.LocalDateTime;
import java.util.List;

public class crearEventoBaloncesto extends FabricadeEventos {
    @Override
    public Deportes crearEvento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos, 
                                List<Estadistica> participantes, List<Equipos> equipos) {
        Baloncesto baloncesto = new Baloncesto();
        baloncesto.crearEvento(nombre, fecha, pronosticos, participantes, equipos);
        return baloncesto;
    }
}


