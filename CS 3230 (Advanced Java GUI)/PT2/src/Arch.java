import java.awt.*;
import java.net.*;
import javax.swing.*;

public class Arch extends JFrame {
	private static final long serialVersionUID = 1L;
	private ImageIcon image;
	private int border = 50;
	
	public Arch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			image = new ImageIcon(new URL("https://www.nps.gov/arch/photosmultimedia/upload/arches3.jpg"));
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(this, e, "Unable to display Image", JOptionPane.ERROR_MESSAGE);
		}
		
		add(new Display());
		pack();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - getWidth())/2, (screenSize.height - getHeight())/2);

		setVisible(true);
	}
	
	class Display extends JPanel {
		private static final long serialVersionUID = 1L;

		public Display() {
			setPreferredSize(new Dimension(image.getIconWidth() + border, image.getIconHeight() + border + 25));
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, image.getIconWidth()+border, image.getIconHeight()+border);
			
			image.paintIcon(this, g, border/2, border/2);
			
			String caption = "Delicate Arch";
			
			Font f = g.getFont().deriveFont(20F);
			g.setFont(f);
			f = f.deriveFont(f.getSize2D() * .8F);
			g.setFont(f);
			
			FontMetrics fm = g.getFontMetrics();
			int strWidth = fm.stringWidth(caption);
			
			g.setColor(Color.RED);
			g.drawString(caption, (getWidth() - strWidth)/2, getHeight() - (int)(25/3));
		}
	}

	public static void main(String[] args) {
		new Arch();
	}
}