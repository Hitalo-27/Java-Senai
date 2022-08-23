package comandoEntrada;

import javax.swing.*;

public class UsandoJOptionPane {
    public static void main(String[] args){
        String nome, sobrenome;
        int idade;
        double salario;

        nome = JOptionPane.showInputDialog("Digite o seu nome");
        sobrenome = JOptionPane.showInputDialog("Digite o seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario"));
        JOptionPane.showMessageDialog(null,"Bem Vindo! "+nome+" "+sobrenome+" você tem "+idade+" anos e recebe R$"+salario+" por mês");
    }
}
