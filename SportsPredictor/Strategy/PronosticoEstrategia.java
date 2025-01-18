package Strategy;
import P_SportsPredictor.*;

public interface PronosticoEstrategia {
    boolean evaluarPronostico(Evento evento, Pronostico pronostico);
}