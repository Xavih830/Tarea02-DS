package Strategy;
import P_SportsPredictor.*;

public class PronosticoPorMarcador implements PronosticoEstrategia {
    public boolean evaluarPronostico(Evento evento, Pronostico pronostico) {
        return evento.getMarcador().equalsIgnoreCase(pronostico.getPrediccion());
    }
}
