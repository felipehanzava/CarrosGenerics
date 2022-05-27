package ebac.modulo17.hz.cargenerics;

import ebac.modulo17.hz.cargenerics.buildercar.GenericBuilder;
import ebac.modulo17.hz.cargenerics.buildercar.JeepBuilder;
import ebac.modulo17.hz.cargenerics.buildercar.MercedesBuilder;
import ebac.modulo17.hz.cargenerics.carros.C180Car;
import ebac.modulo17.hz.cargenerics.carros.Compass;
import ebac.modulo17.hz.cargenerics.carros.NivusCar;
import ebac.modulo17.hz.cargenerics.factory.Car;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    static Car c180Car = new C180Car();
    static Car compassCar = new Compass();
    static Car nivusCar = new NivusCar();
    static List<Car> listaCarro = new ArrayList<>();
    private static Object C180Car;

    public static void main(String args[]) {

        preencherLista();
        imprimir(listaCarro);

    }

    private static void imprimir(List<?> list) {
        System.out.println(list);
        }

    private static void preencherLista() {
        GenericBuilder genericBuilder = new GenericBuilder(c180Car);
        Car c180 = genericBuilder.build();

        GenericBuilder genericBuilder1 = new GenericBuilder(compassCar);
        Car compass = genericBuilder.build();

        GenericBuilder genericBuilder2 = new GenericBuilder(nivusCar);
        Car nivus = genericBuilder.build();

        listaCarro.add(nivus);
        listaCarro.add(c180);
        listaCarro.add(compass);
    }





}
