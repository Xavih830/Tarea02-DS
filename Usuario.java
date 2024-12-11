

import java.util.List;

public class Usuario extends Persona{
    int puntos;
    List<Pronostico> pronosticos;

    public Usuario(String nombre, String email, int puntos, List<Pronostico> pronosticos) {
        super(nombre, email);
        this.puntos = puntos;
        this.pronosticos = pronosticos;
    }

    public int getPuntos() {
        return puntos;
    }


    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }


    public List<Pronostico> getPronosticos() {
        return pronosticos;
    }


    public void setPronosticos(List<Pronostico> pronosticos) {
        this.pronosticos = pronosticos;
    }

    
    
    
}
