package chainresponsability;

public class ControlCalidad implements ManejadorReporte{
    private ManejadorReporte siguiente;

    @Override
    public void setNext(ManejadorReporte manejador) {
        if(siguiente == null){
            siguiente = manejador;
        }
    }
    
    @Override
    public void manejarReporte(Reporte reporte) {
        System.out.println("Reporte Manejado por Control Calidad");
    }


}