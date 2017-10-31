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

public class PracticaHerenciaStarcraft {

    static ArrayList<Unidad> unidades = new ArrayList<>();
    static ArrayList<Terran> terrans = new ArrayList<>();
    static ArrayList<Zerg> zergs = new ArrayList<>();
    static ArrayList<Protos> protoses = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Intro");
            String opcion = br.readLine();
            String[] splitOpcion = splitStringX(opcion);
            while (!splitOpcion[0].equalsIgnoreCase("s")) {
                switch (splitOpcion[0].toLowerCase()) {
                    case "c":
                        mostrarUnidades();
                        break;
                    case "a":
                        altaEscuadron(splitOpcion);
                        break;
                    case "m":
                        mejorarEscuadron(splitOpcion);
                        break;

                }
                System.out.println("Intro");
                opcion = br.readLine();
                splitOpcion = splitStringX(opcion);
            }

        } catch (Exception e) {
        }

    }

    public static String[] splitStringX(String algo) {
        String conversor = algo;
        String[] splitString = conversor.split(" ");
        return splitString;
    }

    public static void altaEscuadron(String[] nuevo) {
        String nombre = "";
        double atk = 0;
        double def = 0;
        int var1 = 0;
        int var2 = 0;
        int victorias = 0;

        switch (nuevo[1].toLowerCase()) {
            case "terran":
                nombre = nuevo[2];
                atk = Double.parseDouble(nuevo[3]);
                def = Double.parseDouble(nuevo[4]);
                var1 = Integer.parseInt(nuevo[5]);
                var2 = Integer.parseInt(nuevo[6]);

                Terran terran = new Terran(nombre, victorias, atk, def, var1, var2);
                unidades.add(terran);
                System.out.println("<OK: Escuadrón registrado>");
                break;
            case "protos":
                nombre = nuevo[2];
                atk = Double.parseDouble(nuevo[3]);
                def = Double.parseDouble(nuevo[4]);
                var1 = Integer.parseInt(nuevo[5]);

                Protos protos = new Protos(nombre, victorias, atk, def, var1);
                unidades.add(protos);
                System.out.println("<OK: Escuadrón registrado>");
                break;
            case "zerg":
                nombre = nuevo[2];
                atk = Double.parseDouble(nuevo[3]);
                def = Double.parseDouble(nuevo[4]);
                var1 = Integer.parseInt(nuevo[5]);
                var2 = Integer.parseInt(nuevo[6]);

                Zerg zerg = new Zerg(nombre, victorias, atk, def, var1, var2);
                unidades.add(zerg);
                System.out.println("<OK: Escuadrón registrado>");
                break;
            default:
                System.out.println("< ERROR 002: Especie incorrecta >");
                break;
        }
    }

    public static void mejorarEscuadron(String unidad[]) {
        try {
            for (Unidad u : unidades) {
                System.out.println(u);
                if (unidad[1].equals(u.getNombre())) {
                    if (u instanceof Terran) {
                        switch (unidad[2].toLowerCase()) {
                            case "tecnologias":
                                ((Terran) u).setTecnologias(Integer.parseInt(unidad[3]));
                                break;
                            case "edificios":
                                
                                break;  
                        }
                    }
                    if (u instanceof Zerg) {
                        switch (unidad[2].toLowerCase()) {
                            case "overlords":

                                break;
                            case "esbirros":

                                break;

                        }
                    }
                    if (u instanceof Protos) {
                        switch (unidad[2].toLowerCase()) {
                            case "pilones":

                                break;
                        }
                    }
                } else {
                    System.out.println("Error");
                }
            }
        } catch (Exception e) {
        }

    }

    public static void mostrarUnidades() {
        for (Unidad u : unidades) {
            System.out.println(u);
        }
    }

}
