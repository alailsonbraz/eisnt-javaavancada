package com.braz.produtos;

public class Stock {

    public static void entradaStock(Produtos p, int estoqueAdicionado){
         p.setQuantidade(p.getQuantidade() + estoqueAdicionado);
    }

    public static void saidaStock(Produtos p, int estoqueRemovido){
        p.setQuantidade(p.getQuantidade() + estoqueRemovido);
    }
}
