/**
 * Jp Otteson
 * Final Program
 */

package flippingCoins;

/**
 * Important Imports
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class MainGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUserInput;
	private JTextField txtHeadsValue;
	private JTextField txtTailsValue;

	/**
	 * The oh so glorious counter and Random variables, without them you'd get the same result over and over again.
	 */
	public int Head = 0;
	public int Tail = 0;
	Random r = new Random();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
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
	public MainGui() {
		setTitle("Flipping Coins");
		initialize();
	}
	/**
	 * Initializes the project
	 */
	private void initialize() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.DARK_GRAY);
		contentPane.add(topPanel, BorderLayout.NORTH);
		
		/**
		 * Creates the checkbox that lets the program know if the user will create multiple flips
		 */
		JCheckBox chckbxRunMultipleFlips = new JCheckBox("Run Multiple Flips");
		chckbxRunMultipleFlips.setOpaque(false);
		chckbxRunMultipleFlips.setForeground(Color.WHITE);
		chckbxRunMultipleFlips.setBackground(SystemColor.control);
		chckbxRunMultipleFlips.setFont(new Font("Tahoma", Font.PLAIN, 15));
		topPanel.add(chckbxRunMultipleFlips);

		/**
		 * The text field where user advises the program how many flips they want
		 */
		textUserInput = new JTextField();
		textUserInput.setEnabled(false);
		textUserInput.setHorizontalAlignment(SwingConstants.CENTER);
		textUserInput.setText("20");
		topPanel.add(textUserInput);
		textUserInput.setColumns(10);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.DARK_GRAY);
		contentPane.add(bottomPanel, BorderLayout.SOUTH);

		/**
		 * The label that states the box over is the counter for heads
		 */
		JLabel lblHeads = new JLabel("Heads: ");
		lblHeads.setOpaque(true);
		lblHeads.setForeground(Color.WHITE);
		lblHeads.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHeads.setBackground(new Color(64, 64, 64));
		lblHeads.setHorizontalAlignment(SwingConstants.RIGHT);
		bottomPanel.add(lblHeads);

		/**
		 * The counter for heads
		 */
		txtHeadsValue = new JTextField();
		txtHeadsValue.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		txtHeadsValue.setEditable(false);
		txtHeadsValue.setHorizontalAlignment(SwingConstants.CENTER);
		bottomPanel.add(txtHeadsValue);
		txtHeadsValue.setColumns(10);

		/**
		 * The label that states the box over is the counter for tails
		 */
		JLabel lblTails = new JLabel("Tails: ");
		lblTails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTails.setForeground(Color.WHITE);
		lblTails.setOpaque(true);
		lblTails.setBackground(Color.DARK_GRAY);
		lblTails.setHorizontalAlignment(SwingConstants.RIGHT);
		bottomPanel.add(lblTails);

		/**
		 * The counter for tails
		 */
		txtTailsValue = new JTextField();
		txtTailsValue.setHorizontalAlignment(SwingConstants.CENTER);
		txtTailsValue.setEditable(false);
		txtTailsValue.setColumns(10);
		txtTailsValue.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		bottomPanel.add(txtTailsValue);

		/**
		 * This buttons lets you flip the coin
		 */
		JButton btnFlip = new JButton("Flip");
		bottomPanel.add(btnFlip);

		/**
		 * This buttons lets you reset terrible life decisions...and resets the program so you can keep flipping that coin
		 */
		JButton btnReset = new JButton("Reset");
		bottomPanel.add(btnReset);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(MainGui.class.getResource("/flippingCoins/images/question.png")));
		contentPane.add(lblNewLabel, BorderLayout.CENTER);

		/**
		 * These are my Action Listeners, I keep them here because it keeps the code organized
		 */
		chckbxRunMultipleFlips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxRunMultipleFlips.isSelected()) {

					textUserInput.setEnabled(true);
					lblNewLabel
							.setIcon(new ImageIcon(MainGui.class.getResource("/flippingCoins/images/heads-tails.png")));

				} else {

					textUserInput.setEnabled(false);
					lblNewLabel.setIcon(new ImageIcon(MainGui.class.getResource("/flippingCoins/images/question.png")));

				}
			}
		});

		btnFlip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxRunMultipleFlips.isSelected()) {
					int amountofFlips = Integer.parseInt(textUserInput.getText());

					/**
					 * The Flipper logic, aka, how the program knows whats heads and whats tails and gives it a random almost unforeseen element in its characteristic
					 */
					for (int count = 0; count < amountofFlips; count++) {
						if (r.nextInt(2) == 0) {
							Tail += 1;
						} else {
							Head += 1;
						}
					}
				} else {

					if (r.nextInt(2) == 0) {
						lblNewLabel
								.setIcon(new ImageIcon(MainGui.class.getResource("/flippingCoins/images/tails.png")));
						Tail += 1;
					} else {
						Head += 1;
						lblNewLabel
								.setIcon(new ImageIcon(MainGui.class.getResource("/flippingCoins/images/heads.png")));
					}
				}
				txtHeadsValue.setText("" + Head);
				txtTailsValue.setText("" + Tail);

			}
		});

		btnReset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				chckbxRunMultipleFlips.setSelected(false);
				textUserInput.setEnabled(false);
				textUserInput.setText("20");
				lblNewLabel.setIcon(new ImageIcon(MainGui.class.getResource("/flippingCoins/images/question.png")));
				txtHeadsValue.setText("");
				txtTailsValue.setText("");
				Head = 0;
				Tail = 0;
			}
		});

	}
}
