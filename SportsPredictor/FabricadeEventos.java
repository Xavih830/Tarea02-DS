import java.sql.Date;

public abstract class FabricadeEventos implements Deportes{
    
    public abstract void crearEvento(String nombre, Date fecha);
} 