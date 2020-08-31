package LayoutLab;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LayoutManager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutManager frame = new LayoutManager();
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
	public LayoutManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel lblLable = new JLabel("Lable 1");
		lblLable.setOpaque(true);
		lblLable.setBackground(Color.RED);
		lblLable.setHorizontalAlignment(SwingConstants.CENTER);
		lblLable.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblLable);

		JButton btnClickMe = new JButton("Click Me");

		btnClickMe.setForeground(Color.WHITE);
		btnClickMe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		btnClickMe.setBackground(Color.BLUE);
		contentPane.add(btnClickMe);

		JLabel lblHi = new JLabel("Hi");
		lblHi.setOpaque(true);
		lblHi.setBackground(Color.RED);
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHi.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblHi);

		JButton btnButton = new JButton("Button");
		btnButton.setForeground(Color.WHITE);
		btnButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		btnButton.setBackground(Color.BLUE);
		contentPane.add(btnButton);

		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btnClickMe.getBackground().equals(Color.BLUE))
					btnClickMe.setBackground(Color.GREEN);
				else {
					btnClickMe.setBackground(Color.BLUE);
					lblHi.setBackground(Color.YELLOW);
				}
			}
		});
	}

}
