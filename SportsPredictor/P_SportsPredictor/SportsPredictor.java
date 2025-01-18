package P_SportsPredictor;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import Strategy.*;

public class SportsPredictor {

    public static List<Evento> getEventos() {
        List<Evento> eventos = new ArrayList<>();
  
        List<Pronostico> pronosticosFutbol = new ArrayList<>();
        List<Estadistica> estadisticasFutbol = new ArrayList<>();
        List<Equipos> equiposFutbol = new ArrayList<>();
        Evento futbolEvento = new Evento("Partido Futbol", LocalDateTime.of(2025, 6, 15, 19, 0), pronosticosFutbol, estadisticasFutbol, equiposFutbol);
        eventos.add(futbolEvento);
        
        List<Pronostico> pronosticosBaloncesto = new ArrayList<>();
        List<Estadistica> estadisticasBaloncesto = new ArrayList<>();
        List<Equipos> equiposBaloncesto = new ArrayList<>();
        Evento baloncestoEvento = new Evento("Partido Baloncesto", LocalDateTime.of(2025, 7, 20, 21, 0), pronosticosBaloncesto, estadisticasBaloncesto, equiposBaloncesto);
        eventos.add(baloncestoEvento);

        return eventos;
    }

    public static void main(String[] args) {

        List<Evento> eventos = getEventos();

        Usuario usuario = new Usuario("Juan Perez", "juanperez@example.com");

        CategoriaPronostico categoriaFutbol = new CategoriaPronostico("Resultado Exacto", "Predicción del resultado final");
        PronosticoEstrategia estrategiaFutbol = new PronosticoPorResultado();
        Pronostico pronosticoFutbol = new Pronostico("2-1", categoriaFutbol, eventos.get(0), new EstadoPendiente(), estrategiaFutbol);
        usuario.getPronosticos().add(pronosticoFutbol);

        eventos.get(0).setResultado("2-1");
        boolean resultadoEvaluacion = pronosticoFutbol.evaluarPronostico();
        if (resultadoEvaluacion) {
            System.out.println("¡Pronóstico correcto! El usuario ganó el pronóstico.");
        } else {
            System.out.println("Pronóstico incorrecto.");
        }

        CategoriaPronostico categoriaBaloncesto = new CategoriaPronostico("Puntos Totales", "Predicción de puntos totales");
        PronosticoEstrategia estrategiaBaloncesto = new PronosticoPorMarcador();
        Pronostico pronosticoBaloncesto = new Pronostico("210", categoriaBaloncesto, eventos.get(1), new EstadoPendiente(), estrategiaBaloncesto);
        usuario.getPronosticos().add(pronosticoBaloncesto);

        eventos.get(1).setResultado("210");
        boolean resultadoEvaluacionBaloncesto = pronosticoBaloncesto.evaluarPronostico();
        if (resultadoEvaluacionBaloncesto) {
            System.out.println("¡Pronóstico correcto! El usuario ganó el pronóstico de baloncesto.");
        } else {
            System.out.println("Pronóstico de baloncesto incorrecto.");
        }
    }
}


