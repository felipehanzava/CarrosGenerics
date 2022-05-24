package ebac.modulo17.hz.cargenerics;

import ebac.modulo17.hz.cargenerics.buildercar.JeepBuilder;
import ebac.modulo17.hz.cargenerics.buildercar.MercedesBuilder;
import ebac.modulo17.hz.cargenerics.carros.C180Car;
import ebac.modulo17.hz.cargenerics.carros.Compass;
import ebac.modulo17.hz.cargenerics.factory.Car;

import java.util.ArrayList;
import java.util.List;

public class Demo<T> {

    static C180Car c180Car = new C180Car();
    static Compass compassCar = new Compass();
    static List<Car> listaCarro = new ArrayList<>();
    private static Object C180Car;

    public static void main(String args[]) {

        preencherLista();
        System.out.println(listaCarro);


    }

    private static void preencherLista() {
//        GenericBuilder c180 = genericBuilder.codigo(c180Car.getCodigo())
//                .marca(c180Car.getMarca())
//                .nome(c180Car.getNome())
//                .lugares(c180Car.getLugares());



        C180Car c180r = MercedesBuilder.builder().codigo(c180Car.getCodigo())
                .marca(c180Car.getMarca())
                .nome(c180Car.getNome())
                .lugares(c180Car.getLugares()).build();

        Compass compass = JeepBuilder.builder().codigo(compassCar.getCodigo())
                .marca(compassCar.getMarca())
                .nome(compassCar.getNome())
                .lugares(compassCar.getLugares()).build();

 //       listaCarro.add(c180);
        listaCarro.add(c180r);
        listaCarro.add(compass);
    }


}
