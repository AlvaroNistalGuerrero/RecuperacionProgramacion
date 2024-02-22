package Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class cuentaPares {
    HashMap<String, Integer> resultado = new HashMap<String, Integer>();
//    public int rellenaMapa(ArrayList<Integer> list){
//        if (!list.isEmpty()){
//            for (Integer n: list) {
//                if (resultado.containsKey(n)){
//                    int num = resultado.get(n);
//                    resultado.put(n,num+1);
//                }else{
//                    resultado.put(n,1);
//
//                }
//            }
//            return 1;
//        }
//        return 0;
//    }

    public HashMap<String, Integer> cuentaPares(String [] cadena){
        int cont =0;
        String subcadena ="";
        String subcadena2 ="";
        Iterator iterator = resultado.keySet().iterator();
        while (iterator.hasNext()){
            for (int i = 0; i < cadena.length; i++) {
                subcadena = cadena[i]+cadena[i+1];
                subcadena2 = cadena[i+1]+cadena[i+2];
                if (subcadena.equals(subcadena2)){
                    cont++;
                }
                resultado.put(subcadena,cont);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        cuentaPares e = new cuentaPares();
        String [] cadenas = {"sandia","melon","pera"};

        System.out.println(e.cuentaPares(cadenas));
    }
}
