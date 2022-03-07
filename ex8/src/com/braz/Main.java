package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Calculador r1 =  new Calculador();

        System.out.println("Informe o valor do raio");
        r1.setRaio(input.nextDouble());

        r1.mostrarResultados();

    }
}
