package com.braz;

import com.braz.entities.CD;
import com.braz.entities.DVD;
import com.braz.entities.Midia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tipo de midia dejesa adicionar c/d");
        char type = sc.next().charAt(0);
        if(type == 'c'){
            CD c1 = new CD();
            c1.inserirDados();
            c1.printDados();
        }else if(type == 'd'){
            DVD d1 = new DVD();
            d1.inserirDados();
            d1.printDados();
        }else{
            System.out.println("OPÇÃO INVÁLIDA");
        }

        sc.close();
    }
}
