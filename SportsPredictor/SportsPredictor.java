import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

import FactoryMethod.Deportes;
import FactoryMethod.FabricadeEventos;
import FactoryMethod.crearEventoBaloncesto;


public class SportsPredictor {
    public static void main(String[] args) {

               

        FabricadeEventos evento1 = new crearEventoBaloncesto();
        Deportes baloncesto = evento1.crearEvento(); 
        baloncesto.crearEvento("Baloncesto del siglo", LocalDateTime.of( 2025,Month.FEBRUARY,10,19,30));
        Deportes futbol = fabrica.crearEvento("Futbol", fecha);
        
    }
    
}
