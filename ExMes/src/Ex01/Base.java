package Ex01;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Mes mes = new Mes();

        int mes2, idioma2;

        Scanner in = new Scanner(System.in);

        System.out.println("Idioma: \n 1 = Português \n 2 = Inglês ");
        idioma2 = in.nextInt();

        System.out.print("Infome o número do Mês: ");
        mes2 = in.nextInt();

        System.out.println(mes.getMesPorExtenso(mes2, idioma2));
    }
}
