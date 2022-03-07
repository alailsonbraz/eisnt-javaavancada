package com.braz.entities;

import java.util.Scanner;

public class Carro extends Veiculos{
    private double km;

    public Carro() {
    }

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public void insertData() {
        Scanner input = new Scanner(System.in);
        super.insertData();

        System.out.println("Informe a kilometragem");
        setKm(input.nextDouble());
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("KM: " + getKm());
    }
}
