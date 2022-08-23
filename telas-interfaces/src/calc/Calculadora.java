package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JLabel lbValor1;
	private JLabel lbValor2;
	private JButton btCalcular;
	private JButton btLimpar;
	
	@SuppressWarnings("unused")
	private static Calculadora frame;
	
	public Calculadora() {
		componentes();
		eventos();
	}

	private void eventos() {
		btCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!txtValor1.getText().equals("") && !txtValor2.getText().equals("")) {
					int v1 = Integer.parseInt(txtValor1.getText());
					int v2 = Integer.parseInt(txtValor2.getText());
					int total = v1 + v2;
					JOptionPane.showMessageDialog(null, "Resultado: " + total);
				}
				txtValor1.setText("");
				txtValor2.setText("");
			}
			
		});
		
		btLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtValor1.setText("");
				txtValor2.setText("");
			}
			
		});
	}

	private void componentes() {
		//tela
		setTitle("Calculadora");
		setBounds(700, 300, 500, 350);
		setLayout(null);
		
		//label valor 1
		lbValor1 = new JLabel("Valor 1");
		lbValor1.setBounds(60, 50, 100, 25);
		add(lbValor1);
		
		//textfield valor 1
		txtValor1 = new JTextField();
		txtValor1.setBounds(120, 50, 280, 25);
		add(txtValor1);
		
		//label valor 2
		lbValor2 = new JLabel("Valor 2");
		lbValor2.setBounds(60, 100, 100, 25);
		add(lbValor2);
		
		///textfield valor 2
		txtValor2 = new JTextField();
		txtValor2.setBounds(120, 100, 280, 25);
		add(txtValor2);

		//botões
		btCalcular = new JButton("Calcular");
		btCalcular.setBounds(60, 250, 150, 25);
		add(btCalcular);
		
		btLimpar = new JButton("Limpar");
		btLimpar.setBounds(250, 250, 150, 25);
		add(btLimpar);
	}

}
