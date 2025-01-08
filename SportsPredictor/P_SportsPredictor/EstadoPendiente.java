package P_SportsPredictor;

public class EstadoPendiente implements EstadoPronostico {

    @Override
    public void gestionarEstado(Pronostico pronostico) {
        System.out.println("El pronóstico está pendiente. Esperar confirmación.");
    }

    @Override
    public String getEstado() {
        return "Pendiente";
    }
}
