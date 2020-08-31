package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SquarePattern extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// TODO: write code to draw the building
		Random rand = new Random();
		// random RGB values
		int red;
		int green;
		int blue;

		setBackground(Color.WHITE);
		// draws building
		g.setColor(Color.BLACK);
		// g.drawRect(25, 25, 300, 600);
		// g.drawRect(140, 550, 60, 75);

		int x = 2;
		int y = 2;
		
		int maxHorizontalSize = 2;
		int maxVerticalSize = 2;
		
		// for loop for row
		for (int i = 0; i < maxHorizontalSize; i++) {
			x = 2;
			// for loop for number of windows
			for (int j = 0; j < maxVerticalSize; j++) {
				red = rand.nextInt(255);
				green = rand.nextInt(255);
				blue = rand.nextInt(255);
				Color c = new Color(red, green, blue);
				g.setColor(c);
				if (i == maxHorizontalSize - 1 && j == maxVerticalSize-2 ) {
					g.setColor(Color.black);
					
				}
					g.fillRect(x, y, 200, 200);
				
				x += 300; // ??? is this X plane and Y plane stuff
			}
			y += 300; // ???
		}

	}

}
