package Matriz;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja informar? ");
        int n = in.nextInt();
        in.nextLine();

        String vetor[] = {"Nome", "Função", "Salario"};
        String matriz[][] = new String[n][3];

        for (int i=0; i<n; i++){
            for (int j=0; j<3; j++){
                System.out.print("Digite o "+vetor[j]+": ");
                matriz[i][j] = in.nextLine();
            }
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<3; j++){
                System.out.print(vetor[j]+": "+matriz[i][j]+" | ");
            }
            System.out.println(" ");
        }
    }
}
