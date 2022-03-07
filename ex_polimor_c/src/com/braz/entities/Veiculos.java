package com.braz.entities;

import java.util.Scanner;

public class Veiculos {
    private String modelo;
    private double preco;

    public Veiculos() {
    }

    public Veiculos(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void insertData(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o modelo");
        setModelo(input.nextLine());
        System.out.println("Insira o preço");
        setPreco(input.nextDouble());

    }

    public void printDados() {
        System.out.println("Veiculos{" +
                "modelo= " + modelo + '\'' +
                ", preco= " + getPreco() +
                '}');
    }
}
