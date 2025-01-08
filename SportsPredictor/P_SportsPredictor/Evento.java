package P_SportsPredictor;

import java.time.LocalDateTime;
import java.util.List;
 

public class Evento {
    private String nombre;
    private LocalDateTime fecha;
    private List<Pronostico> pronosticos;
    private List<Estadistica> estadisticas;
    private List<Equipos> equipos;


public Evento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos, List<Estadistica> estadisticas, List<Equipos> equipos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.pronosticos = pronosticos;
        this.estadisticas = estadisticas;
        this.equipos = equipos;
    }


    public void mostrarEstadisticas(){}
    public void cerrarApuestas(){};

    public int EncontrarEvento(String nombreEvento){
        int i = 0;
        SportsPredictor S = new SportsPredictor();
        List<Evento> eventos = S.getEventos();  
        String S_evento = nombreEvento;
        for (Evento evento : eventos) {
            if( evento.getNombre().equals(S_evento) ) {
                i = eventos.indexOf(evento);
            }else{
                System.out.println("Evento no encontrado");
            }
        }
        return i;
        
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
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
