package SportsPredictor;

public class EstadoAcertado implements EstadoPronostico{

    @Override
    public void gestionarEstado(Pronostico pronostico) {
        System.out.println("Pronostico Acertado");
        
    }
}
