package Exercicios;

import javax.swing.*;
public class Ex05 {
    public static void main(String[] args) {
        double litro, valor, total;
        litro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do litro da gasolina: "));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos reais você deseja colocar: "));

        total = valor/litro;

        JOptionPane.showMessageDialog(null,"Você consiguiu colocar um tatal de "+total+" litos");
    }
}
