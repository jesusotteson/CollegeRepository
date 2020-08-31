package firstGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class myfirstGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myfirstGUI frame = new myfirstGUI();
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
	public myfirstGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblMyFirstGui = new JLabel("GUI");
		lblMyFirstGui.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyFirstGui.setFont(new Font("Elephant", Font.PLAIN, 33));
		lblMyFirstGui.setForeground(Color.GREEN);
		lblMyFirstGui.setOpaque(true);
		lblMyFirstGui.setBackground(Color.BLUE);
		contentPane.add(lblMyFirstGui, BorderLayout.NORTH);
		
		JButton btnWest = new JButton("Kanye West");
		
		contentPane.add(btnWest, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.WHITE);
		lblName.setOpaque(true);
		lblName.setBackground(Color.DARK_GRAY);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(txtName);
		txtName.setColumns(16);
		
		JLabel lblTheManThe = new JLabel("THE MAN THE LEGEND");
		lblTheManThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheManThe.setFont(new Font("Tekton Pro", Font.PLAIN, 31));
		lblTheManThe.setOpaque(true);
		lblTheManThe.setForeground(Color.ORANGE);
		lblTheManThe.setBackground(Color.RED);
		contentPane.add(lblTheManThe, BorderLayout.CENTER);
		
		btnWest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMyFirstGui.setBackground(Color.ORANGE);
				lblTheManThe.setForeground(Color.BLUE);
			}
		});
	}

}
