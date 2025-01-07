
package chainresponsability;


public interface ManejadorReporte {

    public void manejarReporte(Reporte reporte);
    public void setNext(ManejadorReporte manejador);


}
