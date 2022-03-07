package com.braz;

public class CambioMoeda {

    public static double conversao(double quantidade, double precoDolar){
        double imposto = 0.06;
        return quantidade * precoDolar * (1+ imposto);
    }
}
