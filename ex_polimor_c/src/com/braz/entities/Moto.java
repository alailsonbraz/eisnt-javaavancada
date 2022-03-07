package com.braz.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Moto extends Veiculos{
    private int ano;

    public Moto() {

    }

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void insertData() {
        Scanner input = new Scanner(System.in);
        super.insertData();

        System.out.println("Informe o ano");
        setAno(input.nextInt());
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Ano: " + getAno());
    }
}
