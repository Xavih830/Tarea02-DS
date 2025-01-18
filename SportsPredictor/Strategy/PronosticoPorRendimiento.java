package Strategy;
import P_SportsPredictor.*;

public class PronosticoPorRendimiento implements PronosticoEstrategia {
    @Override
    public boolean evaluarPronostico(Evento evento, Pronostico pronostico) {
        
        String[] prediccion = pronostico.getPrediccion().split(" ");
        String jugador = prediccion[0]; 
        int golesEsperados = Integer.parseInt(prediccion[3]); 

        for (Estadistica estadistica : evento.getEstadisticas()) {
            if (estadistica.getJugador().equals(jugador)) {
                
                return estadistica.getGoles() > golesEsperados;
            }
        }
        return false;  
    }
}

