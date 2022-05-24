package ebac.modulo17.hz.cargenerics.carros;


import ebac.modulo17.hz.cargenerics.factory.Car;

public class C180Car<T> extends Car {

    public int codigo = 001;
    String marca = "Mercedes";
    String nome = "C180";
    String lugares = "5";

    public C180Car(int codigo, String marca, String nome, String lugares) {
        super();
    }

    public C180Car() {
        this.setCodigo(codigo);
        this.setMarca(marca);
        this.setNome(nome);
        this.setLugares(lugares);
    }
}

