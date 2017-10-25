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
public class Zerg extends Unidad{
    private int esbirros;
    private int overlords;

    public int getEsbirros() {
        return esbirros;
    }

    public void setEsbirros(int esbirros) {
        this.esbirros = esbirros;
    }

    public int getOverlords() {
        return overlords;
    }

    public void setOverlords(int overlords) {
        this.overlords = overlords;
    }

    public Zerg(String nombre, int victorias, double ataque, double defensa,int esbirros, int overlords) {
        super(nombre, victorias, ataque, defensa);
        this.esbirros = esbirros;
        this.overlords = overlords;
    }

    @Override
    public double atkTotal() {
        return this.getAtaque() * (1+(0.15 * this.esbirros)+(0.4 * this.overlords));
    }

    @Override
    public double defTotal() {
        return this.getDefensa() * (1+(0.3*this.esbirros));
    }

    @Override
    public String toString() {
        return "Zerg{" +getNombre()+ "|esbirros=" + esbirros + ", overlords=" + overlords + '}';
    }
    
    
    
}
