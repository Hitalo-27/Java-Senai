package herancaLoja;

import java.util.Scanner;

public class Fornecedor implements DAO {

    private String cnpj;
    private String razaoSocial;

    @Override
    public void Inserir() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o seu CNPJ: ");
        cnpj = in.next();
        System.out.print("Razão Social: ");
        razaoSocial = in.next();
    }

    @Override
    public void Excluir() {

    }

    @Override
    public void Localizar() {

    }
}
