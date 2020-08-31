/**
 * @author Jesus Otteson
 * Assignment 6
 */

package FaceAssignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.SystemColor;

public class FaceAssignment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Here I have private "int"s that allow me to reset my switch statements that appear later on back to zero.
	 */
	private int whoseturnEyes = 0;
	private int whoseturnNose = 0;
	private int whoseturnMouth = 0;
	private int whoseturnFace = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaceAssignment frame = new FaceAssignment();
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
	public FaceAssignment() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 1053);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		/**
		 * Here I have my labels for my Eyes, Nose, Mouth, and Face.
		 * These have the images linked to them.
		 */
		JLabel labelEye1 = jlabelEye1(layeredPane);

		JLabel labelEye2 = jlabelEye2(layeredPane);

		JLabel labelEye3 = jlabelEye3(layeredPane);

		JLabel labelNose1 = jlabelNose1(layeredPane);

		JLabel labelNose2 = jlabelNose2(layeredPane);

		JLabel labelNose3 = jlabelNose3(layeredPane);

		JLabel labelMouth1 = jlabelMouth1(layeredPane);

		JLabel labelMouth2 = jlabelMouth2(layeredPane);

		JLabel labelMouth3 = jlabelMouth3(layeredPane);

		JLabel labelFace1 = jlabelFace1(layeredPane);

		layeredPane.setLayer(labelFace1, 1);

		JLabel labelFace2 = jlabelFace2(layeredPane);

		JLabel labelFace3 = jlabelFace3(layeredPane);

		/**
		 * These are my check boxes, they are labeled 'radio' before the face part
		 * because they use to be radio buttons but they are now check boxes.
		 */
		JCheckBox radioEyes = new JCheckBox("Eyes");
		radioEyes.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 20));
		radioEyes.setHorizontalAlignment(SwingConstants.CENTER);
		radioEyes.setBackground(SystemColor.activeCaption);
		radioEyes.setBorder(new EmptyBorder(50, 0, 50, 0));
		panel.add(radioEyes);

		JCheckBox radioNose = new JCheckBox("Nose");
		radioNose.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 20));
		radioNose.setHorizontalAlignment(SwingConstants.CENTER);
		radioNose.setBackground(SystemColor.activeCaption);
		radioNose.setBorder(new EmptyBorder(50, 0, 50, 0));
		panel.add(radioNose);

		JCheckBox radioMouth = new JCheckBox("Mouth");
		radioMouth.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 20));
		radioMouth.setHorizontalAlignment(SwingConstants.CENTER);
		radioMouth.setBackground(SystemColor.activeCaption);
		radioMouth.setBorder(new EmptyBorder(50, 0, 50, 0));
		panel.add(radioMouth);

		JButton buttonUpdate = new JButton("Update");
		buttonUpdate.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 20));
		buttonUpdate.setBackground(SystemColor.inactiveCaption);

		buttonUpdate.setBorder(new EmptyBorder(50, 50, 50, 50));
		panel.add(buttonUpdate);

		/**
		 * This is my action listener that goes through switch statements to bring different
		 * layers to the from or move them to the back.
		 */
		actionlistenerButtonUpdate(layeredPane, labelEye1, labelEye2, labelEye3, labelNose1, labelNose2, labelNose3,
				labelMouth1, labelMouth2, labelMouth3, labelFace1, labelFace2, labelFace3, radioEyes, radioNose,
				radioMouth, buttonUpdate);
	}

	private JLabel jlabelFace3(JLayeredPane layeredPane) {
		JLabel labelFace3 = new JLabel("");
		labelFace3.setIconTextGap(0);
		labelFace3.setHorizontalAlignment(SwingConstants.CENTER);
		labelFace3.setBorder(new EmptyBorder(10, 10, 10, 10));
		labelFace3.setHorizontalTextPosition(SwingConstants.CENTER);
		layeredPane.setLayer(labelFace3, 0);
		labelFace3.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\face3.jpg"));
		labelFace3.setBounds(-19, -32, 1150, 1049);
		layeredPane.add(labelFace3);
		return labelFace3;
	}

	private JLabel jlabelFace2(JLayeredPane layeredPane) {
		JLabel labelFace2 = new JLabel("");
		labelFace2.setIconTextGap(0);
		labelFace2.setHorizontalAlignment(SwingConstants.CENTER);
		labelFace2.setBorder(new EmptyBorder(10, 10, 10, 10));
		labelFace2.setHorizontalTextPosition(SwingConstants.CENTER);
		labelFace2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		layeredPane.setLayer(labelFace2, 0);
		labelFace2.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\face2.jpg"));
		labelFace2.setBounds(-19, -32, 1150, 1049);
		layeredPane.add(labelFace2);
		return labelFace2;
	}

	private JLabel jlabelFace1(JLayeredPane layeredPane) {
		JLabel labelFace1 = new JLabel("");
		labelFace1.setIconTextGap(0);
		labelFace1.setBorder(new EmptyBorder(10, 10, 10, 10));
		labelFace1.setHorizontalTextPosition(SwingConstants.CENTER);
		layeredPane.setLayer(labelFace1, 0);
		labelFace1.setHorizontalAlignment(SwingConstants.CENTER);
		labelFace1.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\face1.jpg"));
		labelFace1.setBounds(-19, -32, 1150, 1049);
		layeredPane.add(labelFace1);
		return labelFace1;
	}

	private void actionlistenerButtonUpdate(JLayeredPane layeredPane, JLabel labelEye1, JLabel labelEye2,
			JLabel labelEye3, JLabel labelNose1, JLabel labelNose2, JLabel labelNose3, JLabel labelMouth1,
			JLabel labelMouth2, JLabel labelMouth3, JLabel labelFace1, JLabel labelFace2, JLabel labelFace3,
			JCheckBox radioEyes, JCheckBox radioNose, JCheckBox radioMouth, JButton buttonUpdate) {
		buttonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {

				if (radioEyes.isSelected()) {

					layeredPane.setLayer(labelEye1, 0);
					layeredPane.setLayer(labelEye2, 0);
					layeredPane.setLayer(labelEye3, 0);

					switch (whoseturnEyes) {
					case 0:
						layeredPane.setLayer(labelEye1, 2);
						break;
					case 1:
						layeredPane.setLayer(labelEye2, 2);
						break;
					case 2:
						layeredPane.setLayer(labelEye3, 2);
						break;
					}

					whoseturnEyes++;
					if (whoseturnEyes > 2)
						whoseturnEyes = 0;
				}

				if (radioNose.isSelected()) {

					layeredPane.setLayer(labelNose1, 0);
					layeredPane.setLayer(labelNose2, 0);
					layeredPane.setLayer(labelNose3, 0);

					switch (whoseturnNose) {
					case 0:
						layeredPane.setLayer(labelNose1, 2);
						break;
					case 1:
						layeredPane.setLayer(labelNose2, 2);
						break;
					case 2:
						layeredPane.setLayer(labelNose3, 2);
						break;
					}

					whoseturnNose++;
					if (whoseturnNose > 2)
						whoseturnNose = 0;
				}

				if (radioMouth.isSelected()) {

					layeredPane.setLayer(labelMouth1, 0);
					layeredPane.setLayer(labelMouth2, 0);
					layeredPane.setLayer(labelMouth3, 0);

					switch (whoseturnMouth) {
					case 0:
						layeredPane.setLayer(labelMouth1, 2);
						break;
					case 1:
						layeredPane.setLayer(labelMouth2, 2);
						break;
					case 2:
						layeredPane.setLayer(labelMouth3, 2);
						break;
					}

					whoseturnMouth++;
					if (whoseturnMouth > 2)
						whoseturnMouth = 0;

				}

				if (!radioMouth.isSelected() && !radioEyes.isSelected() && !radioNose.isSelected()) {

					layeredPane.setLayer(labelFace1, 0);
					layeredPane.setLayer(labelFace2, 0);
					layeredPane.setLayer(labelFace3, 0);

					switch (whoseturnFace) {
					case 0:
						layeredPane.setLayer(labelFace1, 1);
						break;
					case 1:
						layeredPane.setLayer(labelFace2, 1);
						break;
					case 2:
						layeredPane.setLayer(labelFace3, 1);
						break;

					}

					whoseturnFace++;
					if (whoseturnFace > 2)
						whoseturnFace = 0;
				}
			}

		});
	}

	private JLabel jlabelMouth3(JLayeredPane layeredPane) {
		JLabel labelMouth3 = new JLabel("");
		labelMouth3.setHorizontalAlignment(SwingConstants.CENTER);
		labelMouth3.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\mouth3.png"));
		layeredPane.setLayer(labelMouth3, 0);
		labelMouth3.setBounds(334, 655, 384, 262);
		layeredPane.add(labelMouth3);
		return labelMouth3;
	}

	private JLabel jlabelMouth2(JLayeredPane layeredPane) {
		JLabel labelMouth2 = new JLabel("");
		layeredPane.setLayer(labelMouth2, 0);
		labelMouth2.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\mouth2.png"));
		labelMouth2.setBounds(311, 678, 468, 227);
		layeredPane.add(labelMouth2);
		return labelMouth2;
	}

	private JLabel jlabelMouth1(JLayeredPane layeredPane) {
		JLabel labelMouth1 = new JLabel("");
		layeredPane.setLayer(labelMouth1, 0);
		labelMouth1.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\mouth1.png"));
		labelMouth1.setBounds(-22, 588, 926, 317);
		layeredPane.add(labelMouth1);
		return labelMouth1;
	}

	private JLabel jlabelNose3(JLayeredPane layeredPane) {
		JLabel labelNose3 = new JLabel("");
		labelNose3.setIconTextGap(0);
		layeredPane.setLayer(labelNose3, 0);
		labelNose3.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\nose3.png"));
		labelNose3.setBounds(356, 446, 224, 219);
		layeredPane.add(labelNose3);
		return labelNose3;
	}

	private JLabel jlabelNose2(JLayeredPane layeredPane) {
		JLabel labelNose2 = new JLabel("");
		labelNose2.setIconTextGap(0);
		layeredPane.setLayer(labelNose2, 0);
		labelNose2.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\nose2.png"));
		labelNose2.setBounds(186, 336, 642, 411);
		layeredPane.add(labelNose2);
		return labelNose2;
	}

	private JLabel jlabelNose1(JLayeredPane layeredPane) {
		JLabel labelNose1 = new JLabel("");
		labelNose1.setIconTextGap(0);
		layeredPane.setLayer(labelNose1, 0);
		labelNose1.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\nose1.png"));
		labelNose1.setBounds(-125, 290, 739, 551);
		layeredPane.add(labelNose1);
		return labelNose1;
	}

	private JLabel jlabelEye3(JLayeredPane layeredPane) {
		JLabel labelEye3 = new JLabel("");
		labelEye3.setIconTextGap(0);
		layeredPane.setLayer(labelEye3, 0);
		labelEye3.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\eyes3.png"));
		labelEye3.setBounds(198, 269, 628, 251);
		layeredPane.add(labelEye3);
		return labelEye3;
	}

	private JLabel jlabelEye2(JLayeredPane layeredPane) {
		JLabel labelEye2 = new JLabel("");
		labelEye2.setIconTextGap(0);
		layeredPane.setLayer(labelEye2, 0);
		labelEye2.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\eyes2.png"));
		labelEye2.setBounds(-645, 69, 1534, 629);
		layeredPane.add(labelEye2);
		return labelEye2;
	}

	private JLabel jlabelEye1(JLayeredPane layeredPane) {
		JLabel labelEye1 = new JLabel("");
		layeredPane.setLayer(labelEye1, 0);
		labelEye1.setIconTextGap(1);
		labelEye1.setIcon(new ImageIcon(
				"C:\\Users\\Jp\\Documents\\School\\CSIS 1410 (Java)\\FaceAssignment\\src\\FaceAssignment\\images\\eyes1.png"));
		labelEye1.setBounds(298, 241, 373, 251);
		layeredPane.add(labelEye1);
		return labelEye1;
	}
}
