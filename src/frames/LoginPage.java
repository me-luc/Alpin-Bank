package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Shape;

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
import java.awt.geom.RoundRectangle2D;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {
	static JPanel gradientPanel = new GradientPanel();
	private JTextField txtTitle;
	private JTextField txtForgotPassword;
	private JTextField txtCreateAccount;
	private JPasswordField passwordField;
	private JTextField textField;
	private FrameColors frameColors = new FrameColors();
	private JButton btnSignIn;
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
        txtTitle.setBounds(622, 244, 182, 102);
        gradientPanel.add(txtTitle);
        txtTitle.setColumns(10);
        
        txtForgotPassword = new JTextField();
        txtForgotPassword.setBounds(665, 671, 96, 19);
        gradientPanel.add(txtForgotPassword);
        txtForgotPassword.setColumns(10);
        
        txtCreateAccount = new JTextField();
        txtCreateAccount.setColumns(10);
        txtCreateAccount.setBounds(665, 707, 96, 19);
        gradientPanel.add(txtCreateAccount);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(520, 477, 385, 80);
        gradientPanel.add(passwordField);
        
        textField = new JTextField();
        textField.setBounds(520, 367, 385, 80);
        gradientPanel.add(textField);
        textField.setColumns(10);
        
        RoundedButton btnSignIn = new RoundedButton();
        btnSignIn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnSignIn.setFont(new Font("Montserrat", Font.BOLD, 25));
        btnSignIn.setBorderColor(frameColors.lightpink);
        btnSignIn.setText("Sign in");
        btnSignIn.setRadius(50);
        btnSignIn.setBackground(frameColors.lightpink);
        btnSignIn.setBounds(633, 586, 159, 55);
        
        gradientPanel.add(btnSignIn);
        
	}
}
