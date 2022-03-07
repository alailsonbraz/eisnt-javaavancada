package com.braz.formas;

public class Retangulo {
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea (){
        return getAltura()*getLargura();
    }

    public double perimetro (){
        return 2*(getAltura()*getLargura());
    }

    public double diagonal(){
        return Math.sqrt((getLargura()*getLargura())+(getAltura()*getAltura()));
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "Area=" + calcularArea() +
                ", perimetro=" + perimetro() +
                " diagonal=" + diagonal()+
                '}';
    }
}
