import java.awt.*;

import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon plates = new ImageIcon("..\\Chapter10\\src\\plates.gif");
		ImageIcon placeholder = new ImageIcon("..\\Chapter10\\src\\placeholder.gif");
		ImageIcon plates_all_broken = new ImageIcon("..\\Chapter10\\src\\plates_all_broken.gif");
		ImageIcon plates_two_broken = new ImageIcon("..\\Chapter10\\src\\plates_two_broken.gif");
		ImageIcon sticker = new ImageIcon("..\\Chapter10\\src\\sticker.gif");
		ImageIcon tiger_plush = new ImageIcon("..\\Chapter10\\src\\tiger_plush.gif");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 449, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel p = new JLabel();
		p.setHorizontalAlignment(SwingConstants.CENTER);
		p.setIcon(plates);
		p.setBounds(49, 11, 329, 93);
		panel.add(p);
		JLabel prize = new JLabel("");
		prize.setBounds(168, 166, 167, 84);
		panel.add(prize);
		
		JButton play = new JButton("Play");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Random rand = new Random();
				int int_random = rand.nextInt(2);
				
				if (int_random == 0) 
				{
					p.setIcon(plates_two_broken);
					prize.setIcon(sticker);
					play.setText ("Play Again");
				}
				
				if(int_random == 1) 
				{
					p.setIcon(plates_all_broken);
					prize.setIcon(tiger_plush);
					play.setText ("Play Again");
				}
				
			}
		});
		play.setBounds(158, 115, 101, 35);
		panel.add(play);
		
	}
}
