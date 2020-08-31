package listVsSet;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.JLabel;

/**
 * Gui application that describes the two main difference between the
 * interfaces List and Set and that demonstrates the different
 * behaviors of a list and a set.
 * 
 * @authors ..............  and Margret Posch 
 *
 */
public class ListVsSetGui extends JFrame {
	private static final long serialVersionUID = -942561673068858105L;
	
	private JPanel contentPane;
	private CardLayout cardLayout = new CardLayout();
	private JTextArea textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListVsSetGui frame = new ListVsSetGui();
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
	public ListVsSetGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		setTitle("List vs Set Demo");
		
		JMenuBar menuBar = createMenuBar();
		setJMenuBar(menuBar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(cardLayout);
		
		// main difference panel
		JPanel mainDifferencePanel = createMainDifferencePanel();
		contentPane.add(mainDifferencePanel, "main difference");
		
		// demo panel
		JPanel demoPanel = createDemoPanel();
		contentPane.add(demoPanel, "demo");
	}

	/**
	 * Creates a panel that demonstrates the two main differences
	 * between lists and sets. 
	 * It does so by adding the same elements to the list and the set
	 * and then displaying the contents of both the list and the set.
	 * 
	 * @return the panel that demonstrates the main differences 
	 * 		between lists and sets.
	 */
	private JPanel createDemoPanel() {
		JPanel demoPanel = new JPanel();
		demoPanel.setLayout(new BorderLayout());
		
		// control panel
		JPanel controlPanel = new JPanel();
		controlPanel.setBorder(new EmptyBorder(15, 12, 0, 12));
		controlPanel.setLayout(new GridLayout(9, 0, 0, 0));
		
		JLabel lblYourChoice = new JLabel("Your Choice:");
		lblYourChoice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		controlPanel.add(lblYourChoice);
		
		JRadioButton rdbtnListElements = new JRadioButton("List Elements");
		controlPanel.add(rdbtnListElements);	
		
		JRadioButton rdbtnSetElements = new JRadioButton("Set Elements");
		controlPanel.add(rdbtnSetElements);	
		demoPanel.add(controlPanel, BorderLayout.WEST);	
		
		// text field
		textField = new JTextArea();
		textField.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textField.setBorder(new EmptyBorder(20, 20, 20, 15));
		textField.setColumns(10);
		demoPanel.add(textField, BorderLayout.CENTER);

		return demoPanel;
	}

	/**
	 * Creates a panel that describes the two main differences
	 * between lists and sets. 
	 */
	private JPanel createMainDifferencePanel() {
		JPanel mainDifferencePanel = new JPanel();
		mainDifferencePanel.setLayout(new BorderLayout(0, 0));
		
		JTextArea txtrTheMain = new JTextArea();
		txtrTheMain.setText("The 2 main differences between interface List and Set are:");
		txtrTheMain.setBorder(new EmptyBorder(15, 15, 15, 15));
		txtrTheMain.setFont(new Font("Arial", Font.PLAIN, 20));
		txtrTheMain.setBackground(new Color(141, 141, 131));
		txtrTheMain.setForeground(Color.WHITE);
		mainDifferencePanel.add(txtrTheMain);
		
		return mainDifferencePanel;
	}

	/**
	 * Create a menu bar with the following choices:
	 * Demo the behavior of lists and sets
	 * Describe the two main differences between lists and sets
	 * Exit the application
	 * 
	 * @return the menu bar
	 */
	private JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		
		// menu item "Demo"
		JMenuItem mntmDemo = new JMenuItem("Demo");
		mntmDemo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "demo");
			}
		});
		mntmDemo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mntmDemo);
		
		// menu item "Compare List and Set"
		JMenuItem mntmCompareListAndSet = new JMenuItem("Compare List and Set");
		mntmCompareListAndSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "main difference");
			}
		});
		mntmCompareListAndSet.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mntmCompareListAndSet);
		
		// menu item "Exit"
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mntmExit);
		return menuBar;
	}

}
