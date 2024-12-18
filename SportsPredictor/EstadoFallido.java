public class EstadoFallido implements EstadoPronostico{

    @Override
    public void gestionarEstado(Pronostico pronostico) {
        System.out.println("Pronostico Fallido");
    }
    
}
