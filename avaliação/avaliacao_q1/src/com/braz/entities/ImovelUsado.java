package com.braz.entities;

public class ImovelUsado extends Imovel{
    private double desconto=0.10;

    public ImovelUsado() {
    }

    public ImovelUsado(String endereco, double preço) {
        super(endereco, preço);
    }

    public double getDesconto() {
        return desconto;
    }

    public double novoPreco(){
        return getPreço()-(getPreço()*getDesconto());
    }

    @Override
    public String toString() {
        return "Imovel Usado{" +
                super.toString() +
                "Valor total =" + String.format("%.2f", novoPreco()) +
                '}';
    }
}
