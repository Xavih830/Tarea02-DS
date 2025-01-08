package P_SportsPredictor;

import FactoryMethod.*;
import chainresponsability.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;



public class SportsPredictor {

    
    protected List<Evento> eventos = new ArrayList<Evento>();
    protected List<Pronostico> pronosticos = new ArrayList<Pronostico>();
    protected List<Estadistica> estadisticas = new ArrayList<Estadistica>();
    protected List<Equipos> equipos = new ArrayList<Equipos>();
    protected List<Usuario> usuarios = new ArrayList<Usuario>();
    protected List<CategoriaPronostico> categorias = new ArrayList<CategoriaPronostico>();
    
    public List<Evento> getEventos() {
        return eventos;
    }

    public static void main(String[] args) {



        //FactoryMethod
        Usuario usuario1 = new Usuario("Andres Layedra", "alayedra@espol.edu.ec", 0, null);
        


        FabricadeEventos evento1 = new crearEventoBaloncesto();
        evento1.crearEvento("Baloncesto del siglo", LocalDateTime.of(2025, Month.FEBRUARY, 10, 19, 30), null, null, null);

        ManejadorReporte soporte = new Soporte();
        ManejadorReporte C_calidad = new ControlCalidad();


        
    }
    
}
