package Pg41;

import javax.swing.*;

public class Ex03 {
    public static  void main(String[] args){
        double transacao, venal, imposto, resultado;

        transacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da transação: "));
        venal = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da venal: "));
        imposto = Double.parseDouble(JOptionPane.showInputDialog("Percentual de imposto : "));

        if(transacao>venal){
            resultado = (transacao*imposto)/100;
            JOptionPane.showMessageDialog(null,"Total = "+resultado);
        }
        if(transacao<venal){
            resultado = (venal*imposto)/100;
            JOptionPane.showMessageDialog(null,"Total = "+resultado);
        }


    }
}
