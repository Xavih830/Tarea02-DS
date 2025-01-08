package P_SportsPredictor;

public abstract class EstadoPronostico {
    String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract  EstadoPronostico gestionarEstado(Pronostico pronostico);

    
}
