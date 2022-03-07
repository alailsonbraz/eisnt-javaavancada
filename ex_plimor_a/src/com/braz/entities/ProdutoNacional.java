package com.braz.entities;
import java.util.Date;

public class ProdutoNacional extends Produto {

    private String tipoPoduto;

    public ProdutoNacional(String nome, String descricao, Double preco, String categoria, String tipoPoduto) {
        super(nome, descricao, preco, categoria);
        this.tipoPoduto = tipoPoduto;
    }

    public String getTipoPoduto() {
        return tipoPoduto;
    }

    public void setTipoPoduto(String tipoPoduto) {
        this.tipoPoduto = tipoPoduto;
    }

    @Override
    public String etiquetaProduto() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", preco=" + String.format("%.2f", getPreco()) +
                ", categoria='" + getCategoria() + '\'' +
                "ProdutoNacional{" +
                "tipoPoduto='" + getTipoPoduto() + '\'' +
                '}';
    }
}
