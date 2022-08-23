package Prova;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer vetor[] = new Integer[11];
        Integer numero;

        numero = in.nextInt();

        for(int i=1; i<=10; i++){
            vetor[i] = numero * i;
            System.out.println(i+"x"+numero+"="+vetor[i]);
        }
    }
}
