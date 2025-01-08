package P_SportsPredictor;

public class EstadoPendiente extends EstadoPronostico {

    @Override
    public EstadoPronostico gestionarEstado(Pronostico pronostico) {
        return new EstadoPendiente();
    }

    public EstadoPendiente(){
        this.estado = "Pendiente";
    }




    
}
