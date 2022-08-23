package mod;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JTextField txtUsuario;
	private JPasswordField pfSenha;
	private JLabel lbUsuario;
	private JLabel lbSenha;
	private JButton btLogar;
	private JButton btCancelar;
	
	@SuppressWarnings("unused")
	private static Login frame;
	
	public Login() {
		componentes();
		eventos();
	}

	private void eventos() {
		btLogar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String usuario = txtUsuario.getText();
				String senha = String.valueOf(pfSenha.getPassword());
				if(!usuario.equals("") && senha.equals("123")) {
					JOptionPane.showMessageDialog(null, "Ola " + usuario);
				}
				txtUsuario.setText("");
				pfSenha.setText("");
			}
			
		});
		
		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtUsuario.setText("");
				pfSenha.setText("");
			}
			
		});
	}

	private void componentes() {
		//tela
		setTitle("Login Usuario");
		setBounds(700, 300, 500, 350);
		setLayout(null);
		
		//label usuario
		lbUsuario = new JLabel("Usuario");
		lbUsuario.setBounds(60, 50, 100, 25);
		add(lbUsuario);
		
		//textfield usuario
		txtUsuario = new JTextField();
		txtUsuario.setBounds(120, 50, 280, 25);
		add(txtUsuario);
		
		//label senha
		lbSenha = new JLabel("Senha");
		lbSenha.setBounds(60, 150, 100, 25);
		add(lbSenha);
		
		//textfield usuario
		pfSenha = new JPasswordField();
		pfSenha.setBounds(120, 150, 280, 25);
		add(pfSenha);
		
		//botões
		btLogar = new JButton("Logar");
		btLogar.setBounds(60, 250, 150, 25);
		add(btLogar);
		
		btCancelar = new JButton("Cancelar");
		btCancelar.setBounds(250, 250, 150, 25);
		add(btCancelar);
	}

}
