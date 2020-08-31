import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class GUI {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{72, 75, 0, 0, 0, 75, 0};
		gridBagLayout.rowHeights = new int[]{29, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		
		
		JButton btnNorth = new JButton("North");
		btnNorth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "North");
			}
		});
		GridBagConstraints gbc_btnNorth = new GridBagConstraints();
		gbc_btnNorth.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNorth.insets = new Insets(0, 0, 5, 5);
		gbc_btnNorth.gridx = 3;
		gbc_btnNorth.gridy = 1;
		frame.getContentPane().add(btnNorth, gbc_btnNorth);
		
		JButton btnWest = new JButton("West");
		btnWest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "West");
			}
		});
		
		JButton btnEast = new JButton("East");
		btnEast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "East");
			}
		});
		GridBagConstraints gbc_btnEast = new GridBagConstraints();
		gbc_btnEast.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEast.insets = new Insets(0, 0, 5, 5);
		gbc_btnEast.gridx = 1;
		gbc_btnEast.gridy = 3;
		frame.getContentPane().add(btnEast, gbc_btnEast);
		GridBagConstraints gbc_btnSouth = new GridBagConstraints();
		gbc_btnSouth.insets = new Insets(0, 0, 5, 0);
		gbc_btnSouth.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnSouth.gridx = 5;
		gbc_btnSouth.gridy = 3;
		frame.getContentPane().add(btnWest, gbc_btnSouth);
		
		JButton btnSouth = new JButton("South");
		btnSouth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "South");
			}
		});
		GridBagConstraints gbc_btnSouth_1 = new GridBagConstraints();
		gbc_btnSouth_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnSouth_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnSouth_1.gridx = 3;
		gbc_btnSouth_1.gridy = 6;
		frame.getContentPane().add(btnSouth, gbc_btnSouth_1);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnDirections = new JMenu("Directions");
		menuBar.add(mnDirections);
		
		
		JMenuItem mntmNorth_1 = new JMenuItem("North");
		mnDirections.add(mntmNorth_1);
		mntmNorth_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "North");
			}
		});
		
		JMenuItem mntmSouth = new JMenuItem("South");
		mnDirections.add(mntmSouth);
		
		mntmSouth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "South");
			}
		});
		
		JMenuItem mntmEast = new JMenuItem("East");
		mnDirections.add(mntmEast);
		
		mntmEast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "East");
			}
		});
		
		JMenuItem mntmWest = new JMenuItem("West");
		mnDirections.add(mntmWest);
		mntmWest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "West");
			}
		});
	}
}
