import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class BambooTile extends RankTile {
	private static final long serialVersionUID = 1L;

	public BambooTile(int rank) {
		super(rank);
		setToolTipText(toString());
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int xStart;
		int yStart;
		Color[] colors;
		if (rank == 2) {
			xStart = (WIDTH - 10) / 2 + 10;
			yStart = 15;
			colors = new Color[]{BLUE, GREEN};
			drawVerticalBamboo(2, xStart, yStart, colors, g);
		} else if (rank == 3) {
			xStart = (WIDTH - 10) / 2 + 2;
			yStart = 35;
			drawBamboo(xStart, yStart, GREEN, g);
			drawBamboo(xStart + 20, yStart, GREEN, g);
			drawBamboo(xStart + 10, yStart - 20, BLUE, g);
		} else if (rank == 4) {
			xStart = (WIDTH - 10) / 2;
			yStart = 15;
			colors = new Color[]{BLUE, GREEN};
			drawVerticalBamboo(2, xStart, yStart, colors, g);
			xStart = (WIDTH - 10) / 2 + 20;
			colors = new Color[]{GREEN, BLUE};
			drawVerticalBamboo(2, xStart, yStart, colors, g);
		} else if (rank == 5) {
			xStart = 20;
			yStart = 15;
			colors = new Color[]{GREEN, BLUE};
			drawVerticalBamboo(2, xStart, yStart, colors, g);
			xStart = 50;
			colors = new Color[]{BLUE, GREEN};
			drawVerticalBamboo(2, xStart, yStart, colors, g);
			xStart = 35;
			yStart = 25;
			drawBamboo(xStart, yStart, RED, g);
		} else if (rank == 6) {
			xStart = 20;
			yStart = 15;
			colors = new Color[]{GREEN, BLUE};
			for (int i = 0; i < 3; i++) {
				drawVerticalBamboo(2, xStart + 15 * i, yStart, colors, g);
			}
		} else if (rank == 7) {
			xStart = 20;
			yStart = 23;
			colors = new Color[]{GREEN};
			drawVerticalBamboo(2, xStart, yStart, colors, g);
			drawVerticalBamboo(2, xStart + 30, yStart, colors, g);
			xStart = 35;
			yStart = 3;
			colors = new Color[]{RED, BLUE, BLUE};
			drawVerticalBamboo(3, xStart, yStart, colors, g);
		} else if (rank == 8) {
			xStart = 15;
			yStart = 15;
			colors = new Color[]{GREEN, BLUE};
			drawVerticalBamboo(2, xStart, yStart, colors, g);
			drawVerticalBamboo(2, xStart + 40, yStart, colors, g);
			drawAngledBamboo(xStart + 9, yStart, 45, GREEN, g);
			drawAngledBamboo(xStart + 3, yStart + 5, -45, GREEN, g);
			drawAngledBamboo(xStart + 6, yStart + 20, 45, BLUE, g);
			drawAngledBamboo(xStart - 33, yStart + 25, -45, BLUE, g);
		} else if (rank == 9) {
			xStart = 20;
			yStart = 3;
			colors = new Color[]{RED};
			drawVerticalBamboo(3, xStart, yStart, colors, g);
			xStart = 35;
			colors = new Color[]{BLUE};
			drawVerticalBamboo(3, xStart, yStart, colors, g);
			xStart = 50;
			colors = new Color[]{GREEN};
			drawVerticalBamboo(3, xStart, yStart, colors, g);
		}
	}

	private void drawVerticalBamboo(int bamboo, int xStart, int yStart, Color[] colors, Graphics g) {
		if (colors.length != bamboo) {
			if (colors.length == 1) {
				Color color = colors[0];
				colors = new Color[bamboo];
				for (int i = 0; i < bamboo; i++) {
					colors[i] = color;
				}
			}
		}
		int size = 20;
		for (int i = 0; i < bamboo; i++) {
			drawBamboo(xStart, yStart + size * i, colors[i], g);
		}
	}

	private void drawBamboo(int xStart, int yStart, Color c, Graphics g) {
		g.setColor(c);
		g.fillRect(xStart + 2, yStart + 1, 4, 15);
		g.fillOval(xStart, yStart, 8, 4);
		g.fillOval(xStart, yStart + 7, 8, 4);
		g.fillOval(xStart, yStart + 14, 8, 4);
		g.setColor(c.equals(WHITE) ? BLACK : WHITE);
		g.drawLine(xStart + 4, yStart + 3, xStart + 4, yStart + 6);
		g.drawLine(xStart + 4, yStart + 11, xStart + 4, yStart + 14);
	}

	private void drawAngledBamboo(int xStart, int yStart, int slope, Color c, Graphics g) {
		g.setColor(c);
		Graphics2D graphics = (Graphics2D) g;
		Rectangle body = new Rectangle(slope < 0 ? 2 : 3, 1, 4, 15);
		Ellipse2D top = new Ellipse2D.Float(0, 0, 8, 4);
		Ellipse2D middle = new Ellipse2D.Float(0, 7, 8, 4);
		Ellipse2D bottom = new Ellipse2D.Float(0, 14, 8, 4);
		Line2D topLine = new Line2D.Float(slope  < 0 ? 4 : 5, 3, 4, 6);
		Line2D bottomLine = new Line2D.Float(slope < 0 ? 4 : 5, 11, 4, 14);
		graphics.translate(xStart + 10, yStart);
		graphics.rotate(Math.toRadians(slope));
		graphics.fill(body);
		graphics.fill(top);
		graphics.fill(middle);
		graphics.fill(bottom);
		graphics.setColor(c.equals(WHITE) ? BLACK : WHITE);
		graphics.draw(topLine);
		graphics.draw(bottomLine);
		graphics.rotate(Math.toRadians(-slope));
		graphics.translate(-xStart, -yStart);
	}

	@Override
	public String toString() {
		if (rank < 2 || rank > 9) {
			return "Invalid Bamboo";
		}
		return "Bamboo " + rank;
	}

	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bamboo Tiles");

		frame.add(new BambooTile(2));
		frame.add(new BambooTile(3));
		frame.add(new BambooTile(4));
		frame.add(new BambooTile(5));
		frame.add(new BambooTile(6));
		frame.add(new BambooTile(7));
		frame.add(new BambooTile(8));
		frame.add(new BambooTile(9));

		frame.pack();
		frame.setVisible(true);
	}
}