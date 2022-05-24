package ebac.modulo17.hz.cargenerics.carros;

import ebac.modulo17.hz.cargenerics.factory.Car;

public class NivusCar extends Car {

        int codigo = 003;
        String marca = "Volksvagen";
        String nome = "Nivus";
        String lugares = "5";

        public NivusCar(int codigo, String marca, String nome, String lugares) {
            super();
        }

        public NivusCar() {
            this.setCodigo(codigo);
            this.setMarca(marca);
            this.setNome(nome);
            this.setLugares(lugares);
        }
}