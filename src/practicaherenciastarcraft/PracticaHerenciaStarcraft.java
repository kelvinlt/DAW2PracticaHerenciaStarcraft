package practicaherenciastarcraft;

import Exception.ExceptionSc2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PracticaHerenciaStarcraft {

    //Al comenzar la practica llame a escuadron unidades sin querer. Me he dado cuenta tarde para rectificar todos los nombres
    static ArrayList<Unidad> unidades = new ArrayList<>();

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

    //Metodo para hace split
    public static String[] splitStringX(String algo) {
        String conversor = algo;
        String[] splitString = conversor.split(" ");
        return splitString;
    }

    //Metodo para introducir una nueva unidad/escuadron
    public static void altaEscuadron(String[] nuevo) {
        String nombre = "";
        double atk = 0;
        double def = 0;
        int var1 = 0;
        int var2 = 0;
        int victorias = 0;
        try {
            //nuevo[1] es el tipo que es la unidad un ejemplo seria terran
            switch (nuevo[1].toLowerCase()) {
                case "terran":
                    nombre = nuevo[2];
                    atk = Double.parseDouble(nuevo[3]);
                    def = Double.parseDouble(nuevo[4]);
                    var1 = Integer.parseInt(nuevo[5]);
                    var2 = Integer.parseInt(nuevo[6]);
                    //throw new ExceptionSc2(1);

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
                    throw new ExceptionSc2(2);
            }
        } catch (Exception e) {
        }

    }

    //Metodo para mejorar un escuadron/unidad
    public static void mejorarEscuadron(String unidad[]) {
        try {
            for (Unidad u : unidades) {
                if (unidad[1].equals(u.getNombre())) {
                    if (u instanceof Terran) {
                        switch (unidad[2].toLowerCase()) {
                            case "tecnologias":
                                ((Terran) u).setTecnologias(Integer.parseInt(unidad[3]));
                                break;
                            case "edificios":
                                ((Terran) u).setEdificios(Integer.parseInt(unidad[3]));
                                break;
                        }
                    }
                    if (u instanceof Zerg) {
                        switch (unidad[2].toLowerCase()) {
                            case "overlords":
                                ((Zerg) u).setOverlords(Integer.parseInt(unidad[3]));
                                break;
                            case "esbirros":
                                ((Zerg) u).setEsbirros(Integer.parseInt(unidad[3]));
                                break;
                        }
                    }
                    if (u instanceof Protos) {
                        switch (unidad[2].toLowerCase()) {
                            case "pilones":
                                ((Protos) u).setPilones(Integer.parseInt(unidad[3]));
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

    //Metodo para registrar combate con sus asaltos
    public static void registrarBatalla(String equipos[]) {
        try {

        } catch (Exception e) {
        }

    }

    public static void mostrarUnidades() {
        String firstName = null;
        String secondName = null;
        String thirdName = null;
        int firstVic = 0;
        int secondVic = 0;
        int thirdVic = 0;

        try {
            for (int i = 0; i < 3; i++) {
                for (Unidad u : unidades) {
                    if (!u.getNombre().equals(firstName) || !u.getNombre().equals(secondName) || !u.getNombre().equals(thirdName)) {
                        if (u.getVictorias() > firstVic) {
                            firstName = u.getNombre();
                            firstVic = u.getVictorias();
                        }

                    } else {
                    }
                }
            }
        } catch (Exception e) {
        }

    }

    //Metodo de prueba para añadir victorias
    public static void addVictoriasTest(String unidad[]) {
        for (Unidad u : unidades) {
            try {
                if (unidad[1].equals(u.getNombre())) {
                    u.setVictorias(10);
                    System.out.println(u);
                } else {
                    System.out.println("Nada de add victorias");
                }
            } catch (Exception e) {
            }

        }
    }

    public static int randomNum() {
        int min = 0;
        int max = 9;
        int temp = ThreadLocalRandom.current().nextInt(min, max + 1);

        return temp;
    }

    public static void combate(String wan, String two) {
        int asaltosMax = 5;
        int asaltoActual = 0;
        int victoriasWan = 0;
        int victoriasTwo = 0;
        
        for(Unidad u :unidades){
            if(wan.equals(u.getNombre())){
                if(u instanceof Terran){
                
                }
                if(u instanceof Protos){
                
                }
                if(u instanceof Zerg){
                
                }
            }
        }
        
        while (!(asaltoActual > asaltosMax)) {
            asaltoActual++;

            int wanRandom = randomNum();
            int twoRandom = randomNum();

            int valorAtkWan = 0;
            int valorAtkTwo = 0;

        }

    }

    public static Unidad instanceOfSomething(Unidad n) {
        if (n instanceof Terran) {
            Terran t = new Terran(n.getNombre(), n.getVictorias(), n.getAtaque(), n.getDefensa(), ((Terran) n).getEdificios(), ((Terran) n).getTecnologias());
            return t;
        }
        if (n instanceof Protos) {
            Protos p = new Protos(n.getNombre(), n.getVictorias(), n.getAtaque(), n.getDefensa(), ((Protos) n).getPilones());
            return p;
        }
        if (n instanceof Zerg) {
            Zerg z = new Zerg(n.getNombre(), n.getVictorias(), n.getAtaque(), n.getDefensa(), ((Zerg) n).getEsbirros(), ((Zerg) n).getOverlords());
            return z;
        } else {
            return null;
        }
    }

}
