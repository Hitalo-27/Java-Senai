package Exercicios;

import javax.swing.*;

public class Ex16 {
    public static void main(String[] args) {
        int valor;
        double queijo = 50, presunto = 50, hamburguer = 100;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de sanduiches a serem feitos: "));

        queijo = ((queijo * 2) * valor) / 1000;

        presunto = (presunto * valor) / 1000;

        hamburguer = (hamburguer * valor) / 1000;

        JOptionPane.showMessageDialog(null,"Serão necessarios:\n"+queijo+"kg de queijo\n"+presunto+"kg de presunto\n"+hamburguer+"kg de hamburguer");
    }
}
