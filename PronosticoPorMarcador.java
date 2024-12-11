

public class PronosticoPorMarcador implements PronosticoEstrategia {
    
    public int marcadorEsperado;
    
    @Override
    public String realizarPronostico(){
        return "PronosticoPorMarcador";
    }
}
