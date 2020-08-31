import java.awt.Graphics;

public class WhiteDragonTile extends Tile {

	private static final long serialVersionUID = 1L;

	public WhiteDragonTile() {
		setToolTipText(toString());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(BLUE);
		int x1;
		int y1 = 10;
		int x2;
		int y2 = HEIGHT - 15;
		for (x1 = 20; x1 <= WIDTH - 5; x1 += 12) {
			g.fillRect(x1, y1, 6, 4);
			x2 = x1 + 6;
			if (x2 != WIDTH) {
				g.fillRect(x2, y2, 7, 4);
			}
		}
		g.setColor(BLACK);
		for (x1 = 26; x1 <= WIDTH; x1 += 12) {
			if (x1 != WIDTH) {
				g.drawRect(x1, y1, 6, 3);
			}
			x2 = x1 - 6;
			g.drawRect(x2, y2, 6, 3);
		}
		x1 = 20;
		x2 = WIDTH - 2;
		for (y1 = 14; y1 < HEIGHT - 19; y1 += 10) {
			g.drawRect(x1, y1, 3, 5);
			y2 = y1 + 5;
			g.drawRect(x2, y2, 3, 5);
		}
		g.setColor(BLUE);
		for (y1 = 19; y1 < HEIGHT - 14; y1 += 10) {
			g.fillRect(x1, y1, 4, 6);
			y2 = y1 - 5;
			g.fillRect(x2, y2, 4, 6);
		}
	}

	@Override
	public String toString() {
		return "White Dragon";
	}
}