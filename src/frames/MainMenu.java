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
import bank.BankApplication;
import bank.User;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu extends JFrame {

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
        
        JPanel pages = new JPanel();
        pages.setBounds(350, 0, 1090, 1024);
        pages.setBackground(Color.GREEN);
        pages.setLayout(new CardLayout(0, 0));
        
        JPanel functions = new JPanel();
        pages.add(functions, "functions");
        functions.setLayout(null);
        
        CardLayout c = (CardLayout) pages.getLayout();
        
        JLabel titleFunctions = new JLabel();
        titleFunctions.setBounds(75, 5, 456, 177);
        titleFunctions.setText("Hi, " + user.getName());
        titleFunctions.setForeground(new Color(201, 149, 162));
        titleFunctions.setFont(new Font("Moulpali", Font.PLAIN, 80));
        functions.add(titleFunctions);
        
        JPanel deposit = new JPanel();
        
        JPanel loan = new JPanel();
        pages.add(loan, "loan");
        loan.setLayout(null);
        
        JLabel titleLoan = new JLabel();
        titleLoan.setBounds(75, 5, 456, 177);
        titleLoan.setText("titleLoan");
        titleLoan.setForeground(new Color(201, 149, 162));
        titleLoan.setFont(new Font("Moulpali", Font.PLAIN, 80));
        loan.add(titleLoan);
        
        JPanel transfer = new JPanel();
        pages.add(transfer, "name_435898407657800");
        transfer.setLayout(null);
        
        JLabel titleTransfer = new JLabel();
        titleTransfer.setBounds(75, 5, 456, 177);
        titleTransfer.setText("Transfer");
        titleTransfer.setForeground(new Color(201, 149, 162));
        titleTransfer.setFont(new Font("Moulpali", Font.PLAIN, 80));
        transfer.add(titleTransfer);
        
        JPanel cheque = new JPanel();
        pages.add(cheque, "cheque");
        cheque.setLayout(null);
        
        JLabel titleCheque = new JLabel();
        titleCheque.setBounds(75, 5, 456, 177);
        titleCheque.setText("Cheque");
        titleCheque.setForeground(new Color(201, 149, 162));
        titleCheque.setFont(new Font("Moulpali", Font.PLAIN, 80));
        cheque.add(titleCheque);
        
        JPanel withdraw = new JPanel();
        pages.add(withdraw, "withdraw");
        withdraw.setLayout(null);
        
        JLabel titleWithdraw = new JLabel();
        titleWithdraw.setBounds(75, 5, 292, 177);
        titleWithdraw.setText("Withdraw");
        titleWithdraw.setForeground(new Color(201, 149, 162));
        titleWithdraw.setFont(new Font("Moulpali", Font.PLAIN, 80));
        withdraw.add(titleWithdraw);
        getContentPane().setLayout(null);
        getContentPane().add(menuPanel);
        
        JLabel homeIcon = new JLabel("");
        homeIcon.setBounds(51, 91, 37, 45);
        homeIcon.setIcon(new ImageIcon(MainMenu.class.getResource("/menu/icons/home-icon.png")));
        
        JLabel lblHome = new JLabel("Home");
        lblHome.setBounds(111, 91, 93, 45);
        lblHome.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 30));
        lblHome.setForeground(Color.WHITE);
        menuPanel.setLayout(null);
        
        JPanel logoutButton = new JPanel();
        logoutButton.addMouseListener(new MouseAdapter() {
        	@SuppressWarnings("static-access")
			@Override
        	public void mouseClicked(MouseEvent e) {
        		MainMenu.this.dispose();
        	}
        });
        logoutButton.setBounds(31, 471, 213, 70);
        logoutButton.setOpaque(false);
        menuPanel.add(logoutButton);
        
        JPanel settingsButton = new JPanel();
        settingsButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
				c.show(pages, "settings");
        	}
        });
        settingsButton.setBounds(31, 372, 230, 70);
        settingsButton.setOpaque(false);
        menuPanel.add(settingsButton);
        
        JPanel historyButton = new JPanel();
        historyButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
				c.show(pages, "history");
        	}
        });
        historyButton.setBounds(31, 272, 213, 70);
        historyButton.setOpaque(false);
        menuPanel.add(historyButton);
        
        JPanel summaryButton = new JPanel();
        summaryButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
				c.show(pages, "summary");
        	}
        });
        summaryButton.setBounds(31, 177, 251, 70);
        summaryButton.setOpaque(false);
        menuPanel.add(summaryButton);
        
        JPanel homeButton = new JPanel();
        homeButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
				c.show(pages, "functions");
        	}
        });
        homeButton.setBounds(31, 84, 213, 70);
        homeButton.setOpaque(false);
        menuPanel.add(homeButton);
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
        
        JLabel lblHistory = new JLabel("History");
        lblHistory.setForeground(Color.WHITE);
        lblHistory.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 30));
        lblHistory.setBounds(111, 283, 171, 45);
        menuPanel.add(lblHistory);
        
        JLabel settingsIcon = new JLabel("");
        settingsIcon.setIcon(new ImageIcon(MainMenu.class.getResource("/menu/icons/settingsicon.png")));
        settingsIcon.setBounds(51, 383, 50, 45);
        menuPanel.add(settingsIcon);
        
        JLabel lblSettings = new JLabel("Settings");
        lblSettings.setForeground(Color.WHITE);
        lblSettings.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 30));
        lblSettings.setBounds(111, 383, 183, 45);
        menuPanel.add(lblSettings);
        
        JLabel logoutIcon = new JLabel("");
        logoutIcon.setIcon(new ImageIcon(MainMenu.class.getResource("/menu/icons/Group.png")));
        logoutIcon.setBounds(51, 484, 37, 45);
        menuPanel.add(logoutIcon);
        
        JLabel lblLogout = new JLabel("Log out");
        lblLogout.setForeground(Color.WHITE);
        lblLogout.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 30));
        lblLogout.setBounds(111, 484, 133, 45);
        menuPanel.add(lblLogout);
        getContentPane().add(pages);
        
        JPanel summary = new JPanel();
        pages.add(summary, "summary");
        summary.setLayout(null);
        
        JLabel titleSummary = new JLabel();
        titleSummary.setBounds(75, 5, 456, 177);
        titleSummary.setText("Summary");
        titleSummary.setForeground(new Color(201, 149, 162));
        titleSummary.setFont(new Font("Moulpali", Font.PLAIN, 80));
        summary.add(titleSummary);
        
        JPanel settings = new JPanel();
        pages.add(settings, "settings");
        settings.setLayout(null);
        
        JLabel titleSettings = new JLabel();
        titleSettings.setBounds(75, 5, 456, 177);
        titleSettings.setText("Settings");
        titleSettings.setForeground(new Color(201, 149, 162));
        titleSettings.setFont(new Font("Moulpali", Font.PLAIN, 80));
        settings.add(titleSettings);
        
        JPanel history = new JPanel();
        pages.add(history, "history");
        history.setLayout(null);
        
        JLabel titleHistory = new JLabel();
        titleHistory.setBounds(75, 5, 456, 177);
        titleHistory.setText("History");
        titleHistory.setForeground(new Color(201, 149, 162));
        titleHistory.setFont(new Font("Moulpali", Font.PLAIN, 80));
        history.add(titleHistory);
        
        JPanel deposits = new JPanel();
        pages.add(deposits, "deposits");
        deposits.setLayout(null);
        
        JLabel titleDeposits = new JLabel();
        titleDeposits.setBounds(75, 5, 270, 177);
        titleDeposits.setText("Deposits");
        titleDeposits.setForeground(new Color(201, 149, 162));
        titleDeposits.setFont(new Font("Moulpali", Font.PLAIN, 80));
        deposits.add(titleDeposits);
	}
}
