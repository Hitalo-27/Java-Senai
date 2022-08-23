package Pg40;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int lider, lanterna, pontos, vitorias;

        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a quantidade de pontos do lider: ");
        lider=leia.nextInt();
        System.out.print("Informe a quantidade de pontos do lanterna ");
        lanterna=leia.nextInt();

        pontos = lider-lanterna;
        vitorias = (lider-lanterna)/3;

        System.out.println("O time lanterna precisa de "+vitorias+" vitorias ou "+pontos+" pontos para alcançar o lider do campeonato");
    }
}
