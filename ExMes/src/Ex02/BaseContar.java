package Ex02;

import java.util.Scanner;

public class BaseContar {
    public static void main(String[] args) throws InterruptedException {
        Contar contar = new Contar();

        Scanner in = new Scanner(System.in);

        int v,inicio, fim, pausa;

        System.out.println("Qual opção você deseja ? " +
                "\n Contar até 10 = 1 " +
                "\n Contar até um valor definido = 2 " +
                "\n Contar de um valor inicial definido ate um valor final definido = 3 "+
                "\n Contar com valores definidos e com uma pausa = 4 "+
                "\n : "
        );
        v = in.nextInt();


        if(v == 1){
            contar.Contagem();
        }
        else if(v == 2){
            System.out.println("Digite o valor final");
            fim = in.nextInt();

            contar.Contagem(fim);
        }
        else if(v == 3){
            System.out.println("Digite o valor Inicial");
            inicio = in.nextInt();

            System.out.println("Digite o valor final");
            fim = in.nextInt();

            contar.Contagem(inicio, fim );
        }

        else if(v == 4){
            System.out.println("Digite o valor Inicial");
            inicio = in.nextInt();

            System.out.println("Digite o valor final");
            fim = in.nextInt();

            System.out.println("Digite o tempo de pausa em segundos");
            pausa = in.nextInt();

            contar.Contagem(inicio, fim, pausa);
        }

        else{
            System.out.println("Opção Invalida");
        }

    }
}
