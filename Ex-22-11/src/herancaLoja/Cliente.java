package herancaLoja;

import java.util.Scanner;

public class Cliente implements DAO {

    private int codigo;
    private String nome;

    @Override
    public void Inserir() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = in.next();
    }

    @Override
    public void Excluir() {

    }

    @Override
    public void Localizar() {

    }
}