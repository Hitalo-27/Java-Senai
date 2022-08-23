package Exercicios;

import javax.swing.*;

public class Ex13 {
    public static void main(String[] args) {
        int valor, centena, dezena, unidade;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor de 3 digitos: "));

        centena = (valor/100) * 100;
        dezena = ((valor%100) / 10) * 10;
        unidade = (valor%10);

        JOptionPane.showMessageDialog(null,"Centena = "+centena+", Dezena = "+dezena+", Unidade = "+unidade);
    }
}
