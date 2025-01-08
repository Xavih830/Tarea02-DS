package FactoryMethod;
import P_SportsPredictor.Equipos;
import P_SportsPredictor.Estadistica;
import P_SportsPredictor.Pronostico;
import java.time.LocalDateTime;
import java.util.List;

public class crearEventoTennis extends FabricadeEventos{

    @Override
    public Deportes crearEvento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos,
 List<Estadistica> participantes, List<Equipos> equipos) {
        return new Tennis();
    }

} 
    

