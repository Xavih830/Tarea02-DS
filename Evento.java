/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.deberds2p;

import java.util.Date;
import java.util.List;

/**
 *
 * @author GENERATION 10
 */
public class Evento {
    public String nombre;
    public Date fecha;
    public List<Pronostico> pronosticos;
    
    public void registrarPronostico(Pronostico pronostico){}
    public void notificarResultado(){};
}
