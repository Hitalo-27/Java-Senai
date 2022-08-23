package Heranca;

import java.util.Scanner;

public class Crianca {
    public static void main(String[] args) {
        Aluno crianca = new Aluno();
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = in.next();

        System.out.print("Informe a sua cidade: ");
        String cidade = in.next();

        System.out.print("Informe o seu bairro: ");
        String bairro = in.next();

        System.out.print("Informe o sua rua: ");
        String rua = in.next();

        System.out.print("Informe o seu email: ");
        String email = in.next();

        System.out.print("Informe o seu curso: ");
        String curso = in.next();

        crianca.setNome(nome);
        crianca.setCidade(cidade);
        crianca.setBairro(bairro);
        crianca.setRua(rua);
        crianca.setEmail(email);
        crianca.setCurso(curso);

        System.out.println("Nome: "+crianca.getNome() +
                "\nCidade: "+ crianca.getCidade()+
                "\nBairro: "+ crianca.getBairro()+
                "\nRua: "+ crianca.getRua()+
                "\nEmail: "+ crianca.getEmail()+
                "\nCurso: "+ crianca.getCurso());
    }
}
