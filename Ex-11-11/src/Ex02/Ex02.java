package Ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Ex2Objeto> produtoObjetoList = new ArrayList<Ex2Objeto>();

        int qtdeItens;

        System.out.print("Quantidade de produtos comprados: ");
        qtdeItens = in.nextInt();

        for(int i = 1; i<=qtdeItens; i++){
            System.out.print("Nome: ");
            String nome = in.next();

            System.out.print("Preço: ");
            double preco = in.nextDouble();

            System.out.print("Qtde: ");
            int qtde = in.nextInt();

            Ex2Objeto ex2Objeto = new Ex2Objeto(nome, preco, qtde);

            produtoObjetoList.add(ex2Objeto);

        }

        for(Ex2Objeto objeto : produtoObjetoList){
            objeto.imprimir();
            System.out.println("");
        }

    }
}
