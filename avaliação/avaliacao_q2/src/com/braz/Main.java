package com.braz;

import com.braz.entities.CamaroteInferior;
import com.braz.entities.CamaroteSuperior;
import com.braz.entities.Normal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Que tipo de ingressi deseja compar?");
        System.out.println("1 - Normal");
        System.out.println("2 - VIP");
        int opcaoCompra = input.nextInt();

        if(opcaoCompra == 1){
            Normal ingressoNormal = new Normal();
            ingressoNormal.imprimeValor();
        }else if(opcaoCompra == 2){
            System.out.println("Que tipo de camarote deseja INFERIOR OU SUPERIOR (i/s)?");
            char type = input.next().charAt(0);

            if (Character.toLowerCase(type) == 'i'){
                System.out.println("Informe a localização (1A - 1B - 2A - 2C)");
                String local = input.next();
                CamaroteInferior camInf = new CamaroteInferior(local);
                camInf.imprimeValor();
                camInf.imprimeLocalização();
            }else if(Character.toLowerCase(type) == 's'){
                CamaroteSuperior camSup = new CamaroteSuperior();
                camSup.imprimeValor();
            }else{
                System.out.println("VALOR INVÁLIDO");
            }
        }else{
            System.out.println("VALOR INVÁLIDO");
        }
    }
}
