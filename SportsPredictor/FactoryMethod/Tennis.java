package FactoryMethod;
import P_SportsPredictor.Equipos;
import P_SportsPredictor.Estadistica;
import P_SportsPredictor.Evento;
import P_SportsPredictor.Pronostico;
import java.time.LocalDateTime;
import java.util.List;

public class Tennis implements Deportes{

    @Override
    public void crearEvento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos, List<Estadistica> participantes, List<Equipos> equipos) {

        Evento evento = new Evento(nombre, fecha, pronosticos, participantes, equipos);

        System.out.println("Evento de tenis creado");
    }
   
    
}
