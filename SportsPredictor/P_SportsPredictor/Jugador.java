package P_SportsPredictor;
import java.util.List;


public class Jugador {
    private String nombre;
    private String posicion;
    private List<Estadistica> estadisticas;

    public Jugador(String nombre, String posicion, List<Estadistica> estadisticas){
        this.nombre = nombre;
        this.posicion = posicion;
        this.estadisticas = estadisticas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public List<Estadistica> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<Estadistica> estadisticas) {
        this.estadisticas = estadisticas;
    }


}
