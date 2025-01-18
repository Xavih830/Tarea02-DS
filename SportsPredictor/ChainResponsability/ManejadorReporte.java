package ChainResponsability;

public interface ManejadorReporte {
    void manejarReporte(Reporte reporte);
    void setNext(ManejadorReporte manejador);
}

