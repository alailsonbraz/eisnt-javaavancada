package com.braz;

import com.braz.entities.Imovel;
import com.braz.entities.ImovelNovo;
import com.braz.entities.ImovelUsado;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o endereço do Imóvel");
        String end = input.nextLine();
        System.out.println("Informe o preço do Imóvel");
        double preco = input.nextDouble();

        System.out.println("Informe se o imóvel é Novo ou Usado (n/u)");
        char type = input.next().charAt(0);

        if ( Character.toLowerCase(type) == 'n'){
            Imovel imovel = new ImovelNovo(end, preco);
            System.out.println(imovel.toString());
        }else if(Character.toLowerCase(type) == 'u'){
            Imovel imovel = new ImovelUsado(end, preco);
            System.out.println(imovel.toString());
        }else{
            System.out.println("Opção inválida");
        }
    }
}
