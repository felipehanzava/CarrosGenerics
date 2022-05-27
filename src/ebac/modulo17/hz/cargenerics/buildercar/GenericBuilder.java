package ebac.modulo17.hz.cargenerics.buildercar;

import ebac.modulo17.hz.cargenerics.carros.C180Car;
import ebac.modulo17.hz.cargenerics.carros.Compass;
import ebac.modulo17.hz.cargenerics.carros.NivusCar;
import ebac.modulo17.hz.cargenerics.factory.Car;

public class GenericBuilder<T>{

    Car carro;

    public GenericBuilder(Car<T> car) {
         this.carro = car;
         carro.setCodigo(car.getCodigo());
         carro.setMarca(car.getMarca());
         carro.setNome(car.getNome());
         carro.setLugares(car.getLugares());
    }


    public Car<T> build(){
        return this.carro;
    }

}
