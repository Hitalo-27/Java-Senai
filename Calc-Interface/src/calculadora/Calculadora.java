package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame{
	private static final long serialVersionUID = 1L;

	private JButton[] botoes = new JButton [16];
	private JTextField txtCampo;

	@SuppressWarnings("unused")
	private static Calculadora frame;
	
	public Calculadora() {
		componentes();
		eventos();
	}

	private void eventos() {
		botoes[1].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();
				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("1");
				} else {
					txtCampo.setText(textoAnterior + "1");
				}
			}
	});

		botoes[2].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("2");
				} else {
					txtCampo.setText(textoAnterior + "2");
				}
			}

		});

		botoes[3].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("3");
				} else {
					txtCampo.setText(textoAnterior + "3");
				}
			}

		});

		botoes[4].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("4");
				} else {
					txtCampo.setText(textoAnterior + "4");
				}
			}

		});

		botoes[5].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("5");
				} else {
					txtCampo.setText(textoAnterior + "5");
				}
			}

		});

		botoes[6].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("6");
				} else {
					txtCampo.setText(textoAnterior + "6");
				}
			}

		});

		botoes[7].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("7");
				} else {
					txtCampo.setText(textoAnterior + "7");
				}
			}

		});

		botoes[8].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("8");
				} else {
					txtCampo.setText(textoAnterior + "8");
				}
			}

		});

		botoes[9].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("9");
				} else {
					txtCampo.setText(textoAnterior + "9");
				}
			}

		});

		botoes[0].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("0");
				} else {
					txtCampo.setText(textoAnterior + "0");
				}
			}

		});

		botoes[10].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("/");
				} else {
					txtCampo.setText(textoAnterior + "/");
				}
			}

		});

		botoes[11].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("*");
				} else {
					txtCampo.setText(textoAnterior + "*");
				}
			}

		});

		botoes[12].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("+");
				} else {
					txtCampo.setText(textoAnterior + "+");
				}
			}

		});

		botoes[13].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtCampo.setText("");
			}

		});

		botoes[14].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event){

				String textoAnterior = txtCampo.getText();

				if(textoAnterior == null || textoAnterior.isEmpty()){
					txtCampo.setText("-");
				} else {
					txtCampo.setText(textoAnterior + "-");
				}
			}

		});

		botoes[15].addActionListener(new ActionListener(){
			String[] values;
			int cont = 0;
			int [] numbers = new int[200];
			int resultado;

			@Override
			public void actionPerformed(ActionEvent event){
				if(txtCampo.getText().contains("+")){
					values = txtCampo.getText().split("[\\W]");
					for (String text : values){
						numbers[cont] = Integer.parseInt(text);
						cont++;
					}
					resultado = numbers[0] + numbers[1];
					txtCampo.setText(Integer.toString(resultado));
					cont = 0;
				}

				else if (txtCampo.getText().contains("-")){
					values = txtCampo.getText().split("[\\W]");
					for (String text : values){
						numbers[cont] = Integer.parseInt(text);
						cont++;
					}
					resultado = numbers[0] - numbers[1];
					txtCampo.setText(Integer.toString(resultado));
					cont = 0;
				}

				else if(txtCampo.getText().contains("*")){
					values = txtCampo.getText().split("[\\W]");
					for (String text : values){
						numbers[cont] = Integer.parseInt(text);
						cont++;
					}
					resultado = numbers[0] * numbers[1];
					txtCampo.setText(Integer.toString(resultado));
					cont = 0;
				}

				else if(txtCampo.getText().contains("/")){
					values = txtCampo.getText().split("[\\W]");
					for (String text : values){
						numbers[cont] = Integer.parseInt(text);
						cont++;
					}
					resultado = numbers[0] / numbers[1];
					txtCampo.setText(Integer.toString(resultado));
					cont = 0;
				}
			}

		});
	}

	private void componentes() {
		//tela
		setTitle("Calculadora");
		setBounds(600, 250, 300, 400);
		setLayout(null);
		this.getContentPane().setBackground(Color.BLACK);
		
		//textfield valor 1
		txtCampo = new JTextField();
		txtCampo.setBounds(47, 30, 200, 25);
		txtCampo.setBackground(Color.DARK_GRAY);
		txtCampo.setForeground(Color.white);
		add(txtCampo);

		//botões

		//Linha 1
		botoes[7] = new JButton("7");
		botoes[7].setBounds(50, 100, 45, 45);
		add(botoes[7]);

		botoes[8]  = new JButton("8");
		botoes[8] .setBounds(100, 100, 45, 45);
		add(botoes[8] );

		botoes[9] = new JButton("9");
		botoes[9] .setBounds(150, 100, 45, 45);
		add(botoes[9] );

		botoes[10]  = new JButton("/");
		botoes[10] .setBounds(200, 100, 45, 45);
		add(botoes[10] );

		//Linha 2
		botoes[4]  = new JButton("4");
		botoes[4] .setBounds(50, 150, 45, 45);
		add(botoes[4] );

		botoes[5]  = new JButton("5");
		botoes[5] .setBounds(100, 150, 45, 45);
		add(botoes[5] );

		botoes[6]  = new JButton("6");
		botoes[6] .setBounds(150, 150, 45, 45);
		add(botoes[6] );

		botoes[11]  = new JButton("*");
		botoes[11] .setBounds(200, 150, 45, 45);
		add(botoes[11] );

		//Linha 3
		botoes[1]  = new JButton("1");
		botoes[1] .setBounds(50, 200, 45, 45);
		add(botoes[1] );

		botoes[2]  = new JButton("2");
		botoes[2] .setBounds(100, 200, 45, 45);
		add(botoes[2] );

		botoes[3] = new JButton("3");
		botoes[3] .setBounds(150, 200, 45, 45);
		add(botoes[3] );

		botoes[12]  = new JButton("+");
		botoes[12] .setBounds(200, 200, 45, 45);
		add(botoes[12] );

		//Linha 4
		botoes[13]  = new JButton("C");
		botoes[13] .setBounds(50, 250, 45, 45);
		add(botoes[13] );

		botoes[0]  = new JButton("0");
		botoes[0] .setBounds(100, 250, 45, 45);
		add(botoes[0] );

		botoes[14]  = new JButton("-");
		botoes[14] .setBounds(150, 250, 45, 45);
		add(botoes[14] );

		botoes[15]  = new JButton("=");
		botoes[15] .setBounds(200, 250, 45, 45);
		add(botoes[15] );
	}

}
