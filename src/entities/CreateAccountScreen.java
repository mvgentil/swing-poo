package entities;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
	private JTextField passwordTextField;
	private JPasswordField passwordField;
	private JLabel statusLabel;

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
		
		ImageIcon welcomeImg = new ImageIcon("assets/img/welcome.jpg");
		JLabel welcomeImgLabel = new JLabel(welcomeImg);
		welcomeImgLabel.setBounds(306, 10, 612, 258);
		
		
		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setBounds(450, 270, 100, 20);
		
		firstNameTextField = new JTextField(50);
		firstNameTextField.setBounds(450, 290, 300, 30);
		
		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setBounds(450, 320, 320, 20);
		
		lastNameTextField = new JTextField(50);
		lastNameTextField.setBounds(450, 340, 300, 30);
		
		JLabel emailLabel = new JLabel("Email Address");
		emailLabel.setBounds(450, 370, 100, 20);
		
		emailTextField = new JTextField(30);
		emailTextField.setBounds(450, 390, 300, 30);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(450, 420, 100, 20);
		
		passwordField = new JPasswordField(5);
		passwordField.setBounds(450, 440, 300, 30);
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
		
		passwordTextField = new JTextField(30);
		passwordTextField.setBounds(450, 470, 300, 30);
		passwordTextField.setVisible(false);
		passwordTextField.setEnabled(false);
		
		JCheckBox showPasswordCheckBox = new JCheckBox("Show password");
		showPasswordCheckBox.setSelected(false);
		showPasswordCheckBox.setBounds(450, 500, 300, 30);
		showPasswordCheckBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				passwordTextField.setText(passwordField.getText());
				passwordTextField.setVisible(showPasswordCheckBox.isSelected());
			}
		});
		
        JButton createAccountButton = new JButton("Create Account");
        createAccountButton.setBounds(450,530,300,30);
        // Adiciona um listener no botao
        // para capturar o click
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createAccount();
            }
        });
        
        statusLabel = new JLabel("");
        statusLabel.setBounds(450, 560, 300, 30);
		
		//adicionar elementos no jpanel
		
		root.add(welcomeImgLabel);
		root.add(firstNameLabel);
		root.add(firstNameTextField);
		root.add(lastNameLabel);
		root.add(lastNameTextField);
		root.add(emailLabel);
		root.add(emailTextField);
		root.add(passwordLabel);
		root.add(passwordField);
		root.add(passwordTextField);
		root.add(showPasswordCheckBox);
		root.add(createAccountButton);
		root.add(statusLabel);
		
		
		setContentPane(root);
		
		setVisible(true);
	}
	
	private void createAccount() {
		String firstName = firstNameTextField.getText();
		String lastName = lastNameTextField.getText();
		String email = emailTextField.getText();
		String password = passwordField.getText();
		
		String msg = "";
		
        if(firstName.isBlank()){
            msg = "First name is not valid. ";
        }
        if(lastName.isBlank()){
            msg += "Last name is not valid. ";
        }		
        if(email.isBlank()){
            msg += "Email is not valid ";
        }
        if(password.isBlank()){
            msg += "Password is empty ";
        }
        
        if(msg.isBlank()) {
        	statusLabel.setText("Account Created!");
        }else {
        	statusLabel.setText("Check your info!");
        }
        
        if(statusLabel.getText() == "Account Created!") {
        	firstNameTextField.setText("");
        	lastNameTextField.setText("");
        	emailTextField.setText("");
        	passwordTextField.setText("");
        	passwordField.setText("");
        }
	}
}
