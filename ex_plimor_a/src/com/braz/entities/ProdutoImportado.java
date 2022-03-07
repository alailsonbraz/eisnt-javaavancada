package com.braz.entities;

public class ProdutoImportado extends Produto {
    private double taxaImportacao=0.05;

    public ProdutoImportado(String nome, String descricao, Double preco, String categoria) {
        super(nome, descricao, preco, categoria);
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportcao(double taxaImportcao) {
        this.taxaImportacao = taxaImportacao;
    }

    public double precoFinal(){
        return getPreco()+(getPreco()*getTaxaImportacao());
    }

    @Override
    public String etiquetaProduto() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", preco=" + String.format("%.2f", getPreco()) +
                ", categoria='" + getCategoria() + '\'' +
                "ProdutoImportado{" +
                "taxaImportcao=" + String.format("%.2f", getTaxaImportacao()) +
                "precoFinal=" + String.format("%.2f", precoFinal()) +
                '}';
    }
}
