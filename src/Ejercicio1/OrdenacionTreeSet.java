package Ejercicio1;

import java.util.Comparator;
import java.util.Objects;

public class OrdenacionTreeSet implements Comparator<Automovil> {
    @Override
    public int compare(Automovil o1, Automovil o2) {
        if(Objects.equals(o1.getTipoDemotor(), o2.getTipoDemotor())){

            return o1.getPotencia() - o2.getPotencia();
        }
        return o1.getTipoDemotor().compareTo(o2.getTipoDemotor());
    }

}
