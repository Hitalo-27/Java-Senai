package Exercicios;

import javax.swing.*;

public class Ex14 {
    public static void main(String[] args) {
        double r;
        final double pi = 3.14;

        r = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da pizza "));

        r = pi * (r*r);

        JOptionPane.showMessageDialog(null,"A area da pizza é "+r);
    }
}
