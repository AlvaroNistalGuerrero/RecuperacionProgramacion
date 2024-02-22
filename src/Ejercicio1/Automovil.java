package Ejercicio1;

import java.util.Comparator;
import java.util.Objects;

public class Automovil implements Comparable<Automovil> {
    public String marca;
    public String modelo;
    public String matricula;
    public int anio_fabricacion;
    public int potencia;
    public String tipoDemotor;  //Obligo a que solo pueda ser de los tipos requeridos en el constructor
//    public String motorDie =  "DIESEL";
//    public String motorHib =  "HIBRIDO";
//
//    public String motorEle =  "ELECTRICO";


    public Automovil(String marca, String modelo, String matricula, int anio_fabricacion, int potencia, String tipoDemotor) {
        try{
            if (tipoDemotor=="GASOLINA"||tipoDemotor=="DIESEL"||tipoDemotor=="HIBRIDO"||tipoDemotor=="ELECTRICO"){
                if((anio_fabricacion >0 || anio_fabricacion<2024)&&potencia>0){
                    this.marca = marca;
                    this.modelo = modelo;
                    this.matricula = matricula;
                    this.anio_fabricacion = anio_fabricacion;
                    this.potencia = potencia;
                    this.tipoDemotor = tipoDemotor;
                }
            }
            }catch (IllegalArgumentException e){
            System.out.println("Alguno de las propiedades del vehiculo es erronea");
        }

    }
//    public Automovil(String marca, String modelo, String matricula, int anio_fabricacion, int potencia) {
//        try{
//
//            if((anio_fabricacion >0 || anio_fabricacion<2024)&&potencia>0){
//                this.marca = marca;
//                this.modelo = modelo;
//                this.matricula = matricula;
//                this.anio_fabricacion = anio_fabricacion;
//                this.potencia = potencia;
//            }
//        }catch (IllegalArgumentException e){
//            System.out.println("Alguno de las propiedades del vehiculo es erronea");
//        }
//    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipoDemotor() {
        return tipoDemotor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automovil automovil = (Automovil) o;
        return anio_fabricacion == automovil.anio_fabricacion && potencia == automovil.potencia && Objects.equals(marca, automovil.marca) && Objects.equals(modelo, automovil.modelo) && Objects.equals(matricula, automovil.matricula) && Objects.equals(tipoDemotor, automovil.tipoDemotor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, matricula, anio_fabricacion, potencia, tipoDemotor);
    }

    @Override
    public int compareTo(Automovil a) {
        if(marca == a.getMarca()){
            return getModelo().compareTo(modelo);
        }
        return a.getMarca().compareTo(marca);
    }

}
