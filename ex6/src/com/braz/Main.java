package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input =  new Scanner(System.in);


        System.out.println("Informe o Nome, o salário bruto e a taxa de imposto do funcionário");
        Funcionario func1 =  new Funcionario(input.next(), input.nextDouble(), input.nextDouble());
        func1.getSalarioBruto();
        System.out.println(func1.toString());

        System.out.println("Informe o percentagem de aumento salarial");
        func1.aumentarSalario(input.nextDouble());
        System.out.println(func1.toString());

    }
}
