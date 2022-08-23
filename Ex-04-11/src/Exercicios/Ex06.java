package Exercicios;

import javax.swing.*;

public class Ex06 {
    public static void main(String[] args) {
        double peso, total;
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso em Quilos "));

        total = peso * 12;

        JOptionPane.showMessageDialog(null,"Valor total a pagar R$"+total);
    }
}
