import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Window.Type;

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
		frame = new JFrame("BLACK JACK");
		frame.setType(Type.UTILITY);
		frame.getContentPane().setForeground(Color.GREEN);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 1010, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		 
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.setBounds(249, 565, 97, 25);
		frame.getContentPane().add(btnPlay);
		
		JButton btnHit = new JButton("HIT");
		btnHit.setBounds(436, 565, 97, 25);
		frame.getContentPane().add(btnHit);
		
		JButton btnStand = new JButton("STAND");
		btnStand.setBounds(623, 565, 97, 25);
		frame.getContentPane().add(btnStand);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.YELLOW);
		Image img = new ImageIcon(this.getClass().getResource("0.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(-67, -73, 1087, 739);
		frame.getContentPane().add(label);
	}
}

