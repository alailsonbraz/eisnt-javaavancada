package com.braz.Alunos;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno() {
    }

    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNotaFinal(){
        return (nota1*0.2+nota2*0.2+nota3*0.3+nota4*0.3);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' + " nota final = " + getNotaFinal() +
                " Situação: " + situacaoAluno() +
                '}';
    }

    public String situacaoAluno(){
        if(getNotaFinal()<60){
            double notaParaAprovado = (60)-getNotaFinal();
            return "Reprovado!" + "Para ser aprovado faltam-lhe " + notaParaAprovado + "pontos.";
        }else{
            return "Aprovado";
        }
    }
}
