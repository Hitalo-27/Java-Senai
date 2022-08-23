package Exercicios;

import javax.swing.*;

public class Ex20 {
    public static void main(String[] args) {
        int blusas, novelos;

        blusas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de blusas feitas: "));
        novelos = Integer.parseInt(JOptionPane.showInputDialog("Quantos novelos foram ultilizados para fazer as "+blusas+" blusas ?"));

        blusas = blusas/novelos;

        JOptionPane.showMessageDialog(null,"Você gasta um total de "+blusas+" novelos por blusas");
    }
}
