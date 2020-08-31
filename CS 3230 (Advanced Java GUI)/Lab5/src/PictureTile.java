import java.awt.*;

import javax.swing.*;

abstract public class PictureTile extends Tile{

	private static final long serialVersionUID = 1L;
	private String name;
    
    public PictureTile(String name) {
        this.name = name;
		
		setToolTipText(toString());
    }
 
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		ImageIcon image = new ImageIcon(getClass().getResource("images/" + name + ".png"));
		image = new ImageIcon(
				image.getImage().getScaledInstance(
						(int) (image.getIconWidth() * .8), 
						(int) (image.getIconHeight() * .8), 
						Image.SCALE_DEFAULT));
		
		int x = (WIDTH - image.getIconWidth()) / 2 + 10;
		int y = (HEIGHT - image.getIconHeight()) / 2;
		g.drawImage(image.getImage(), x, y, this);
	}


    @Override
    public String toString() {
        return "Picture " + name;
    }

    public static void main(String[] args)
    {
        JFrame	frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Picture Tiles");
        frame.add(new Bamboo1Tile());
        frame.add(new FlowerTile("Chrysanthemum"));
        frame.add(new FlowerTile("Orchid"));
        frame.add(new FlowerTile("Plum"));
        frame.add(new FlowerTile("Bamboo"));
        frame.add(new SeasonTile("Spring"));
        frame.add(new SeasonTile("Summer"));
        frame.add(new SeasonTile("Fall"));
        frame.add(new SeasonTile("Winter"));
        frame.pack();
        frame.setVisible(true);
    }
}
