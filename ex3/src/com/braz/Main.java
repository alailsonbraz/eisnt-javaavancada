package com.braz;

import com.braz.formas.ComparaFormas;
import com.braz.formas.Retangulo;
import com.braz.formas.Triangulo;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int opcao;
        System.out.println("Digite 1 para Triangulo");
        System.out.println("Digite 2 para Retangulo");
        opcao=input.nextInt();

        switch (opcao){
            case 1:
                Triangulo t1 = new Triangulo();
                Triangulo t2 = new Triangulo();

                System.out.println("Informe os 3 lados do primeiro triângulo:");
                t1.setLadoA(input.nextDouble());
                t1.setLadoB(input.nextDouble());
                t1.setLadoC(input.nextDouble());

                System.out.println("Informe os 3 lados do segundo triângulo:");
                t2.setLadoA(input.nextDouble());
                t2.setLadoB(input.nextDouble());
                t2.setLadoC(input.nextDouble());

                System.out.println("Triangulo 1");
                t1.mostrarAreaTriangulo();

                System.out.println("Triangulo 2");
                t2.mostrarAreaTriangulo();

                ComparaFormas.maiorArea(t1.calcularAreaTriangulo(), t2.calcularAreaTriangulo());
                break;

            case 2:
                Retangulo r1 = new Retangulo();

                System.out.println("Informe a altura:");
                r1.setAltura(input.nextDouble());
                System.out.println("Informe a largura:");
                r1.setLargura(input.nextDouble());

                System.out.println(r1.toString());
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}
