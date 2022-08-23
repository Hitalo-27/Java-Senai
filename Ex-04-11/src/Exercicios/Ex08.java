package Exercicios;

import javax.swing.*;

public class Ex08 {
    public static void main(String[] args) {
        double nota, vetor[] = new double[3];
        for (int i = 0; i < 3; i++) {
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a "+(i+1)+" nota: "));
        }
        nota = (vetor[0] + vetor[1] + vetor[2]) / 3;

        JOptionPane.showMessageDialog(null,nota);

    }
}
