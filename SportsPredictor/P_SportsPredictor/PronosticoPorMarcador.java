package P_SportsPredictor;

public class PronosticoPorMarcador implements PronosticoEstrategia {
    
    private  int marcadorEsperado;
    
    @Override
    public String realizarPronostico(){
        return "PronosticoPorMarcador";
    }

    public int getMarcadorEsperado() {
        return marcadorEsperado;
    }

    public void setMarcadorEsperado(int marcadorEsperado) {
        this.marcadorEsperado = marcadorEsperado;
    }
}
