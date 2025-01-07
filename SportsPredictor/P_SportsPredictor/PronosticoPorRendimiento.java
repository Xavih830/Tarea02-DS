package P_SportsPredictor;

public class PronosticoPorRendimiento implements PronosticoEstrategia {
    private  String rendimiento;
    
    @Override
    public String realizarPronostico(){
        return "Pronostico por Rendimiento";
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }
}

