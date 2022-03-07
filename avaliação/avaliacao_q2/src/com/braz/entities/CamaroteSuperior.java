package com.braz.entities;

public class CamaroteSuperior extends VIP{
    private double valorAdicional = 15.00;

    public double valorTotalSuperior(){
        return valorTotal()+valorAdicional;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Camarote Superior \n");
        System.out.printf("Valor %.2f", valorTotalSuperior());
    }
}
