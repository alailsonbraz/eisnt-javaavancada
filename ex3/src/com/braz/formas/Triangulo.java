package com.braz.formas;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public double semiperimeto(){
        return (getLadoA()+getLadoB()+getLadoC())/2;
    }

    public double calcularAreaTriangulo(){
        return Math.sqrt(semiperimeto()*(semiperimeto()-getLadoA()*(semiperimeto()-getLadoB())*(semiperimeto()-getLadoC())));
    }

    public void mostrarAreaTriangulo(){
        System.out.println("Area: " + calcularAreaTriangulo());
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
}
