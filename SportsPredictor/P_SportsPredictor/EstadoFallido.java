package P_SportsPredictor;

public class EstadoFallido implements  EstadoPronostico{

    @Override
    public void gestionarEstado(Pronostico pronostico) {
        System.out.println("El pronóstico ha fallado. Notificar al usuario.");
    }

    @Override
    public String getEstado() {
    return "Fallido"; }

    
}
