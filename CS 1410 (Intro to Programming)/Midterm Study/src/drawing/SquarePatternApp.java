package drawing;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SquarePatternApp extends JFrame {

	public static void main(String[] args) {
		new SquarePatternApp().run();
	}
	
	public void run() {
		setBounds(100, 10, 500, 500);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    add(new SquarePattern());
	    setVisible(true);
	}

}
