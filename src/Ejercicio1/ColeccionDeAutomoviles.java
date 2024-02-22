package Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ColeccionDeAutomoviles {

    TreeSet<Automovil> automovilesTree = new TreeSet<Automovil>();

    public void rellenaColeccionAutomoviles(Automovil a){
        automovilesTree.add(a);

    }
    public TreeSet<Automovil> mostrarColeccion(){
        TreeSet<Automovil> a = new TreeSet<>(new OrdenacionTreeSet());
        for (Automovil automovil:automovilesTree){
            a.add(automovil);
        }
        return a;
    }

    public static void main(String[] args) {
        ColeccionDeAutomoviles c = new ColeccionDeAutomoviles();
        Automovil a1 = new Automovil("Hyundai","kona","1234AEI",2020,280,"GASOLINA");
        Automovil a2 = new Automovil("Opel","Astra","4321AEI",2021,28,"GASOLINA");
        Automovil a3 = new Automovil("Tesla","a","9994AEI",2023,380,"ELECTRICO");
        c.rellenaColeccionAutomoviles(a1);
        c.rellenaColeccionAutomoviles(a2);
        c.rellenaColeccionAutomoviles(a3);
        System.out.println(c.mostrarColeccion());
    }
}
