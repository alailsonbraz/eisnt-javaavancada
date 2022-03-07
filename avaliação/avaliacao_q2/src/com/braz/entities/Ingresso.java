package com.braz.entities;

public abstract class Ingresso {
    private double valor = 80.00;

    public double getValor() {
        return valor;
    }

    public void imprimeValor() {
        System.out.println("Ingresso {" +
                "valor= " + String.format("%.2f", getValor()) +
                '}');
    }
}
