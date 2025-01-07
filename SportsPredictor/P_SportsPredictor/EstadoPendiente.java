package P_SportsPredictor;

public class EstadoPendiente implements EstadoPronostico {

    @Override
    public void gestionarEstado(Pronostico pronostico) {
        System.out.println("Pronostico Pendiente");
    }
    
}
