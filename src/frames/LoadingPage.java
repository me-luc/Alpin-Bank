package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import resources.FrameColors;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class LoadingPage extends JFrame {
	FrameColors frameColors = new FrameColors();
	static JPanel gradientPanel = new GradientPanel();
	private JTextField title;
	private static JTextField txtPctgLoading;
	private JProgressBar progressBar;
	
	public LoadingPage(JFrame jFrame) {
		setTitle("Apil Bank");
        getContentPane();
        setSize(1440,1024);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(gradientPanel, BorderLayout.CENTER);
        gradientPanel.setLayout(null);
        
        JPanel loadingRect = new JPanel();
        loadingRect.setBounds(467, 437, 491, 14);
        loadingRect.setOpaque(false);
        loadingRect.setBorder(new LineBorder(new Color(226, 195, 201), 2));;
        gradientPanel.add(loadingRect);
        
        title = new JTextField();
        title.setForeground(frameColors.darkpink);
        title.setFont(new Font("Moulpali Regular", Font.PLAIN, 100));
        title.setText("Alpin");
        title.setEditable(false);
        title.setBorder(null);
        title.setBounds(600, 290, 226, 157);
        gradientPanel.add(title);
        title.setColumns(10);
        title.setOpaque(false);
        
        //LOADING PERCENTAGE TEXT
        txtPctgLoading = new JTextField();
        txtPctgLoading.setHorizontalAlignment(SwingConstants.CENTER);
        txtPctgLoading.setText("");
        txtPctgLoading.setForeground(frameColors.white);
        txtPctgLoading.setFont(new Font("Moulpali Regular", Font.PLAIN, 25));
        txtPctgLoading.setEditable(false);
        txtPctgLoading.setOpaque(false);
        txtPctgLoading.setBorder(null);
        txtPctgLoading.setBounds(679, 461, 67, 33);
        gradientPanel.add(txtPctgLoading);
        txtPctgLoading.setColumns(10);
        
        progressBar = new JProgressBar();
        progressBar.setForeground(frameColors.lightpink);
        progressBar.setBounds(467, 437, 491, 14);
        progressBar.setOpaque(false);
        gradientPanel.add(progressBar);
        
        //LOADING THE BAR
        new Thread() {
        	public void run() {
        		int progress=0;
        		Random random = new Random();
        		while(progress<=100) {
        			try {
						sleep(100);
						progressBar.setValue(progress);
						txtPctgLoading.setText(progress + "%");
						System.out.println(progress);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
        			if(progress<90) {
        				progress += random.nextInt(8);
        			} else {
        				progress++;
        			}
        			if(progress==100) {
        				dispose();
        				jFrame.setVisible(true);
        			}
        		}
        	}
        }.start();
	}
}
