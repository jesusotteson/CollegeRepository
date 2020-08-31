package dice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Dice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dice frame = new Dice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Dice.class.getResource("/images/die-1.png")));
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		contentPane.add(label, BorderLayout.CENTER);
		
		JButton btnRoll = new JButton("Roll");
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Random rand = new Random();
				
				int i = rand.nextInt(7) + 1;
				
				label.setIcon(new ImageIcon(Dice.class.getResource("/images/die-" + i + ".png")));
				
			}
		});
		btnRoll.setForeground(Color.RED);
		btnRoll.setBackground(Color.BLACK);
		btnRoll.setFont(new Font("Cambria", Font.PLAIN, 20));
		contentPane.add(btnRoll, BorderLayout.SOUTH);
		
		JLabel lblDiceGame = new JLabel("Dice Game");
		lblDiceGame.setOpaque(true);
		lblDiceGame.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		lblDiceGame.setBackground(Color.BLACK);
		lblDiceGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiceGame.setForeground(Color.RED);
		contentPane.add(lblDiceGame, BorderLayout.NORTH);

	}

}
