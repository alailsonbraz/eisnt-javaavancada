package com.braz.entities;

import java.util.Scanner;

public class DVD extends Midia{
    private int nFaixas;

    public DVD() {
    }

    public DVD(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    public DVD(int codigo, double preco, String nome, String tipo, String detalhes, int nFaixas) {
        super(codigo, preco, nome, tipo, detalhes);
        this.nFaixas = nFaixas;
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    @Override
    public void inserirDados() {
        Scanner input = new Scanner(System.in);
        super.inserirDados();
        System.out.println("Informe o número de faixas do dvd");
        setnFaixas(input.nextInt());
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Nº de faixas" + getnFaixas());
    }
}
