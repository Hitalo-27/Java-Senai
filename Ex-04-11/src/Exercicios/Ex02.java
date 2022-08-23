package Exercicios;

import javax.swing.*;
public class Ex02 {
    public static void main(String[] args) {
        int cavalos, total;
        cavalos = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de cavalos comprados: "));

        total = cavalos * 4;

        JOptionPane.showMessageDialog(null,"Você vai precisar de "+total+" ferraduras");
    }
}
