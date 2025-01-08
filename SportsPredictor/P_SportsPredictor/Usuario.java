package P_SportsPredictor;

import java.util.List;

public class Usuario extends Persona{
    private int puntos;
    private List<Pronostico> pronosticos;

    public Usuario(String nombre, String email, int puntos, List<Pronostico> pronosticos) {
        super(nombre, email);
        this.puntos = puntos;
        this.pronosticos = pronosticos;
    }
    
    public void recibirNotificacion(String mensaje){

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

    
}
