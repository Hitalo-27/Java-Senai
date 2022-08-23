package Exercicios;

import javax.swing.*;

public class Ex12 {
    public static void main(String[] args) {
        double inicial, aumento, total;
        inicial = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salario: "));

        aumento = (inicial*15)/100;
        aumento = inicial+aumento;

        total = (aumento * 8)/100;
        total = aumento - total;

        JOptionPane.showMessageDialog(null,"Salario Inicial R$"+inicial+", com aumento R$"+aumento+", final R$"+total);
    }
}
