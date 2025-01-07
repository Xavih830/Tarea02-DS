package chainresponsability;


public class Soporte implements ManejadorReporte{
    private ManejadorReporte siguiente;

    @Override
    public void setNext(ManejadorReporte manejador) {
        siguiente = manejador;
    }


    @Override
    public void manejarReporte(Reporte reporte) {
        System.out.println("Manejado por Soporte");
    }

    
}
