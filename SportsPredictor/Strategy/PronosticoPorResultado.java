package Strategy;
import P_SportsPredictor.*;

public class PronosticoPorResultado implements PronosticoEstrategia {
    @Override
    public boolean evaluarPronostico(Evento evento, Pronostico pronostico) {
        
        String resultadoEsperado = pronostico.getPrediccion(); 
        String resultadoReal = evento.getResultado();  

        return resultadoReal.equalsIgnoreCase(resultadoEsperado);
    }
}