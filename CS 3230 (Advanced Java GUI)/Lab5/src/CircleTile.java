import javax.swing.*;
import java.awt.*;

public class CircleTile extends RankTile {

	private static final long serialVersionUID = 1L;

	public CircleTile(int rank) {
        super(rank);
        setToolTipText(toString());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int size;
        int xStart;
        int yStart;
        int spacing;
        Color[] colors;
        if (rank == 1) {
            size = 50;
            g.setColor(GREEN);
            g.fillOval(12, 9, size, size);
            size = 13;
            g.setColor(RED);
            g.fillOval(31, 28, size, size);
            drawSymbol(31, 28, size, g);
            size = 5;
            int numberOfCircles = 12;
            int x1 = 35;
            int y1 = 32;
            double rotation = 2 * Math.PI / numberOfCircles;
            for (int circle = 0; circle < numberOfCircles; circle++) {
                double position = circle * rotation;
                g.setColor(WHITE);
                g.fillOval((int) (x1 + Math.cos(position) * 20),
                        (int) (y1 + Math.sin(position) * 20),
                        size, size);
            }
        }
        if (rank == 2) {
            size = 23;
            xStart = 26;
            yStart = 8;
            spacing = 4;
            drawVerticalCircles(size, 2, xStart, yStart, spacing, new Color[]{GREEN, RED}, g);
        }
        if (rank == 3) {
            size = 17;
            xStart = 13;
            yStart = 8;
            colors = new Color[]{BLUE, RED, GREEN};
            drawDiagonalCircles(size, 3, xStart, yStart, -1, 0, colors, g);
        }
        if (rank == 4) {
            size = 23;
            xStart = 15;
            yStart = 8;
            spacing = 4;
            drawVerticalCircles(23, 2, xStart, yStart, spacing, new Color[]{BLUE, GREEN}, g);
            drawVerticalCircles(23, 2, xStart + size, yStart, spacing, new Color[]{GREEN, BLUE}, g);
        }
        if (rank == 5) {
            size = 17;
            xStart = 12;
            yStart = 5;
            spacing = 2 + size;
            colors = new Color[]{BLUE, GREEN};
            drawVerticalCircles(size, 2, xStart, yStart, spacing, colors, g);
            colors = new Color[]{RED};
            drawVerticalCircles(size, 1, xStart + size, yStart + size + 2, spacing, colors, g);
            colors = new Color[]{GREEN, BLUE};
            drawVerticalCircles(size, 2, xStart + size * 2, yStart, spacing, colors, g);
        }
        if (rank == 6) {
            size = 17;
            xStart = 18;
            yStart = 6;
            spacing = 2;
            colors = new Color[]{GREEN, RED, RED};
            drawVerticalCircles(size, 3, xStart, yStart, spacing, colors, g);
            drawVerticalCircles(size, 3, xStart + size + 5, yStart, spacing, colors, g);
        }
        if (rank == 7) {
            size = 13;
            xStart = 13;
            yStart = 4;
            spacing = -(size / 2) - 1;
            colors = new Color[]{GREEN};
            drawDiagonalCircles(size, 3, xStart, yStart, 5, spacing, colors, g);
            xStart = 18;
            yStart = (HEIGHT - 10) / 2;
            spacing = 4;
            colors = new Color[]{RED};
            drawVerticalCircles(size, 2, xStart, yStart, spacing, colors, g);
            drawVerticalCircles(size, 2, xStart + size * 2, yStart, spacing, colors, g);
        }
        if (rank == 8) {
            size = 13;
            xStart = 18;
            yStart = 3;
            spacing = 2;
            colors = new Color[]{BLUE};
            drawVerticalCircles(size, 4, xStart, yStart, spacing, colors, g);
            drawVerticalCircles(size, 4, xStart + size * 2, yStart, spacing, colors, g);
        }
        if (rank == 9) {
            size = 17;
            xStart = 12;
            yStart = 5;
            spacing = 2;
            colors = new Color[]{GREEN, RED, BLUE};
            drawVerticalCircles(size, 3, xStart, yStart, spacing, colors, g);
            drawVerticalCircles(size, 3, xStart + size, yStart, spacing, colors, g);
            drawVerticalCircles(size, 3, xStart + size * 2, yStart, spacing, colors, g);
        }
    }

    private void drawVerticalCircles(int size, int repeats, int x, int y, int spacing, Color[] colors, Graphics g) {
        if (colors.length != repeats && colors.length == 1) {
            Color color = colors[0];
            colors = new Color[repeats];
            for (int i = 0; i < repeats; i++) {
                colors[i] = color;
            }
        }
        for (int i = 0; i < repeats; i++) {
            int yAdd = spacing * i + size * i;
            g.setColor(colors[i]);
            g.fillOval(x, y + yAdd, size, size);
            drawSymbol(x, y + yAdd, size, g);
        }
    }

    private void drawDiagonalCircles(int size, int circles, int xStart, int yStart, int xSpacing, int ySpacing, Color[] colors, Graphics g) {
        if (colors.length != circles && colors.length == 1) {
            Color color = colors[0];
            colors = new Color[circles];
            for (int i = 0; i < circles; i++) {
                colors[i] = color;
            }
        }
        for (int i = 0; i < circles; i++) {
            int x = xStart + i * (size + xSpacing);
            int y = yStart + i * (size + ySpacing);
            g.setColor(colors[i]);
            g.fillOval(x, y, size, size);
            drawSymbol(x, y, size, g);
        }
    }

    private void drawSymbol(int xStart, int yStart, int size, Graphics g) {
        int[] xPoints = {xStart + 4, xStart + (size / 3 * 2) + 3, xStart + size / 2,
                xStart + (size / 3) - 2, xStart + size - 3};
        int[] yPoints = {yStart + size / 3 + 1, yStart + size - 4, yStart + 2,
                yStart + size - 4, yStart + size / 3 + 1};
        g.setColor(WHITE);
        g.fillPolygon(xPoints, yPoints, 5);
    }

    @Override
    public String toString() {
        if (rank > 9 || rank < 1) return "Invalid Circle";
        return "Circle " + rank;
    }

    public static void main(String[] args)
    {
        JFrame	frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Circle Tiles");
        frame.add(new CircleTile(1));
        frame.add(new CircleTile(2));
        frame.add(new CircleTile(3));
        frame.add(new CircleTile(4));
        frame.add(new CircleTile(5));
        frame.add(new CircleTile(6));
        frame.add(new CircleTile(7));
        frame.add(new CircleTile(8));
        frame.add(new CircleTile(9));
        frame.pack();
        frame.setVisible(true);
    }
}