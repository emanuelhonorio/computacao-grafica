package slide2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

class CvRedRect extends Canvas {
	
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		Dimension d = getSize();
		int maxX = d.width - 1, maxY = d.height - 1;
		g.drawString("d.largura = " + d.width, 10, 30);
		g.drawString("d.altura = " + d.height, 10, 60);
		g.setColor(Color.red);
		g.drawRect(0, 0, maxX, maxY);
	}
}