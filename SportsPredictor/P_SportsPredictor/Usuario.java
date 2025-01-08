package P_SportsPredictor;

import java.util.List;
import java.util.Scanner;

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

    public void MakePronostico(){

        Scanner scanner = new Scanner(System.in);

        EstadoPronostico estado = new EstadoPendiente();
        
        System.out.println("Ingrese el evento de la prediccion: ");
        String S_evento = scanner.nextLine();
        
        for (Evento evento : eventos) {
            if (evento.getNombre().equals(S_evento)) {
                evento = evento;
            }
        }

        System.out.println("Ingrese la categoria de la prediccion: ");
        String s_categoria = scanner.nextLine();

        CategoriaPronostico categoria = new CategoriaPronostico(s_categoria,"SSS");



        System.out.println("Ingrese la prediccion: ");
        String prediccion = scanner.nextLine();

        pronosticos.add(new Pronostico(prediccion, categoria, evento, estado, "ss"));

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
