
/**
 *
 * @author GENERATION 10
 */
public class Reporte {
    public String detalle;
    public String estado;
    
    public Reporte(String detalle, String estado){
        this.detalle = detalle;
        this.estado = estado;
    }
    public String obtenerDetalle(){
        return detalle;
    }
}
