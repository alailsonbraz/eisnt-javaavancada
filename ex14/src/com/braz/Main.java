package com.braz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// PARTE 1 - CADASTRAR OS FUNCIONÁRIOS
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionário deseja cadastrar? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Código já utilizado, informe outro: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        // PARTE 2 - ATUALIZAR O SALÁRIO DO FUNCIONÁIO

        System.out.println();
        System.out.print("Entre o código do funcionário: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Esse código de funcionário não existe!");
        }
        else {
            System.out.print("Informe a porcentagem: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("Lista de funcionários:");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    // GERAR LISTA DE FUNCIONÁRIOS.

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
