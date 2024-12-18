import java.util.List;

public class Equipos {
    private String nombre;
    private List<Jugador>  jugadores;

    public Equipos(String nombre, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

}
