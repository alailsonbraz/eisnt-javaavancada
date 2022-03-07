package com.braz.entities;

public class ImovelNovo extends Imovel{
    private double acrescimo = 0.05;

    public ImovelNovo() {
    }

    public ImovelNovo(String endereco, double preço) {
        super(endereco, preço);

    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public double novoPreco(){
        return getPreço()+(getPreço()*getAcrescimo());
    }

    @Override
    public String toString() {
        return "Imovel Novo{" +
                super.toString() +
                "Valor total =" + String.format("%.2f", novoPreco()) +
                '}';
    }
}
