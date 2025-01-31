package P_SportsPredictor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Evento {
    private String nombre;
    private LocalDateTime fecha;
    private List<Pronostico> pronosticos;
    private List<Estadistica> estadisticas;
    private List<Equipos> equipos;
    private String marcador;
    private String resultado;
    private EstadoPronostico estado;

    // Logger para la clase
    private static final Logger logger = Logger.getLogger(Evento.class.getName());

    // Constante para el estado acertado
    private static final EstadoPronostico ESTADO_ACERTADO = new EstadoAcertado();

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
        logger.info("Estadísticas del evento:");
        for (Estadistica estadistica : estadisticas) {
            logger.info("- " + estadistica.getDescripcion() + ": " + estadistica.getValor());
        }
    }

    public void finalizarEvento(String resultado) {
        if (estado instanceof EstadoAcertado) {
            logger.info("El evento ya ha sido finalizado.");
            return;
        }
        this.estado = ESTADO_ACERTADO; // Usamos la constante en lugar de instanciar directamente
        this.resultado = resultado; 
        logger.info("El evento ha finalizado con resultado: " + resultado);
    }

    public String getResultado() {
        if (estado instanceof EstadoAcertado) {
            return resultado;
        } else {
            return "El evento aún no ha finalizado.";
        }
    }

    public void cerrarApuestas() {
        logger.info("Cerrando apuestas para el evento: " + nombre);
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