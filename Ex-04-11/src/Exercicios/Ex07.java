package Exercicios;

import javax.swing.*;

public class Ex07 {
    public static void main(String[] args) {
        int meses, dias, total;

        meses = Integer.parseInt(JOptionPane.showInputDialog("Informe o Mês"));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Informe o Dia "));

        meses = (meses - 1) * 30;

        total = meses+dias;

        JOptionPane.showMessageDialog(null,"Ja se passaram "+total+" dias des de o começo do ano");
    }
}
