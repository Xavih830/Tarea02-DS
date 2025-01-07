import FactoryMethod.*;
import chainresponsability.*;
import java.time.LocalDateTime;
import java.time.Month;


public class SportsPredictor {
    public static void main(String[] args) {


        FabricadeEventos evento1 = new crearEventoBaloncesto();
        evento1.crearEvento("Baloncesto del siglo", LocalDateTime.of(2025, Month.FEBRUARY, 10, 19, 30));

        ManejadorReporte soporte = new Soporte();
        ManejadorReporte C_calidad = new ControlCalidad();


        
    }
    
}
