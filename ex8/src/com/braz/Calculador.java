package com.braz;

public class Calculador {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double circunferencia(){
        return this.getRaio() * Math.PI * 2;
    }

    public double volume(){
        return (4 * Math.PI * Math.pow(this.getRaio(), 3))/3;
    }

    public void mostrarResultados(){
        System.out.printf("Circunferência: %.2f \n", this.circunferencia());
        System.out.printf("Volume: %.2f \n", this.volume());
    }
}

