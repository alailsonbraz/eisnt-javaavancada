package com.braz;

import java.beans.ParameterDescriptor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double soma=0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a quantidade de produtos: ");
        int n = input.nextInt();

        Produto[] prods = new Produto[n];

        for (int i=0; i< prods.length; i++){
            input.nextLine();
            System.out.println("Insira o nome do produto");
            String nome= input.next();
            System.out.println("Insira o preço do produto");
            double preco = input.nextDouble();
            prods[i] = new Produto(nome, preco);
            soma+=prods[i].getPreco();
        }

        double media = soma/ prods.length;
        System.out.printf("Média do preço =  %,2f", media);
    }
}
