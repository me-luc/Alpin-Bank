package frames;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import resources.FrameColors;

class GradientPanel extends JPanel {
	FrameColors frameColors = new FrameColors();
	protected void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		int width = getWidth();
		int height = getHeight();
		
		Color color1 = frameColors.lightblue;
		Color color2 = frameColors.darkblue;
		GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
		g2D.setPaint(gp);
		g2D.fillRect(0, 0, width, height);
	}
}

