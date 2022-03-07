package com.braz;
import com.braz.entities.ProdutoImportado;
import com.braz.entities.Produto;
import com.braz.entities.ProdutoNacional;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	// write your code here
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Quantidade de produtos a adicionar: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Produto #" + i + " data:");
            System.out.print("Nacional ou importado (n/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Descrição: ");
            sc.nextLine();
            String descricao = sc.nextLine();
            System.out.print("Preço: ");
            double price = sc.nextDouble();
            System.out.print("Categoria: ");
            sc.nextLine();
            String categoria = sc.nextLine();

            if (type == 'n') {
                System.out.print("Tipo do produto bio ou não bio: ");
                sc.nextLine();
                String tipoProduto = sc.nextLine();
                list.add(new ProdutoNacional(nome, descricao, price, categoria, tipoProduto ));
            }
            else if (type == 'i') {
                list.add(new ProdutoImportado(nome, descricao, price, categoria));
            }
            else {
                System.out.print("Opção inválida: ");
            }
        }

        System.out.println();
        System.out.println("Etiquetas de Preço:");
        for (Produto prod : list) {
            System.out.println(prod.etiquetaProduto());
        }

        sc.close();
    }
}
