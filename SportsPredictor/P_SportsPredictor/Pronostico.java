package P_SportsPredictor;

public class Pronostico {
    private String prediccion;
    private CategoriaPronostico categoria;
    private Evento evento;
    private EstadoPronostico estado;
    private PronosticoEstrategia estrategia;


    public Pronostico(String prediccion, CategoriaPronostico categoria, Evento evento, EstadoPronostico estado,
            PronosticoEstrategia estrategia) {
        this.prediccion = prediccion;
        this.categoria = categoria;
        this.evento = evento;
        this.estado = estado;
        this.estrategia = estrategia;
    }


    public String getPrediccion() {
        return prediccion;
    }


    public void setPrediccion(String prediccion) {
        this.prediccion = prediccion;
    }


    public CategoriaPronostico getCategoria() {
        return categoria;
    }


    public void setCategoria(CategoriaPronostico categoria) {
        this.categoria = categoria;
    }


    public Evento getEvento() {
        return evento;
    }


    public void setEvento(Evento evento) {
        this.evento = evento;
    }


    public EstadoPronostico getEstado() {
        return estado;
    }


    public void setEstado(EstadoPronostico estado) {
        this.estado = estado;
    }


    public PronosticoEstrategia getEstrategia() {
        return estrategia;
    }


    public void setEstrategia(PronosticoEstrategia estrategia) {
        this.estrategia = estrategia;
    }


}
