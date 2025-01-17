package P_SportsPredictor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private LocalDateTime fecha;
    private List<Pronostico> pronosticos;
    private List<Estadistica> estadisticas;
    private List<Equipos> equipos;
    private String marcador;
    private String resultado;
    private EstadoPronostico estado;

    public Evento(String nombre, LocalDateTime fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.pronosticos = new ArrayList<>();
        this.estadisticas = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.estado = new EstadoPendiente();
        this.resultado = null;
    }

    public Evento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos, 
                  List<Estadistica> participantes, List<Equipos> equipos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.pronosticos = pronosticos;
        this.estadisticas = participantes;
        this.equipos = equipos;
    }

    public Evento(String nombre, LocalDateTime fecha, List<Pronostico> pronosticos, 
                  List<Estadistica> participantes, List<Equipos> equipos, String marcador) {
        this(nombre, fecha, pronosticos, participantes, equipos);
        this.marcador = marcador;
    }

    public void agregarPronostico(Pronostico pronostico) {
        this.pronosticos.add(pronostico);
    }

    public void agregarEstadistica(Estadistica estadistica) {
        this.estadisticas.add(estadistica);
    }

    public void agregarEquipo(Equipos equipo) {
        this.equipos.add(equipo);
    }

    public void mostrarEstadisticas() {
        System.out.println("Estadísticas del evento:");
        for (Estadistica estadistica : estadisticas) {
            System.out.println("- " + estadistica.getDescripcion() + ": " + estadistica.getValor());
        }
    }

    public void finalizarEvento(String resultado) {
        if (estado instanceof EstadoAcertado) {
            System.out.println("El evento ya ha sido finalizado.");
            return;
        }
        this.estado = new EstadoAcertado(); 
        this.resultado = resultado; 
        System.out.println("El evento ha finalizado con resultado: " + resultado);
    }

    public String getResultado() {
        if (estado instanceof EstadoAcertado) {
            return resultado;
        } else {
            return "El evento aún no ha finalizado.";
        }
    }

    public void cerrarApuestas() {
        System.out.println("Cerrando apuestas para el evento: " + nombre);
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

    public List<Estadistica> getEstadisticas() {
        return estadisticas;
    }

    public List<Equipos> getEquipos() {
        return equipos;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public void setResultado(String resultado){
        this.resultado = resultado;
    }
}


   

