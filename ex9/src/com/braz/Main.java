package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double qtd, pDolar;

        System.out.println("Informe a cotação do dolar: ");
        pDolar=input.nextDouble();
        System.out.println("Informe a quantidade q deseja comprar: ");
        qtd=input.nextDouble();

        System.out.printf("Irá pagar em euros: %.2f", CambioMoeda.conversao(qtd, pDolar));
    }
}
