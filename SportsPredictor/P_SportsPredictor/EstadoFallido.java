package P_SportsPredictor;

public class EstadoFallido extends EstadoPronostico{

    @Override
    public void gestionarEstado(Pronostico pronostico) {
        System.out.println("Pronostico Fallido");
    }
    
}
