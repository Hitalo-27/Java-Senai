package Exercicios;

import javax.swing.*;

public class Ex01 {
    public static void main(String[] args) {
        double altura, base, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Informe a Base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura: "));

        area = base*altura;

        JOptionPane.showMessageDialog(null,"A área do terreno é: "+area);
    }
}
