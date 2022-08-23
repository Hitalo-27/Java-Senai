package herancaLoja;

import java.util.Scanner;

public class Produto implements DAO,Estoque {

    private int numero;
    private String descricao;

    @Override
    public void Inserir() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a descrição: ");
        descricao = in.next();
    }

    @Override
    public void Excluir() {

    }

    @Override
    public void Localizar() {

    }

    @Override
    public void Baixar() {

    }
}