package Prova;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer idade[] = new Integer[5];
        Integer soma = 0;

        for(int i=0; i<5; i++){
            System.out.print("Infome a idade da "+(i+1)+"° pessoa");
            idade[i] = in.nextInt();
            soma = soma + idade[i];
        }

        for(int i=0; i<5; i++){
            System.out.println("A idade da "+(i+1)+"° pessoa é: "+idade[i]);
        }
        System.out.println("A soma das idades é: "+soma+" Anos");
    }
}
