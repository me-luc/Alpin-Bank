package frames;

import java.awt.Color;

import javax.swing.JPanel;

import resources.FrameColors;

public class ModelFunctionsPagePanel extends JPanel {
	int x = 0;
	int y = 0;
	int width = 0;
	int height = 0;
	@Override
	public void setBackground(Color bg) {
		super.setBackground(FrameColors.lightgray);
	}
	@Override
	public void setBounds(int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
	}
}
