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
public class Terran extends Unidad{
    private int edificios;
    private int tecnologias;

    public Terran(String nombre, int victorias, double ataque, double defensa,int edificios, int tecnologias) {
        super(nombre, victorias, ataque, defensa);
        this.edificios = edificios;
        this.tecnologias = tecnologias;
    }

    public int getEdificios() {
        return edificios;
    }

    public void setEdificios(int edificios) {
        this.edificios = edificios;
    }

    public int getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(int tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public double atkTotal() {
        return this.getAtaque() * (1+(0.50*this.tecnologias));
    }

    @Override
    public double defTotal() {
        return this.getDefensa() * (1+(0.25*this.edificios));
    }

    @Override
    public String toString() {
        return "Terran{Nombre:"+getNombre()+ "|Ataque: "+getAtaque()+"|Defensa: "+getDefensa()+"|Victorias: "+getVictorias()+"|Edificios: " + edificios + " |Tecnologias: " + tecnologias + '}';
    }
    
    
}
