package Exercicios;

import javax.swing.*;
public class Ex03 {
    public static void main(String[] args) {
        int paes, broas;
        double valorPaes = 0.12, valorBroas = 1.50, total, poupanca;
        paes = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de paes vendidos: "));
        broas = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de broas vendidas: "));

        total = (valorPaes*paes) + (valorBroas*broas);
        poupanca = (total*10) / 100;

        JOptionPane.showMessageDialog(null,"O Total da venda foi R$"+total);
        JOptionPane.showMessageDialog(null,"Você deve guardar um total R$"+poupanca+" na conta poupança");
    }
}
