package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.BOLD;

public class Login extends JFrame {

    //Componentes

    private JTextField txtUsuario;
    private JPasswordField pfSenha;
    private JLabel lbUsuario, lbSenha, lbTitulo;
    private JButton btLogar, btCancelar;
    private static Login frame;


    public Login(){
        componetes();
        eventos();
    }

    private void componetes() {
        //Tela
        setTitle("Login Usuário");
        setBounds(300,0,700,500);
        setLayout(null);

        //Labels
        lbTitulo = new JLabel("Login Usuario");
        lbTitulo.setBounds(300,30,150,30);
        add(lbTitulo);

        lbUsuario = new JLabel("Usuario: ");
        lbUsuario.setBounds(220,120,150,30);
        add(lbUsuario);

        lbSenha = new JLabel("Senha: ");
        lbSenha.setBounds(220,200,150,30);
        add(lbSenha);

        //Caixas de Texto
        txtUsuario= new JTextField();
        txtUsuario.setBounds(300,120,170,30);
        add(txtUsuario);

        pfSenha = new JPasswordField();
        pfSenha.setBounds(300,200,170,30);
        add(pfSenha);


        //Botões
        btLogar = new JButton("Logar");
        btLogar.setBounds(220,300,120,30);
        btLogar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(btLogar);

        btCancelar = new JButton("Cancelar");
        btCancelar.setBounds(350,300,120,30);
        btCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(btCancelar);
    }

    private void eventos() {
        btLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String senha = String.valueOf(pfSenha.getPassword());
                if(txtUsuario.getText().equals("123") && senha.equals("123")){
                    JOptionPane.showMessageDialog(null,"Olá Hitalo");
                }else{
                    JOptionPane.showMessageDialog(null,"Usuario ou senha incorretos");

                }
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

    public void run(){
        Login tela = new Login();
        tela.setVisible(true);

    }
}
