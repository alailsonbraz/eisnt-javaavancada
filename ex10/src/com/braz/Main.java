package com.braz;

import com.braz.contas.ContaOrdem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        ContaOrdem conta = null;

        System.out.println("Informe o id da conta:");
        int id = input.nextInt();

        System.out.println("Informe o nome do dono da conta:");
        String nome = input.next();

        System.out.println("Deseja efetuar deposito inicial? 1-SIM/2-NÃO");
        int op = input.nextInt();

        switch (op) {
            case 1:
                System.out.println("Informe o valor do deposito inicial:");
                double dep = input.nextDouble();
                conta = new ContaOrdem(id, nome, dep);
                break;
            case 2:
                conta = new ContaOrdem(id, nome);
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("SELECIONE:");
        System.out.println("1 - DEPÓSITO");
        System.out.println("2 - LEVANTAMENTO");
        System.out.println("3 - ALTERAR NOME TITULAR");
        int contaOp = input.nextInt();

        if (conta != null) {
            switch (contaOp) {
                case 1:
                    System.out.println("informe o valor do depósito:");
                    conta.deposito(input.nextDouble());
                    break;
                case 2:
                    System.out.println("informe o valor do levantamento:");
                    conta.levantamento(input.nextDouble());
                    break;
                case 3:
                    System.out.println("informe o nome do titular:");
                    conta.setNome(input.next());
                    conta.toString();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
