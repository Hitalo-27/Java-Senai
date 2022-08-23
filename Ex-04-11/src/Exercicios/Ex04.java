package Exercicios;

import javax.swing.*;
public class Ex04 {
    public static void main(String[] args) {
        int anos, meses, dias, total;
        String nome;

        nome = JOptionPane.showInputDialog("Digite o seu nome");
        anos = Integer.parseInt(JOptionPane.showInputDialog("Quantos Anos você tem ?: "));
        meses = Integer.parseInt(JOptionPane.showInputDialog("Quantos Meses ? "));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Quantos Dias ? "));

        anos = anos * 365;
        meses = meses * 30;

        total = anos+meses+dias;

        JOptionPane.showMessageDialog(null,nome+", você ja viveu "+total+" dias");
    }
}
