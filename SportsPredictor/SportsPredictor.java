import FactoryMethod.FabricadeEventos;
import FactoryMethod.crearEventoBaloncesto;
import java.time.LocalDateTime;
import java.time.Month;


public class SportsPredictor {
    public static void main(String[] args) {


        FabricadeEventos evento1 = new crearEventoBaloncesto();
        evento1.crearEvento("Baloncesto del siglo", LocalDateTime.of(2025, Month.FEBRUARY, 10, 19, 30));


        
    }
    
}
