public class Futbol {
    private String equipo1;
    private String equipo2;
    private String estadio;
    private String fecha;
    private String hora;
    private String resultado;
    private String apuesta;
    private String ganador;
    private String perdedor;
    private String empate;
    private String golesEquipo1;
    private String golesEquipo2;
   
    public Futbol(String equipo1, String equipo2, String estadio, String fecha, String hora, String resultado, String apuesta, String ganador, String perdedor, String empate, String golesEquipo1, String golesEquipo2, String golesTotales, String golesPromedio) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.estadio = estadio;
        this.fecha = fecha;
        this.hora = hora;
        this.resultado = resultado;
        this.apuesta = apuesta;
        this.ganador = ganador;
        this.perdedor = perdedor;
        this.empate = empate;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

}
