package frames;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import elements.GradientPanelMenu;
import resources.FrameColors;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import bank.BankAccount;
import bank.User;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class MainMenu extends JFrame {

	public JLabel lblUser;

	public MainMenu(User user) {
		//GENERAL PAGE SETTINGS
		setResizable(false);
		setTitle("Apil Bank");
        getContentPane();
        setSize(1440,1024);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
        JPanel menuPanel = new GradientPanelMenu();
        menuPanel.setLayout(null);
        
        JPanel header = new JPanel();
        header.setBackground(FrameColors.lightgray);
        
        JPanel pages = new JPanel();
        pages.setBackground(Color.GREEN);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(menuPanel, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(header, GroupLayout.PREFERRED_SIZE, 1090, GroupLayout.PREFERRED_SIZE)
        				.addComponent(pages, GroupLayout.PREFERRED_SIZE, 1090, GroupLayout.PREFERRED_SIZE)))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(menuPanel, GroupLayout.PREFERRED_SIZE, 1024, GroupLayout.PREFERRED_SIZE)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(header, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
        			.addComponent(pages, GroupLayout.PREFERRED_SIZE, 830, GroupLayout.PREFERRED_SIZE))
        );
        header.setLayout(null);
        
        lblUser = new JLabel();
        lblUser.setForeground(FrameColors.darkpink);
        lblUser.setFont(new Font("Moulpali", Font.PLAIN, 80));
        lblUser.setBounds(50, 53, 846, 97);
        lblUser.setText("Hi, " + user.getName());
        header.add(lblUser);
        pages.setLayout(new CardLayout(0, 0));
        
        JPanel functions = new JPanel();
        pages.add(functions, "functions");
        
        JPanel deposit = new JPanel();
        pages.add(new DepositFrame(), "deposit");
        
        JPanel loan = new JPanel();
        pages.add(loan, "loan");
        
        JPanel transfer = new JPanel();
        pages.add(transfer, "transfer");
        
        JPanel cheque = new JPanel();
        pages.add(cheque, "cheque");
        
        JPanel withdraw = new JPanel();
        pages.add(withdraw, "withdraw");
        getContentPane().setLayout(groupLayout);
	}
}
