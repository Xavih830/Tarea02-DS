package FactoryMethod;

import P_SportsPredictor.*;
import java.time.LocalDateTime;
import java.util.List;

public class CrearEventoDeportivo extends FabricadeEventos {
    private Deportes deporte;

    // Constructor que recibe el tipo de deporte a crear
    public CrearEventoDeportivo(Deportes deporte) {
        this.deporte = deporte;
    }

    @Override
    public Deportes crearEvento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos, 
                                List<Estadistica> participantes, List<Equipos> equipos) {
        deporte.crearEvento(nombre, fecha, pronosticos, participantes, equipos);
        return deporte;
    }
}