package Exercicios;

import javax.swing.*;

public class Ex15 {
    public static void main(String[] args) {
        String input[], sl;
        double valorConta, resto;
        int divisao;

        valorConta = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta: "));

        sl = String.valueOf(valorConta);
        input = sl.split("\\.");

        divisao = Integer.parseInt(input[0]) / 3;
        resto = (Integer.parseInt(input[0]) % 3) + (Double.parseDouble(input[1])/100);

        JOptionPane.showMessageDialog(null,"Carlos vai pagar R$"+divisao+"\nAndre vai pagar R$"+divisao+"\nFelipe vai pagar R$"+(divisao+resto));
    }
}
