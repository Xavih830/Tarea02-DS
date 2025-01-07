package ChainResponsability;


public class Reporte {
    private  String detalle;
    private  String estado;
    
    public Reporte(String detalle, String estado){
        this.detalle = detalle;
        this.estado = estado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
