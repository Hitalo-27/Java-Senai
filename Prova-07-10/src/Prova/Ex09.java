package Prova;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Digite aum numero de 12 a 20: ");
        n = in.nextInt();

        if(n>=12 && n<=20){
            System.out.println("O numero digitado foi: "+n);
        }
        else{
            System.out.println("Entrada invalida");
        }
    }
}
