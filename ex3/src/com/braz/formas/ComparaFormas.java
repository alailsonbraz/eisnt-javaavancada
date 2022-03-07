package com.braz.formas;

public class ComparaFormas {

    public static void maiorArea(double area1, double area2){
        if(area1>area2){
            System.out.println("A área da primeira forma é maior que a Segunda");
        }else if(area2>area1){
            System.out.println("A área da segunda forma é maior que a Primeira");
        }else{
            System.out.println("A área da primeira e segunda formas são iguais");
        }
    }
}
