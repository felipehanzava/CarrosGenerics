package ebac.modulo17.hz.cargenerics.buildercar;

import ebac.modulo17.hz.cargenerics.carros.C180Car;
import ebac.modulo17.hz.cargenerics.carros.Compass;
import ebac.modulo17.hz.cargenerics.carros.NivusCar;
import ebac.modulo17.hz.cargenerics.factory.Car;

public class GenericBuilder<T> extends Car {

//    T carro;
//
//    public GenericBuilder(Class nome) {
//        String carroClass = nome.getClass().getName();
//        if (carroClass.compareTo("C180Car") == 0) {
//            this.carro = (T) new C180Car();
//        } else if (carroClass.compareTo("Compass") == 0) {
//            this.carro = (T) new Compass();
//        } else {
//            this.carro = (T) new NivusCar();
//        }
//
//    }
//
//    public GenericBuilder() {
//
//    }
//
//    public GenericBuilder<T> codigo(int codigo){
//        this.carro.setCodigo(codigo);
//        return this;
//    }
//
//    public GenericBuilder marca(String marca){
//        this.carro.setMarca(marca);
//        return this;
//    }
//
//    public GenericBuilder nome(String nome){
//        this.carro.setNome(nome);
//        return this;
//    }
//
//    public GenericBuilder lugares(String lugares){
//        this.carro.setLugares(lugares);
//        return this;
//    }
//
//    public Car<T> build(){
//        return this.carro;
//    }
//
}
