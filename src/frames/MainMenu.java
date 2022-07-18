package frames;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import elements.GradientPanelMenu;
import frames.functions.DepositFrame;
import resources.FrameColors;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;

import bank.BankAccount;
import bank.User;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

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
        menuPanel.setBounds(0, 0, 350, 912);
        menuPanel.setMaximumSize(new Dimension(1024, 1024));
        
        JPanel header = new JPanel();
        header.setBounds(350, 0, 1090, 194);
        header.setBackground(FrameColors.lightgray);
        
        JPanel pages = new JPanel();
        pages.setBounds(350, 194, 1090, 830);
        pages.setBackground(Color.GREEN);
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
        DepositFrame depositFrame = new DepositFrame();
        pages.add(depositFrame, "deposit");
        
        JPanel loan = new JPanel();
        pages.add(loan, "loan");
        
        JPanel transfer = new JPanel();
        pages.add(transfer, "transfer");
        
        JPanel cheque = new JPanel();
        pages.add(cheque, "cheque");
        
        JPanel withdraw = new JPanel();
        pages.add(withdraw, "withdraw");
        getContentPane().setLayout(null);
        getContentPane().add(menuPanel);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.setBounds(0, 1174, 350, 70);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setOpaque(false);
        btnNewButton.setBorder(null);
        
        JLabel homeIcon = new JLabel("");
        homeIcon.setBounds(51, 91, 37, 45);
        homeIcon.setIcon(new ImageIcon(MainMenu.class.getResource("/menu/icons/home-icon.png")));
        
        JLabel lblHome = new JLabel("Home");
        lblHome.setBounds(111, 91, 93, 45);
        lblHome.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 30));
        lblHome.setForeground(Color.WHITE);
        menuPanel.setLayout(null);
        
        JLabel homeIcon_1 = new JLabel("");
        homeIcon_1.setBounds(0, 1174, 88, 0);
        menuPanel.add(homeIcon_1);
        menuPanel.add(btnNewButton);
        menuPanel.add(homeIcon);
        menuPanel.add(lblHome);
        
        JLabel summaryIcon = new JLabel("");
        summaryIcon.setIcon(new ImageIcon(MainMenu.class.getResource("/menu/icons/summary-icon.png")));
        summaryIcon.setBounds(51, 186, 37, 45);
        menuPanel.add(summaryIcon);
        
        JLabel lblSummary = new JLabel("Summary");
        lblSummary.setForeground(Color.WHITE);
        lblSummary.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 30));
        lblSummary.setBounds(111, 186, 156, 45);
        menuPanel.add(lblSummary);
        
        JLabel historyIcon = new JLabel("");
        historyIcon.setIcon(new ImageIcon(MainMenu.class.getResource("/menu/icons/history-icon.png")));
        historyIcon.setBounds(51, 283, 37, 45);
        menuPanel.add(historyIcon);
        
        JLabel lblHome_1_1 = new JLabel("History");
        lblHome_1_1.setForeground(Color.WHITE);
        lblHome_1_1.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 30));
        lblHome_1_1.setBounds(111, 283, 171, 45);
        menuPanel.add(lblHome_1_1);
        
        JLabel settingsIcon = new JLabel("");
        settingsIcon.setIcon(new ImageIcon(MainMenu.class.getResource("/menu/icons/settingsicon.png")));
        settingsIcon.setBounds(51, 383, 50, 45);
        menuPanel.add(settingsIcon);
        
        JLabel lblHome_1_2 = new JLabel("Settings");
        lblHome_1_2.setForeground(Color.WHITE);
        lblHome_1_2.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 30));
        lblHome_1_2.setBounds(111, 383, 183, 45);
        menuPanel.add(lblHome_1_2);
        
        JLabel logoutIcon = new JLabel("");
        logoutIcon.setIcon(new ImageIcon(MainMenu.class.getResource("/menu/icons/Group.png")));
        logoutIcon.setBounds(51, 484, 37, 45);
        menuPanel.add(logoutIcon);
        
        JLabel lblHome_1_3 = new JLabel("Log out");
        lblHome_1_3.setForeground(Color.WHITE);
        lblHome_1_3.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 30));
        lblHome_1_3.setBounds(111, 484, 133, 45);
        menuPanel.add(lblHome_1_3);
        
        JButton btnHome = new JButton("");
        btnHome.setBounds(0, 79, 350, 70);
        btnHome.setOpaque(false);
        btnHome.setBorder(null);
        menuPanel.add(btnHome);
        
        JButton btnHome_1 = new JButton(" ");
        btnHome_1.setOpaque(false);
        btnHome_1.setBorder(null);
        btnHome_1.setBounds(0, 174, 350, 70);
        menuPanel.add(btnHome_1);
        
        JButton btnHome_2 = new JButton("");
        btnHome_2.setOpaque(false);
        btnHome_2.setBorder(null);
        btnHome_2.setBounds(0, 270, 350, 70);
        menuPanel.add(btnHome_2);
        
        JButton btnHome_3 = new JButton("");
        btnHome_3.setOpaque(false);
        btnHome_3.setBorder(null);
        btnHome_3.setBounds(0, 373, 350, 70);
        menuPanel.add(btnHome_3);
        
        JButton btnHome_4 = new JButton("");
        btnHome_4.setOpaque(false);
        btnHome_4.setBorder(null);
        btnHome_4.setBounds(0, 470, 350, 70);
        menuPanel.add(btnHome_4);
        getContentPane().add(pages);
        getContentPane().add(header);
	}
}
