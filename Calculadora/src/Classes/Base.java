package Classes;

import java.util.Scanner;

public class Base {

    //Normal
    private double n1, n2, r;
    String op;

    //Bhaskara
    private double a, b,b2, c, delta, raiz, soma, sub;

    public void solicitarNumeros(){
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o 1° numero: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o 2° numero: ");
        n2 = leia.nextDouble();
    }

    public void escolherOperacao(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha a operação:  \n" +
                "+ = Soma \n"+
                "- = Subtração \n"+
                "* = Multiplicação \n"+
                "/ = Divisão");
        op = leia.next();

        switch(op){
            case "+": {
                r = n1 + n2;
                System.out.println("Soma= "+r);
                break;
            }

            case "-": {
                r = n1 - n2;
                System.out.println("Subtração= "+r);
                break;
            }

            case "*": {
                r = n1 * n2;
                System.out.println("Multiplicação= "+r);
                break;

            }
            case "/": {
                r = n1 / n2;
                System.out.println("Divisão= "+r);
                break;

            }

            default: throw new IllegalArgumentException("Valor Invalido");


        }
    }

    public void exibirNumero(){
        System.out.println("Primeiro Numero= "+n1);
        System.out.println("Segundo Numero= "+n2);

    }

    public void bhaskara(){

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = in.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = in.nextDouble();

        System.out.print("Digite o valor de C: ");
        c = in.nextDouble();

        //Calculo de Delta
        b2=b*b;

        delta = b2-4*a*c;


        //Transformando em Negativo
        b = (b-b)-b;

        //Raiz
        raiz = Math.sqrt(delta);

        //Divisão
        a = 2*a;


        //Soma
        soma = (b+raiz)/a;

        //Subtração
        sub = (b-raiz)/a;

        System.out.println("X1 = "+soma);
        System.out.println("X2 = "+sub);
    }
}
