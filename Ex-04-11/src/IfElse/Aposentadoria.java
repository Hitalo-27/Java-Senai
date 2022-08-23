package IfElse;

import javax.swing.*;

public class Aposentadoria {
    public static void main(String[] args) {
        String nome, sexo;
        Integer idade, contribuicao;

        nome = JOptionPane.showInputDialog("Infome o seu nome");
        sexo = JOptionPane.showInputDialog("Infome o seu sexo com M para masculino e F para feminino");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
        contribuicao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos anos de contribução você tem"));


        if(sexo.equals("M") && idade < 65 && contribuicao < 35){
            idade = 65 - idade;
            contribuicao = 35 - contribuicao;
            JOptionPane.showMessageDialog(null,
                    nome+" ainda falta "+idade+" para você se aposentar por idade " +
                            "e "+contribuicao+" anos para se aposentar por tempo de contribuição");
        }
        else if(sexo.equals("F") && idade < 60 && contribuicao < 30){
            idade = 60 - idade;
            contribuicao = 30 - contribuicao;
            JOptionPane.showMessageDialog(null,
                    nome+" ainda falta "+idade+" para você se aposentar por idade " +
                            "e "+contribuicao+" anos para se aposentar por tempo de contribuição");
        }
        else{
            JOptionPane.showMessageDialog(null, nome+" você ja pode se aposentar");
        }
    }
}
