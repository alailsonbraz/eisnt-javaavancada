package com.braz;

import com.braz.entities.Carro;
import com.braz.entities.Moto;
import com.braz.entities.Veiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("INFORME O TIPO DE VEÍCULO CARRO OU MOTMO (c/m)");
        char type = input.next().charAt(0);

        if(type=='m'){
            Moto moto = new Moto();
            moto.insertData();
            moto.printDados();
        }else if(type=='c'){
            Carro carro =  new Carro();
            carro.insertData();
            carro.printDados();
        }else{
            System.out.println("Tipo inválido");
        }

    }
}
