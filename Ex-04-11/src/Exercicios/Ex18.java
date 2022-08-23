package Exercicios;

import javax.swing.*;

public class Ex18 {
    public static void main(String[] args) {
        int horasNormais, horasExtras, liquido, bruto, total;

        horasNormais = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas normais trabalhadas: "));

        horasExtras = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas extras trabalhadas: "));

        horasNormais = horasNormais * 10;

        horasExtras = horasExtras * 15;

        bruto = horasExtras+horasNormais;

        liquido = bruto - ((bruto*10)/100);

        JOptionPane.showMessageDialog(null,"Salario:\nbruto R$"+bruto+"\nliquido R$"+liquido);
    }
}
