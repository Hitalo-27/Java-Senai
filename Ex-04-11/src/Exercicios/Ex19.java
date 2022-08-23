package Exercicios;

import javax.swing.*;

public class Ex19 {
    public static void main(String[] args) {
        double chipDireito = 4.00, chipEsquerdo = 3.50, total;
        int galinhas;

        galinhas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de galinhas: "));

        chipDireito = chipDireito * galinhas;

        chipEsquerdo = (chipEsquerdo * 2) * galinhas;

        total = chipDireito+chipEsquerdo;

        JOptionPane.showMessageDialog(null,"Você precisa de R$"+total);
    }
}
