package com.braz.entities;

import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;

    public CD() {
    }

    public CD(int codigo, double preco, String nome, String tipo, String detalhes, int nMusicas) {
        super(codigo, preco, nome, tipo, detalhes);
        this.nMusicas = nMusicas;
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int n){
        this.nMusicas=n;
    }

    @Override
    public void inserirDados() {
        Scanner input = new Scanner(System.in);
        super.inserirDados();
        System.out.println("Informe o número de músicas do cd");
        setnMusicas(input.nextInt());
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Número de músicas:" + getnMusicas());
    }
}
