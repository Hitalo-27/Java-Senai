package Prova;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer qtde;
        double soma = 0;
        System.out.print("Infome a quantidade de produtos");
        qtde = in.nextInt();
        Double valor[] = new Double[qtde];

        for(int i=0; i<qtde; i++){
            System.out.print("Infome a o valor do "+(i+1)+"° produto");
            valor[i] = in.nextDouble();
            soma = soma + valor[i];
        }
        System.out.println("O valor final é R$"+soma);
    }
}
