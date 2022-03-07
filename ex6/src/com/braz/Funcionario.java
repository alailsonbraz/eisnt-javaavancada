package com.braz;

public class Funcionario {

    private String nome;
    private double salarioBruto;
    private double imposto;

    public Funcionario(String nome, double salarioBruto, double percentagem) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = percentagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double percentagem) {
        this.imposto = percentagem;
    }

    public double salarioLiquido(){
        return getSalarioBruto()-(getSalarioBruto()*(getImposto()/100));
    }

    public void aumentarSalario(double percentagem){
        setSalarioBruto(getSalarioBruto()+(getSalarioBruto()*(percentagem/100)));
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", Salário L+iquido=" + salarioLiquido() +
                '}';
    }
}
