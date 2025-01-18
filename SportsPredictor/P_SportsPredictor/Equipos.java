package P_SportsPredictor;

import java.util.ArrayList;
import java.util.List;

public class Equipos {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipos(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
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
}