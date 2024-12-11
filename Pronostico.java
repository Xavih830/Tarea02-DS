

public class Pronostico {
    public String descripcion;
    public PronosticoEstrategia estrategia;
    public String estado;

    public Pronostico(String descripcion, String estado, PronosticoEstrategia estrategia) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.estrategia = estrategia;
    }
    
    
    public void ejecutarEstrategia(){}

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PronosticoEstrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(PronosticoEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
