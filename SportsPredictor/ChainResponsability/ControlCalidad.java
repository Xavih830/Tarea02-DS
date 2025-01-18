package ChainResponsability;

public class ControlCalidad implements ManejadorReporte {
    private ManejadorReporte siguiente;

    @Override
    public void setNext(ManejadorReporte manejador) {
        this.siguiente = manejador;
    }

    @Override
    public void manejarReporte(Reporte reporte) {
        if ("Calidad".equalsIgnoreCase(reporte.getEstado())) {
            System.out.println("Reporte manejado por Control de Calidad: " + reporte.getDetalle());
        } else if (siguiente != null) {
            siguiente.manejarReporte(reporte);
        } else {
            System.out.println("No se pudo manejar el reporte: " + reporte.getDetalle());
        }
    }
}
