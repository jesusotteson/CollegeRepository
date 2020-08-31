package labCoin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoinGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnQUARTER;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGUI frame = new CoinGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CoinGUI() {
		JPanel panel = setUp();
		JButton btnPENNY = makePenny(panel);
		JButton btnNICKEL = makeNickel(panel);
		JButton btnDIME = makeDime(panel);
		makeQuarter(panel);
		JLabel lblClickDaCoin = makeDisplay();
		createActionListeners(btnPENNY, btnNICKEL, btnDIME, lblClickDaCoin);
	}

	private void createActionListeners(JButton btnPENNY, JButton btnNICKEL, JButton btnDIME, JLabel lblClickDaCoin) {
		btnPENNY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblClickDaCoin.setText(Coin.PENNY.toString());
			}
		});
		
		btnNICKEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblClickDaCoin.setText(Coin.NICKEL.toString());
			}
		});
		
		btnDIME.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblClickDaCoin.setText(Coin.DIME.toString());
			}
		});
		
		btnQUARTER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblClickDaCoin.setText(Coin.QUARTER.toString());
			}
		});
	}

	private JLabel makeDisplay() {
		JLabel lblClickDaCoin = new JLabel("Click Da Coin Bradda");
		lblClickDaCoin.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickDaCoin.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 29));
		contentPane.add(lblClickDaCoin, BorderLayout.CENTER);
		return lblClickDaCoin;
	}

	private void makeQuarter(JPanel panel) {
		btnQUARTER = new JButton("");
		btnQUARTER.setIcon(new ImageIcon(CoinGUI.class.getResource("/labCoin/images/UsQuarter.png")));
		panel.add(btnQUARTER);
	}

	private JButton makeDime(JPanel panel) {
		JButton btnDIME = new JButton("");
		btnDIME.setIcon(new ImageIcon(CoinGUI.class.getResource("/labCoin/images/UsNickel.png")));
		panel.add(btnDIME);
		return btnDIME;
	}

	private JButton makeNickel(JPanel panel) {
		JButton btnNICKEL = new JButton("");
		btnNICKEL.setIcon(new ImageIcon(CoinGUI.class.getResource("/labCoin/images/UsDime.png")));
		panel.add(btnNICKEL);
		return btnNICKEL;
	}

	private JButton makePenny(JPanel panel) {
		JButton btnPENNY = new JButton("");
		btnPENNY.setIcon(new ImageIcon(CoinGUI.class.getResource("/labCoin/images/UsCent.png")));
		panel.add(btnPENNY);
		return btnPENNY;
	}

	private JPanel setUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		return panel;
	}

}
