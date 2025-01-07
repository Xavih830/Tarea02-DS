package chainresponsability;

public class BaseManejador implements ManejadorReporte{
    private ManejadorReporte siguiente;



    @Override
    public void setNext(ManejadorReporte manejador) {
        siguiente = manejador;
    }
    
    @Override
    public void manejarReporte(Reporte reporte) {
        System.out.println("Reporte Manejado por "+ siguiente);
    }
    



}
