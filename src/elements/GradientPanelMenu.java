package elements;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import resources.FrameColors;

public class GradientPanelMenu extends JPanel {
	FrameColors frameColors = new FrameColors();
	protected void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		int width = 350;
		int height = 1024;
		
		Color color1 = frameColors.lightblue;
		Color color2 = frameColors.darkblue;
		GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
		g2D.setPaint(gp);
		g2D.fillRect(0, 0, width, height);
	}
}
