package operadores;

import javax.swing.*;

public class Operadores {
    public static  void main(String[] args){
        int a,b,c,d;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° valor:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 2° valor:"));
        c = a+b;
        JOptionPane.showMessageDialog(null,"Soma = "+c);
    }
}
