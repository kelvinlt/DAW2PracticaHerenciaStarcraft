/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaherenciastarcraft;

/**
 *
 * @author DAM
 */
public abstract class Unidad {
    private String nombre;
    private int victorias;
    private double ataque;
    private double defensa;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public Unidad(String nombre, int victorias, double ataque, double defensa) {
        this.nombre = nombre;
        this.victorias = victorias;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public abstract double atkTotal();
    public abstract double defTotal();
    
    
}
