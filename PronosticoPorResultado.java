



public class PronosticoPorResultado implements PronosticoEstrategia {
    private  String resultadoEsperado;
    
    @Override
    public String realizarPronostico(){
        return "Pronostico por Resultado";
    }

    public String getResultadoEsperado() {
        return resultadoEsperado;
    }

    public void setResultadoEsperado(String resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
    }
}
