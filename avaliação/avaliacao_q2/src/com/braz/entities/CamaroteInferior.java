package com.braz.entities;

public class CamaroteInferior extends VIP{
    private String localizacao;

    public CamaroteInferior() {
    }

    public CamaroteInferior(String localizacao) {
        super();
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Camarote Inferior \n");
        super.imprimeValor();
    }

    public void imprimeLocalização(){
        System.out.println("Localização do Camarote inferior: " + getLocalizacao());
    }
}
