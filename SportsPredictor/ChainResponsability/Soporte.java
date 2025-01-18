package ChainResponsability;

public class Soporte implements ManejadorReporte {
    private ManejadorReporte siguiente;

    @Override
    public void setNext(ManejadorReporte manejador) {
        this.siguiente = manejador;
    }

    @Override
    public void manejarReporte(Reporte reporte) {
        if ("Soporte".equalsIgnoreCase(reporte.getEstado())) {
            System.out.println("Reporte manejado por Soporte: " + reporte.getDetalle());
        } else if (siguiente != null) {
            siguiente.manejarReporte(reporte);
        } else {
            System.out.println("No se pudo manejar el reporte: " + reporte.getDetalle());
        }
    }
}

