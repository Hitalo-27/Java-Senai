package Pg40;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        double produto, porcentagem, desconto, resultado;

        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        produto=leia.nextDouble();
        System.out.print("Informe a porcentagem de desconto: ");
        porcentagem=leia.nextDouble();

        desconto = ((produto*porcentagem)/100);

        resultado = produto - desconto;

        System.out.println("Total de Desconto: "+desconto);
        System.out.println("Valor final: "+resultado);
    }
}
