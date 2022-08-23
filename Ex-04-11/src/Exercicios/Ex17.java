package Exercicios;

import javax.swing.*;

public class Ex17 {
    public static void main(String[] args) {
        double celsius,fahrenheit;

        celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe os graus celsius "));

        fahrenheit = (celsius * 9/5) + 32;

        JOptionPane.showMessageDialog(null,celsius+" graus °C equilave a "+fahrenheit+" graus °F");
    }
}
