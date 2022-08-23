package Prova;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0;
        Double valor[] = new Double[3];

        for(int i=0; i<3; i++){
            System.out.print("Digite a nota do "+(i+1)+"° aluno: ");
            valor[i] = in.nextDouble();
            soma = soma + valor[i];
        }
        soma = soma/3;
        System.out.println("A media é: "+soma);
    }
}
