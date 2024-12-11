



public class PronosticoPorResultado implements PronosticoEstrategia {
    public String resultadoEsperado;
    
    @Override
    public String realizarPronostico(){
        return "Pronostico por Resultado";
    }
}
