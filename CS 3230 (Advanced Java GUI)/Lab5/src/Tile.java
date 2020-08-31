import java.awt.*;

import javax.swing.*;

abstract public class Tile extends JPanel{

	private static final long serialVersionUID = 1L;
	protected static final int WIDTH = 60;
    protected static final int HEIGHT = 75;

    protected final Color RED = Color.RED;
    protected final Color BLUE = Color.BLUE;
    protected final Color BLACK = Color.BLACK;
    protected final Color GREEN = Color.GREEN;
    protected final Color WHITE = Color.WHITE;
    protected final Color LGRAY = Color.lightGray;
    protected final Color CYAN = Color.CYAN;
    protected final Color YELLOW = Color.YELLOW;

    public boolean matches(Tile tile) {
        return tile != null && tile.getClass() == this.getClass();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setSize(WIDTH + 12, HEIGHT + 12);
        setPreferredSize(new Dimension(60, 80));
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint paint = new GradientPaint(0, HEIGHT, LGRAY, 10, 0, YELLOW);
        g2.setPaint(paint);
        g2.fillPolygon(new int[] {0, 5, 5, 0}, new int[] {10, 5, HEIGHT, HEIGHT + 5}, 4);
        g2.setColor(YELLOW);
        g2.fillPolygon(new int[] {0, 5, WIDTH + 5, WIDTH}, new int[] {HEIGHT + 5, HEIGHT, HEIGHT, HEIGHT + 5}, 4);
        g2.setColor(CYAN);
        g2.drawPolygon(new int[] {0, 5, 5, 0}, new int[] {10, 5, HEIGHT, HEIGHT + 5}, 4);
        g2.drawPolygon(new int[] {0, 5, WIDTH + 5, WIDTH}, new int[] {HEIGHT + 5, HEIGHT, HEIGHT, HEIGHT + 5}, 4);
        paint = new GradientPaint(0, HEIGHT, WHITE, 10, 0, LGRAY);
        g2.setPaint(paint);
        g2.fillPolygon(new int[] {5, 10, 10, 5}, new int[] {5, 0, HEIGHT - 5, HEIGHT}, 4);
        g2.setColor(LGRAY);
        g2.fillPolygon(new int[] {5, 10, WIDTH + 10, WIDTH + 5}, new int[] {HEIGHT, HEIGHT - 5, HEIGHT - 5, HEIGHT}, 4);
        g2.setColor(CYAN);
        g2.drawPolygon(new int[] {5, 10, 10, 5}, new int[] {5, 0, HEIGHT - 5, HEIGHT}, 4);
        g2.drawPolygon(new int[] {5, 10, WIDTH + 10, WIDTH + 5}, new int[] {HEIGHT, HEIGHT - 5, HEIGHT - 5, HEIGHT}, 4);
        paint = new GradientPaint(WIDTH, 0, WHITE, 10, HEIGHT, LGRAY);
        g2.setPaint(paint);
        g2.fillRect(10, 0, WIDTH, HEIGHT - 5);
        g2.setColor(CYAN);
        g2.drawRect(10, 0, WIDTH, HEIGHT - 5);
    }
}
