package com.braz.entities;

public class Normal extends Ingresso{

    public Normal() {
    }

    @Override
    public void imprimeValor() {
        System.out.println("INGRESSO NORMAL \n");
        super.imprimeValor();
    }
}
