/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.deberds2p;

/**
 *
 * @author GENERATION 10
 */
public class PronosticoPorMarcador implements PronosticoEstrategia {
    
    public int marcadorEsperado;
    
    @Override
    public String realizarPronostico(){
        return "PronosticoPorMarcador";
    }
}
