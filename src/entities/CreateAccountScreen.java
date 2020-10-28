package entities;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CreateAccountScreen extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField emailTextField;
	private JPasswordField passwordField;

	public CreateAccountScreen() {
		configurarTela();
	}
	
	private void configurarTela() {
		
		setTitle("Tela de cadastro");
		setSize(1200,720);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel root = new JPanel();
		
		root.setLayout(null);
		
		root.setBackground(Color.decode("#FFFFFF"));
		
		//inicia aqui
		
		//implementar a imagem de fundo aqui
		
		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setBounds(700, 200, 100, 20);
		
		firstNameTextField = new JTextField(50);
		firstNameTextField.setBounds(700, 220, 300, 30);
		
		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setBounds(700, 250, 100, 20);
		
		lastNameTextField = new JTextField(50);
		lastNameTextField.setBounds(700, 270, 300, 30);
		
		JLabel emailLabel = new JLabel("Email Address");
		emailLabel.setBounds(700, 300, 100, 20);
		
		emailTextField = new JTextField(30);
		emailTextField.setBounds(700, 320, 300, 30);
		
		JLabel passwordLabel = new JLabel("senha");
		passwordLabel.setBounds(700, 400, 100, 20);
		
		passwordField = new JPasswordField(5);
		passwordField.setBounds(700, 420, 300, 30);
		passwordField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				passwordField.setText(passwordField.getText());
			}
		});
		
		
		
		//termina aqui
		
		//adicionar elementos no jpanel
		
		root.add(firstNameLabel);
		root.add(firstNameTextField);
		root.add(lastNameLabel);
		root.add(lastNameTextField);
		root.add(emailLabel);
		root.add(emailTextField);
		root.add(passwordLabel);
		root.add(passwordField);
		
		
		setContentPane(root);
		
		setVisible(true);
	}
	
}
