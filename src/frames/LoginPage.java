package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import resources.FrameColors;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class LoginPage extends JFrame {
	static JPanel gradientPanel = new GradientPanel();
	private JTextField txtTitle;
	private JPasswordField passwordField;
	private JTextField textField;
	private FrameColors frameColors = new FrameColors();
	private JButton btnSignIn;
	private JTextField username;
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
		
		//GENERAL PAGE SETTINGS
		setResizable(false);
		setTitle("Apil Bank");
        getContentPane();
        setSize(1440,1024);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(gradientPanel);
        gradientPanel.setLayout(null);
        
        //TITLE FIELD
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
        
        //PASSWORD FIELD
        passwordField = new JPasswordField("●●●●●●●●"){
			  @Override 
			  protected void paintComponent(Graphics g) {
			    if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
			      Graphics2D g2 = (Graphics2D) g.create();
			      g2.setPaint(getBackground());
			      g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
			          0, 0, getWidth() - 1, getHeight() - 1));
			      g2.dispose();
			    }
			    super.paintComponent(g);
			  }
			  @Override 
			  public void updateUI() {
			    super.updateUI();
			    setOpaque(false);
			    setBorder(new RoundedCornerBorder());
			  }
			};
        passwordField.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		passwordField.setText("");
        	}
        });
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordField.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField.setToolTipText("");
        passwordField.setBounds(520, 477, 385, 80);
        gradientPanel.add(passwordField);
        
        //USERNAME JTEXTFIELD
        username = new JTextField(){
			  @Override 
			  protected void paintComponent(Graphics g) {
			    if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
			      Graphics2D g2 = (Graphics2D) g.create();
			      g2.setPaint(getBackground());
			      g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
			          0, 0, getWidth() - 1, getHeight() - 1));
			      g2.dispose();
			    }
			    super.paintComponent(g);
			  }
			  @Override 
			  public void updateUI() {
			    super.updateUI();
			    setOpaque(false);
			    setBorder(new RoundedCornerBorder());
			  }
			};
        username.setBounds(520, 373, 385, 80);
        gradientPanel.add(username);
        username.setColumns(10);
    
        
        Border roundedBorder = new LineBorder(Color.green, 5, true); // the third parameter - true, says it's round
        
        
        
  
        
	}
}
