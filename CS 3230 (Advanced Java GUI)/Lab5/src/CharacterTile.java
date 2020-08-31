import javax.swing.*;
import java.awt.Font;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

public class CharacterTile extends Tile {

	private static final long serialVersionUID = 1L;
	private static final Map<Character, String> validSymbols;
	private static final Map<Character, String> validSymbolNames;
	protected char symbol;
	static {
		validSymbols = new HashMap<>();
		validSymbols.put('1', "\u4E00");
		validSymbols.put('2', "\u4E8C");
		validSymbols.put('3', "\u4E09");
		validSymbols.put('4', "\u56DB");
		validSymbols.put('5', "\u4E94");
		validSymbols.put('6', "\u516D");
		validSymbols.put('7', "\u4E03");
		validSymbols.put('8', "\u516B");
		validSymbols.put('9', "\u4E5D");
		validSymbols.put('N', "\u5317");
		validSymbols.put('E', "\u6771");
		validSymbols.put('W', "\u897F");
		validSymbols.put('S', "\u5357");
		validSymbols.put('C', "\u4E2D");
		validSymbols.put('F', "\u767C");
		validSymbols.put('w', "\u842C");
		validSymbolNames = new HashMap<>();
		for (int i = 1; i < 10; i++) {
			validSymbolNames.put(Character.forDigit(i, 10), "Character " + i);
		}
		validSymbolNames.put('N', "North Wind");
		validSymbolNames.put('E', "East Wind");
		validSymbolNames.put('W', "West Wind");
		validSymbolNames.put('S', "South Wind");
		validSymbolNames.put('C', "Red Dragon");
		validSymbolNames.put('F', "Green Dragon");
	}

	public CharacterTile(char symbol) {
		this.symbol = symbol;
		setToolTipText(toString());

	}

	@Override
	public boolean matches(Tile other) {
		return super.matches(other) && this.symbol == ((CharacterTile) other).symbol;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Font font = g.getFont();
		g.setColor(RED);
		Font newFont = font.deriveFont(8f);
		g.setFont(newFont);
		g.drawString(String.valueOf(symbol), WIDTH, 15);
		g.setColor(BLACK);
		float size = 38f;
		int x = WIDTH / 2 - 10;
		int y = HEIGHT / 2 + 15;
		if (symbol == 'C') {
				g.setColor(RED);
		}
		else if (String.valueOf(symbol).matches("[1-9]")) {
			size = 18f;
			x = WIDTH / 2;
			y = HEIGHT / 2 - 10;
		}

		newFont = font.deriveFont(size);
		g.setFont(newFont);

		g.drawString(validSymbols.get(symbol), x, y);

		if (size == 18f) {
			g.setColor(RED);
			g.drawString(validSymbols.get('w'), x, y * 2);
		}
	}

	@Override
	public String toString() {
		return "Symbol " + symbol;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel tiles = new JPanel();
		JScrollPane scroller = new JScrollPane(tiles);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Character Tiles");
		frame.add(scroller);

		// Try something like this if your tiles don't fit on the screen.
		// Replace "tile width" and "tile height" with your values.
		//scroller.setPreferredSize(new Dimension(8 * tile width, 40 + tile height));

		tiles.add(new CharacterTile('1'));
		tiles.add(new CharacterTile('2'));
		tiles.add(new CharacterTile('3'));
		tiles.add(new CharacterTile('4'));
		tiles.add(new CharacterTile('5'));
		tiles.add(new CharacterTile('6'));
		tiles.add(new CharacterTile('7'));
		tiles.add(new CharacterTile('8'));
		tiles.add(new CharacterTile('9'));
		tiles.add(new CharacterTile('N'));
		tiles.add(new CharacterTile('E'));
		tiles.add(new CharacterTile('W'));
		tiles.add(new CharacterTile('S'));
		tiles.add(new CharacterTile('C'));
		tiles.add(new CharacterTile('F'));

		frame.pack();
		frame.setVisible(true);
	}
}