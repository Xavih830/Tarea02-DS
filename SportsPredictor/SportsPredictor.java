import java.util.Date;


public class SportsPredictor {
    public static void main(String[] args) {

        Evento evento1 = new Evento() ;
        evento1.cerrarApuestas();
        
        

        FabricadeEventos fabrica = new FabricadeEventos() {
            @Override
            public void crearEvento(String nombre, java.sql.Date fecha) {
                System.out.println("Evento creado: " + nombre + " " + fecha);
            }
        };        

        fabrica.crearEvento("Evento1", new java.sql.Date(new Date().getTime()));
        fabrica.crearEvento("Evento2", new java.sql.Date(new Date().getTime()));
        
    }
    
}
