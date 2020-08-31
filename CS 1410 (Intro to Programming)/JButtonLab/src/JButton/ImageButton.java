package JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButton extends JFrame{
	final JButton imgButton;
	final Icon clickImage;
	
	private class ButtonClickEventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			imgButton.setRolloverEnabled(false);
			imgButton.setIcon(clickImage);
		}
		
	}

	public ImageButton(){	
		setTitle("Lab Button");
		Icon image1 = new ImageIcon(getClass().getResource("/Images/Image1.png"));
		Icon image2 = new ImageIcon(getClass().getResource("/Images/Image2.png"));
		clickImage = new ImageIcon(getClass().getResource("/Images/Image3.gif"));
		imgButton = new JButton(image1);
		imgButton.setRolloverIcon(image2);
		add(imgButton);
		
		setVisible(true);
		setBounds(100, 100, 660, 660);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		imgButton.addActionListener(new ButtonClickEventHandler());
	}
	
}
