package com.braz.entities;

public class Imovel {
    private String endereco;
    private double  preço;

    public Imovel() {
    }

    public Imovel(String endereco, double preço) {
        this.endereco = endereco;
        this.preço = preço;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }


    public String toString() {
        return "Imovel{" +
                "endereco='" + getEndereco() + '\'' +
                ", preço=" + String.format("%.2f", getPreço()) +
                '}';
    }
}
