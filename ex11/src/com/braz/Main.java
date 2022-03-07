package com.braz;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Inforeme o número de pessoas que deseja informar a altura:");
        int numPessoas =  input.nextInt();
        double [] pessoas = new double[numPessoas];
        double soma=0;

        for(int i =0; i<numPessoas; i++){
            System.out.println("Informe a altura da pessoa " + (i+1));
            pessoas[i]=input.nextDouble();
            soma+= pessoas[i];
        }

        double mediaAlturas = soma/(numPessoas);

        System.out.printf("A média de alturas é = %.2f", mediaAlturas);
    }
}
