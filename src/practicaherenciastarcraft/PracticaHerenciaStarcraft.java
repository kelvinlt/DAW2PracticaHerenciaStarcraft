/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaherenciastarcraft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author DAM
 */
public class PracticaHerenciaStarcraft {
        static ArrayList<Terran> terrans = new ArrayList<>();
        static ArrayList<Zerg> zergs = new ArrayList<>();
        static ArrayList<Protos> protos = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        try {
            String opcion =  br.readLine();
            String[] splitOpcion = splitStringX(opcion);
            while(!splitOpcion[0].equalsIgnoreCase("s")){
                switch(splitOpcion[0].toLowerCase()){
                    case "c":
                        break;
                    case "a":
                        altaEscuadron(splitOpcion);
                        break;
                    case "m":
                        break;
                }
            }
            
        } catch (Exception e) {
            
        }
//        ArrayList<String> enter = new ArrayList<>();            
//        String a="aaa aaa aaa";        
//        String algo[] = splitStringX(a);
//        String baseDatos[][]=new String[10][10];
        
    }
    public static String[] splitStringX(String algo){
        String conversor = algo;
        String[] splitString = conversor.split("");
        return splitString;
    }
    
    public static void altaEscuadron(String[] nuevo){
        switch(nuevo[1].toLowerCase()){
            case "terran":
                break;
            case "protos":
                break;
            case "zerg":
                break;
            default:
                break;
        }
    }
    public static void mejorarEscuadron(){
    
    }
    public static void mostrarClasificacion(){
        for(int i = 0; i < terrans.size(); i++){
            
        }
    }
    
}
