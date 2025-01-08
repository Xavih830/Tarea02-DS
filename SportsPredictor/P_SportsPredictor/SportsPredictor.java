package P_SportsPredictor;

import FactoryMethod.*;
import chainresponsability.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;



public class SportsPredictor {

    
    List<Evento> eventos = new ArrayList<Evento>();

    public static void main(String[] args) {



        //FactoryMethod
        Usuario usuario1 = new Usuario("Andres Layedra", "alayedra@espol.edu.ec", 0, null);
        


        FabricadeEventos evento1 = new crearEventoBaloncesto();
        evento1.crearEvento("Baloncesto del siglo", LocalDateTime.of(2025, Month.FEBRUARY, 10, 19, 30));

        ManejadorReporte soporte = new Soporte();
        ManejadorReporte C_calidad = new ControlCalidad();


        
    }
    
}
