package com.braz;

import com.braz.produtos.Produtos;
import com.braz.produtos.Stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int opcao, qtdProdutosAdd=0;
        String continuar= "s";

        List<Produtos> produtos = new ArrayList<>();
        Produtos p = null;
        do {
            Menu.mostrarMenu();
            opcao=input.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Quantos produtos deseja adicionar? ");
                    qtdProdutosAdd=input.nextInt();
                    for(int i=0; i<qtdProdutosAdd;i++){
                        p= new Produtos();
                        System.out.println("Insira o nome do produto: ");
                        p.setNome(input.next());
                        System.out.println("Insira o preço do produto: ");
                        p.setPreco(input.nextDouble());
                        System.out.println("Insira a quantidade do produto: ");
                        p.setQuantidade(input.nextInt());
                        produtos.add(p);
                    }
                    break;
                case 2:
                    if(qtdProdutosAdd==1){
                        System.out.println("Informe a quantidade a adicionar ao stock do produto ");
                        int qtd=input.nextInt();
                        Stock.entradaStock(produtos.get(0),qtd);
                    }else {
                        System.out.println("Informe o nome do produto que deseja adicionar ao stock");
                        String nomePesquisa;
                        nomePesquisa=input.next();
                        for(Produtos prod : produtos){
                            if(prod.getNome().equals(nomePesquisa)){
                                System.out.println("Informe a quantidade a adicionar ao stock do produto ");
                                int qtd=input.nextInt();
                                Stock.entradaStock(prod,qtd);
                            }
                        }
                    }
                    break;
                case 3:
                    if(qtdProdutosAdd==1){
                        System.out.println("Informe a quantidade a remover ao stock do produto ");
                        int qtd=input.nextInt();
                        Stock.saidaStock(produtos.get(0),qtd);
                    }else {
                        System.out.println("Informe o nome do produto que deseja remover ao stock");
                        String nomePesquisa;
                        nomePesquisa=input.next();
                        for(Produtos prod : produtos){
                            if(prod.getNome().equals(nomePesquisa)){
                                System.out.println("Informe a quantidade a adicionar ao stock do produto ");
                                int qtd=input.nextInt();
                                Stock.saidaStock(prod,qtd);
                            }else{
                                System.out.println("Produto não encontrado");
                            }
                        }
                    }
                    break;
                case 4:
                    if(qtdProdutosAdd==1){
                        System.out.println(produtos.toString());
                    }else {
                        System.out.println("Informe o nome do produto que deseja ver o status");
                        String nomePesquisa;
                        nomePesquisa=input.next();
                        for(Produtos prod : produtos){
                            if(prod.getNome().equals(nomePesquisa)){
                                System.out.println("Informe a quantidade a adicionar ao stock do produto ");
                                System.out.println(produtos.toString());
                            }else{
                                System.out.println("Produto não encontrado");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Ooção inválida");
            }
            System.out.println("Continuar? s/n");
            continuar=input.next();
        }while(continuar.toLowerCase().equals("s"));
    }
}
