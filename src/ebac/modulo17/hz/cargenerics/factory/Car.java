package ebac.modulo17.hz.cargenerics.factory;

import ebac.modulo17.hz.cargenerics.buildercar.MercedesBuilder;

public abstract class Car<T> {

    public int codigo;
    public String marca;
    public String nome;
    public String lugares;

    public Car(int i, String s, String s1, String s2) {
        this.codigo = codigo;
        this.marca = marca;
        this.nome = nome;
        this.lugares = lugares;
    }

    public Car() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLugares() {
        return lugares;
    }

    public void setLugares(String lugares) {
        this.lugares = lugares;
    }

    public String toString() {
        return "Car{" +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", lugares='" + lugares + '\'' +
                '}';
    }
}