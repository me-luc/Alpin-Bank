package frames;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import resources.FrameColors;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {
	static JPanel gradientPanel = new GradientPanel();
	private JTextField txtTitle;
	private JTextField txtForgotPassword;
	private JTextField txtCreateAccount;
	private JButton btnSignIn;
	private JPasswordField passwordField;
	private JTextField textField;
	private FrameColors frameColors = new FrameColors();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				LoginPage loginPage = new LoginPage();
				loginPage.setVisible(true);
				/* ------ TURN THIS ON TO ADD LOADING FEATURE --------
				 * LoadingPage lPage = new  LoadingPage(loginPage);
				lPage.setVisible(true);*/
			}
		});
	}

	public LoginPage() {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		
		setResizable(false);
		setTitle("Apil Bank");
        getContentPane();
        setSize(1440,1024);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(gradientPanel);
        gradientPanel.setLayout(null);
        
        txtTitle = new JTextField();
        txtTitle.setText("Apil");
        txtTitle.setForeground(frameColors.darkpink);
        txtTitle.setFont(new Font("Moulpali Regular", Font.PLAIN, 80));
        txtTitle.setText("Alpin");
        txtTitle.setOpaque(false);
        txtTitle.setEditable(false);
        txtTitle.setBorder(null);
        txtTitle.setBounds(546, 244, 182, 102);
        gradientPanel.add(txtTitle);
        txtTitle.setColumns(10);
        
        txtForgotPassword = new JTextField();
        txtForgotPassword.setBounds(602, 671, 96, 19);
        gradientPanel.add(txtForgotPassword);
        txtForgotPassword.setColumns(10);
        
        txtCreateAccount = new JTextField();
        txtCreateAccount.setColumns(10);
        txtCreateAccount.setBounds(602, 707, 96, 19);
        gradientPanel.add(txtCreateAccount);
        
        btnSignIn = new JButton("Sign in");
        btnSignIn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnSignIn.setBounds(589, 586, 159, 55);
        btnSignIn.setOpaque(false);
        gradientPanel.add(btnSignIn);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(471, 477, 385, 80);
        gradientPanel.add(passwordField);
        
        textField = new JTextField();
        textField.setBounds(471, 367, 385, 80);
        gradientPanel.add(textField);
        textField.setColumns(10);
	}
}
