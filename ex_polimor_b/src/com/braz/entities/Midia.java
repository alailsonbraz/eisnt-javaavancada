package com.braz.entities;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;
    private String tipo;
    private String detalhes;

    public Midia() {
    }

    public Midia(int codigo, double preco, String nome, String tipo, String detalhes) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
        this.tipo = tipo;
        this.detalhes = detalhes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public void inserirDados(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o codigo: ");
        setCodigo(input.nextInt());
        System.out.println("Insira preco");
        setPreco(input.nextDouble());
        System.out.println("Insira o nome");
        input.nextLine();
        setNome(input.nextLine());
        System.out.println("Insira o tipo");
        setTipo(input.nextLine());
        System.out.println("Insira os detalhes");
        setDetalhes(input.nextLine());
    }

    public void printDados() {
        System.out.println(
                "Midia{" +
                "codigo=" + getCodigo() +
                ", preco=" + getPreco() +
                ", nome=" + getNome()  +
                ", tipo=" + getTipo() +
                ", detalhes=" + getDetalhes() +
                '}');
    }
}
