package P_SportsPredictor;

public class Estadistica {
    private String descripcion;
    private double valor;
    private String jugador; 
    private int goles; 

    public Estadistica(String descripcion, double valor, String jugador, int goles) {
        this.jugador = jugador;
        this.goles = goles;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getJugador() {
        return jugador;
    }

    public int getGoles() {
        return goles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}