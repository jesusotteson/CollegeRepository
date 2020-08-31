package RadioTime;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class RadioFace extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioFace frame = new RadioFace();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public RadioFace() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnGrumpy = new JRadioButton("Grumpy");
		rdbtnGrumpy.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(rdbtnGrumpy);
		
		JRadioButton rdbtnSmile = new JRadioButton("Smile");
		rdbtnSmile.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(rdbtnSmile, BorderLayout.SOUTH);
		
		JRadioButton rdbtnBigSmile = new JRadioButton("Big Smile");
		rdbtnBigSmile.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(rdbtnBigSmile, BorderLayout.NORTH);
		
		JRadioButton rdbtnGlasses = new JRadioButton("Glasses");
		rdbtnGlasses.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(rdbtnGlasses, BorderLayout.WEST);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{rdbtnGrumpy, rdbtnSmile, rdbtnBigSmile, rdbtnGlasses}));
	}

}
