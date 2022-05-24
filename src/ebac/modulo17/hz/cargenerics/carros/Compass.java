package ebac.modulo17.hz.cargenerics.carros;

import ebac.modulo17.hz.cargenerics.factory.Car;

public class Compass extends Car {

    int codigo = 002;
    String marca = "Jeep";
    String nome = "Compass";
    String lugares = "5";

    public Compass(int codigo, String marca, String nome, String lugares) {
        super();
    }

    public Compass() {
        this.setCodigo(codigo);
        this.setMarca(marca);
        this.setNome(nome);
        this.setLugares(lugares);
    }
}