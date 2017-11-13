/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaherenciastarcraft;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author DAM
 */
public class EjemploHash {
    public static void main(String[] args){
        HashMap<String, Unidad> bichos = new HashMap<>();
        
        Terran t = new Terran("kek",23,10,0,20,8);
        bichos.put(t.getNombre(), t);
        
        Zerg z = new Zerg("zez",13,10,0,20,8);
        bichos.put(z.getNombre(), z);
        bichos.put(z.getNombre(), z);
        Iterator i = bichos.keySet().iterator();
        while(i.hasNext()){
            String clave = (String) i.next();
            System.out.println("Clave: " + clave);
            Unidad u = bichos.get(clave);
            System.out.println(u);
        }
        
        
        
        
    }
}
