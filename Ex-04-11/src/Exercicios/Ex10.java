package Exercicios;

import javax.swing.*;

public class Ex10 {
    public static void main(String[] args) {
        double x1,x2,y1,y2, distancia;

        x1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do X do primeiro ponto: "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Y do primeiro ponto: "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do X do segundo ponto: "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Y do segundo ponto: "));

        distancia = (Math.pow (x2-x1,2)) + (Math.pow (y2-y1,2));
        distancia = Math.sqrt(distancia);

        JOptionPane.showMessageDialog(null,"A distancia do primeiro ponto para o segundo é "+distancia);

    }
}
