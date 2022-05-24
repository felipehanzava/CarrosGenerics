package ebac.modulo17.hz.cargenerics.buildercar;


import ebac.modulo17.hz.cargenerics.carros.Compass;
import ebac.modulo17.hz.cargenerics.factory.Car;

public class JeepBuilder extends Car {

    Compass carro;

    public JeepBuilder(){
        this.carro = new Compass();
    }

        public static JeepBuilder builder(){
            return new JeepBuilder();
        }


    public JeepBuilder codigo(int codigo){
        this.carro.setCodigo(codigo);
        return this;
    }

    public JeepBuilder marca(String marca){
        this.carro.setMarca(marca);
        return this;
    }

    public JeepBuilder nome(String nome){

        this.carro.setNome(nome);
        return this;
    }

    public JeepBuilder lugares(String lugares){
        this.carro.setLugares(lugares);
        return this;
    }

    public Compass build(){
        return this.carro;
    }


}