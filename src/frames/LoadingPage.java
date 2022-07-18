package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import resources.FrameColors;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class LoadingPage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
        title.setForeground(FrameColors.darkpink);
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
        txtPctgLoading.setForeground(FrameColors.white);
        txtPctgLoading.setFont(new Font("Moulpali Regular", Font.PLAIN, 25));
        txtPctgLoading.setEditable(false);
        txtPctgLoading.setOpaque(false);
        txtPctgLoading.setBorder(null);
        txtPctgLoading.setBounds(679, 461, 67, 33);
        gradientPanel.add(txtPctgLoading);
        txtPctgLoading.setColumns(10);
        
        progressBar = new JProgressBar();
        progressBar.setForeground(FrameColors.lightpink);
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
