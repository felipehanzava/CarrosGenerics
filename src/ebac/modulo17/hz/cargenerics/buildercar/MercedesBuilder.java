package ebac.modulo17.hz.cargenerics.buildercar;

import ebac.modulo17.hz.cargenerics.carros.C180Car;
import ebac.modulo17.hz.cargenerics.factory.Car;

public class MercedesBuilder<T> extends Car {

    C180Car carro;

    public MercedesBuilder(){
        this.carro = new C180Car();
    }

    public static MercedesBuilder builder(){
        return new MercedesBuilder();
    }

    public MercedesBuilder codigo(int codigo){
        this.carro.setCodigo(codigo);
        return this;
    }

    public MercedesBuilder marca(String marca){
        this.carro.setMarca(marca);
        return this;
    }

    public MercedesBuilder nome(String nome){

        this.carro.setNome(nome);
        return this;
    }

    public MercedesBuilder lugares(String lugares){
        this.carro.setLugares(lugares);
        return this;
    }

    public C180Car build(){
        return this.carro;
    }


}
