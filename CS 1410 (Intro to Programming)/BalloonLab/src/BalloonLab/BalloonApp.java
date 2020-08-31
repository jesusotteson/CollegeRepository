package BalloonLab;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class BalloonApp extends JFrame {

 static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalloonApp frame = new BalloonApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public BalloonApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblLabBalloon = new JLabel("Lab Balloon");
		lblLabBalloon.setFocusable(false);
		lblLabBalloon.setBorder(new EmptyBorder(10, 10, 10, 10));
		lblLabBalloon.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		lblLabBalloon.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLabBalloon, BorderLayout.NORTH);
		
		JPanel pnlInteraction = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlInteraction.getLayout();
		flowLayout.setVgap(25);
		contentPane.add(pnlInteraction, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Release the Balloons");
	
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnlInteraction.add(btnNewButton);
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setFocusable(false);
		lblResults.setHorizontalAlignment(SwingConstants.CENTER);
		lblResults.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnlInteraction.add(lblResults);
		
		JPanel pnlBalloon = new JPanel();
		contentPane.add(pnlBalloon, BorderLayout.CENTER);
		pnlBalloon.setLayout(new GridLayout(0, 2, 25, 20));
		
		JLabel lblNBalloon1 = new JLabel("Balloon 1");
		lblNBalloon1.setFocusable(false);
		lblNBalloon1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNBalloon1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		lblNBalloon1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNBalloon1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNBalloon1.setOpaque(true);
		lblNBalloon1.setBackground(Color.WHITE);
		lblNBalloon1.setHorizontalAlignment(SwingConstants.CENTER);
		pnlBalloon.add(lblNBalloon1);
		
		JLabel lblNBalloon2 = new JLabel("Balloon 2");
		lblNBalloon2.setFocusable(false);
		lblNBalloon2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNBalloon2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		lblNBalloon2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNBalloon2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNBalloon2.setOpaque(true);
		lblNBalloon2.setBackground(Color.WHITE);
		lblNBalloon2.setHorizontalAlignment(SwingConstants.CENTER);
		pnlBalloon.add(lblNBalloon2);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Random rand = new Random();
				
				Balloon b1 = new Balloon (Size.values()[rand.nextInt(Size.values().length)], rand.nextBoolean());
				Balloon b2 = new Balloon (Size.values()[rand.nextInt(Size.values().length)], rand.nextBoolean());
				lblNBalloon1.setIcon(new ImageIcon(BalloonApp.class.getResource(b1.getImagePath())));
				lblNBalloon2.setIcon(new ImageIcon(BalloonApp.class.getResource(b2.getImagePath())));
				
				lblNBalloon1.setText(b1.toString());
				lblNBalloon2.setText(b2.toString());
				
				if (b1.equals(b2)) lblResults.setText("You did it!");
				else lblResults.setText("WRONG, YOU ARE WRONG!");
			}
		});
	}

}
