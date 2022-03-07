package com.braz.entities;

public abstract class VIP extends Ingresso{
    private double valorAdicional =20.00;

    public VIP() {
        super();
    }

    public double valorTotal(){
        return getValor()+valorAdicional;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Ingresso VIP {" +
                "valor= " + String.format("%.2f", valorTotal()) +
                '}');
    }
}
