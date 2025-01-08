package P_SportsPredictor;

import java.util.Date;
import java.util.List;
 

public class Evento {
    private String nombre;
    private Date fecha;
    private List<Pronostico> pronosticos;
    private List<Estadistica> estadisticas;
    private List<Equipos> equipos;


public Evento(String nombre, Date fecha, List<Pronostico> pronosticos, List<Estadistica> estadisticas, List<Equipos> equipos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.pronosticos = pronosticos;
        this.estadisticas = estadisticas;
        this.equipos = equipos;
    }


    public void mostrarEstadisticas(){}
    public void cerrarApuestas(){};



    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public List<Pronostico> getPronosticos() {
        return pronosticos;
    }
    public void setPronosticos(List<Pronostico> pronosticos) {
        this.pronosticos = pronosticos;
    }
    public List<Estadistica> getEstadisticas() {
        return estadisticas;
    }
    public void setEstadisticas(List<Estadistica> estadisticas) {
        this.estadisticas = estadisticas;
    }
    public List<Equipos> getEquipos() {
        return equipos;
    }
    public void setEquipos(List<Equipos> equipos) {
        this.equipos = equipos;
    }

}
