package Classes;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Base calc = new Base();
        Scanner in = new Scanner(System.in);

        int g;

        System.out.println("Qual opção você deseja ? \n 1 = Operações padrão \n 2 = Bhaskara");
        g = in.nextInt();

        if(g==1){
            calc.solicitarNumeros();
            calc.escolherOperacao();
            calc.exibirNumero();
        }
        else if(g==2){
            calc.bhaskara();
        }
    }
}
