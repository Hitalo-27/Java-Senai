package Prova;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer idade[] = new Integer[10];
        Integer soma = 0;

        for(int i=0; i<10; i++){
            System.out.print("Infome a idade da "+(i+1)+"° pessoa");
            idade[i] = in.nextInt();
        }

        for(int i=0; i<10; i++){
            if(idade[i] >= 18){
                soma++;
            }
        }
        System.out.println(soma +"pessoas tem mais de 18 anos");
    }
}
