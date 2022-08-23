package HerancaAnimais;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        AnimaisService animaisService = new AnimaisService();
        Scanner in = new Scanner(System.in);

        System.out.print("Digite 1 para cachorros e 2 para gatos: ");
        int n = in.nextInt();

        System.out.print("Informe o nome do seu pet: ");
        String nome = in.next();

        System.out.print("Informe o a raça do seu pet: ");
        String raca = in.next();

        System.out.print("Informe o alimento do seu pet: ");
        String alimento = in.next();

        System.out.print("Informe o nome do dono: ");
        String dono = in.next();

        animaisService.verificaAnimal(n);

        animaisService.dados(nome, raca, alimento, dono);
    }
}
