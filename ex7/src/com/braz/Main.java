package com.braz;

import com.braz.Alunos.Aluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        Aluno al1 = new Aluno();

        System.out.println("Informe o nome do aluno");
        al1.setNome(input.next());
        System.out.println("Informe a nota do Primeiro trimestre");
        al1.setNota1(input.nextDouble());
        System.out.println("Informe a nota do Segundo trimestre");
        al1.setNota2(input.nextDouble());
        System.out.println("Informe a nota do Terceiro trimestre");
        al1.setNota3(input.nextDouble());
        System.out.println("Informe a nota do Quarto trimestre");
        al1.setNota4(input.nextDouble());

        System.out.println(al1.toString());

    }
}
