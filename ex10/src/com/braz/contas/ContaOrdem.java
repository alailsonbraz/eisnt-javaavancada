package com.braz.contas;

public class ContaOrdem {
    private int id;
    private String nome;
    private double saldo;
    private double depositoInicial;

    public ContaOrdem(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public ContaOrdem(int id, String nome, double depositoInicial) {
        this.id = id;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void levantamento(double valorLevantamento){
        saldo = saldo - valorLevantamento - 5.00;
        System.out.println(this.toString());
    }

    public void deposito(double valorDepositado){
        saldo += valorDepositado;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ContaOrdem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
