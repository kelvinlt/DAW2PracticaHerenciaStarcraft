package practicaherenciastarcraft;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM
 */
public class Protos extends Unidad{
    private int pilones;

    public int getPilones() {
        return pilones;
    }

    public void setPilones(int pilones) {
        this.pilones = pilones;
    }

    public Protos(String nombre, int victorias, double ataque, double defensa,int pilones) {
        super(nombre, victorias, ataque, defensa);
        this.pilones = pilones;

    }    

    @Override
    public double atkTotal() {
        return this.getAtaque() * (1+(0.5*this.pilones));
    }

    @Override
    public double defTotal() {
        return this.getDefensa()* (1+(0.5*this.pilones));
    }

    @Override
    public String toString() {
        return "Protos{" +getNombre()+ "|pilones=" + pilones + '}';
    }

    
    
}
