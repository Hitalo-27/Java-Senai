package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

    //Componentes

    private JTextField txtN1, txtN2;
    private JLabel lbUsuario, lbSenha, lbTitulo;
    private JButton btSoma,btSubtracao, btMult, btDiv, btCancelar;
    private static Calculadora frame;


    public Calculadora(){
        componentes();
        eventos();
    }

    private void componentes() {
        //Tela
        setTitle("Calculadora");
        setBounds(300,0,700,500);
        setLayout(null);

        //Labels
        lbTitulo = new JLabel("Calculadora");
        lbTitulo.setBounds(300,30,150,30);
        add(lbTitulo);

        lbUsuario = new JLabel("1°Numero");
        lbUsuario.setBounds(220,120,150,30);
        add(lbUsuario);

        lbSenha = new JLabel("2°Numero");
        lbSenha.setBounds(220,200,150,30);
        add(lbSenha);

        //Caixas de Texto
        txtN1= new JTextField();
        txtN1.setBounds(300,120,170,30);
        add(txtN1);

        txtN2 = new JTextField();
        txtN2.setBounds(300,200,170,30);
        add(txtN2);


        //Botões
        btSoma = new JButton("Soma");
        btSoma.setBounds(200,300,100,30);
        btSoma.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(btSoma);

        btSubtracao = new JButton("Subtração");
        btSubtracao.setBounds(320,300,100,30);
        btSubtracao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(btSubtracao);

        btMult = new JButton("Multiplicação");
        btMult.setBounds(440,300,100,30);
        btMult.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(btMult);

        btDiv = new JButton("Divisão");
        btDiv.setBounds(250,350,100,30);
        btDiv.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(btDiv);

        btCancelar = new JButton("Cancelar");
        btCancelar.setBounds(370,350,120,30);
        btCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(btCancelar);
    }

    private void eventos() {
        btSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());

                int result = n1 + n2;

                JOptionPane.showMessageDialog(null, result);
            }
        });

        btSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());

                int result = n1 - n2;

                JOptionPane.showMessageDialog(null, result);
            }
        });


        btMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());

                int result = n1 * n2;

                JOptionPane.showMessageDialog(null, result);
            }
        });


        btDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());

                int result = n1 / n2;

                JOptionPane.showMessageDialog(null, result);
            }
        });


        btCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtN1.setText("");
                txtN2.setText("");
            }
        });
    }

    public void run(){
        Calculadora tela = new Calculadora();
        tela.setVisible(true);

    }
}

