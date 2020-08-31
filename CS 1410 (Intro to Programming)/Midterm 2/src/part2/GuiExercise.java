package part2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;

public class GuiExercise extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiExercise frame = new GuiExercise();
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
	public GuiExercise() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 530);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JRadioButton rdbtnLight = new JRadioButton("Light");
		buttonGroup.add(rdbtnLight);
		rdbtnLight.setBorder(new EmptyBorder(0, 30, 0, 30));
		rdbtnLight.setHorizontalTextPosition(SwingConstants.RIGHT);
		rdbtnLight.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(rdbtnLight);
		rdbtnLight.setSelected(true);
		
		JLabel lblPurpleCloud = new JLabel("Purple Cloud");
		lblPurpleCloud.setForeground(Color.GRAY);
		lblPurpleCloud.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel.add(lblPurpleCloud);

		JRadioButton rdbtnDark = new JRadioButton("Dark");
		buttonGroup.add(rdbtnDark);
		rdbtnDark.setBorder(new EmptyBorder(0, 30, 0, 30));
		panel.add(rdbtnDark);

		JLabel lblImage = new JLabel("");
		lblImage.setOpaque(true);
		lblImage.setBackground(Color.WHITE);
		lblImage.setIcon(new ImageIcon(GuiExercise.class.getResource("/part2/images/Cloud (1).png")));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblImage, BorderLayout.CENTER);
		
		rdbtnLight.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	lblImage.setBackground(Color.WHITE);
	        	lblPurpleCloud.setForeground(Color.GRAY);
	        }
	    });
		
		rdbtnDark.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	lblImage.setBackground(Color.BLACK);
	        	lblPurpleCloud.setForeground(Color.BLACK);
	        }
	    });


	}
}
