package ChainResponsability;

public abstract class BaseManejador {
    private ManejadorReporte siguiente;

    public abstract void manejarReporte(Reporte reporte);


}
