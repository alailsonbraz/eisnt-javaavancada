package com.braz;

public class Aluguer {
    private int numeroQuarto;
    private String nome;
    private String email;

    public Aluguer(int numeroQuarto, String nome, String email) {
        this.numeroQuarto=numeroQuarto;
        this.nome = nome;
        this.email = email;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluguer{" +
                "numeroQuarto=" + numeroQuarto +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
