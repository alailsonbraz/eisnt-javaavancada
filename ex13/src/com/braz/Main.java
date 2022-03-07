package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        Aluguer[] quartos = new Aluguer[10];


        System.out.println("Quantos quartos serão alugados?");
        int numQuartos = input.nextInt();

        for(int i=0; i<numQuartos; i++){
            System.out.println("Informe o nome:");
            String nome = input.next();
            System.out.println("Informe o email:");
            String email = input.next();
            System.out.println("Informe o número do quarto escolhido (0-9)");
            int quartoEscolhido = input.nextInt();
            quartos[quartoEscolhido] = new Aluguer(quartoEscolhido, nome, email);
        }

        for (int i=0; i<quartos.length; i++){
            if(quartos[i]!=null){
                System.out.println(quartos[i].toString());
                System.out.println("-------------------------------");
            }
        }
    }
}
