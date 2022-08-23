package comandoEntrada;

import java.util.Scanner;

public class Comandos {
    public static void main(String[] args){
        String nome, sobrenome;
        int idade;
        double salario;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o seu Nome: ");
        nome=leia.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        sobrenome=leia.nextLine();

        System.out.print("Digite a sua idade: ");
        idade=leia.nextInt();

        System.out.print("Digite o seu salario: ");
        salario=leia.nextDouble();

        System.out.println("Bem Vindo! "+nome+" "+sobrenome+" você tem "+idade+" anos e recebe R$"+salario+" por mês");
    }
}
