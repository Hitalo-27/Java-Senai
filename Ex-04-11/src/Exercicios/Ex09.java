package Exercicios;

import javax.swing.*;

public class Ex09 {
    public static void main(String[] args) {
        int pequena, media, grande, total;

        pequena = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de camisas pequenas: "));
        media = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de camisas medias: "));
        grande = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de camisas grandes: "));

        pequena = pequena * 10;
        media = media * 12;
        grande = grande * 15;

        total = pequena + media + grande;

        JOptionPane.showMessageDialog(null,"Total R$"+total);
    }
}
