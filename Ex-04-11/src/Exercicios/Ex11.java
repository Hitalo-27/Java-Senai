package Exercicios;

import javax.swing.*;

public class Ex11 {
    public static void main(String[] args) {
        int meses, dias,anos;

        dias = Integer.parseInt(JOptionPane.showInputDialog("Informe o Dia "));

        anos = dias / 365;
        meses = dias % 365;
        meses = meses / 30;
        dias = (dias % 365) % 30 ;

        JOptionPane.showMessageDialog(null,"Anos: "+anos+" Meses: "+meses+" Dias: "+dias);

    }
}
