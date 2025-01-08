package P_SportsPredictor;

public class EstadoAcertado implements EstadoPronostico{

    @Override
    public void gestionarEstado(Pronostico pronostico) {
        System.out.println("El pronóstico ha sido aceptado. Procesar resultados.");
        
    }
    @Override
    public String getEstado() {
        return "Acertado";
    }
}
