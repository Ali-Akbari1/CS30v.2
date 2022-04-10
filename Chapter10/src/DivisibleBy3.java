import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField tf;
	private JTextField disp;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 447, 193);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		tf = new JTextField();
		tf.setBounds(187, 55, 222, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		disp = new JTextField();
		disp.setBounds(187, 98, 222, 20);
		frame.getContentPane().add(disp);
		disp.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter an integer:");
		lblNewLabel.setBounds(20, 53, 116, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String input = tf.getText();
				
				int i = Integer.parseInt(input);
				
				
				
				if (i % 3 >= 1)
				{
					disp.setText("Number is not divisible by 3");
				}
				else 
				{
					disp.setText("Number is divisible by 3");
				}
			}
			
		});
		btnNewButton.setBounds(10, 91, 167, 34);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("<html>Divisible By 3 Application<br/>By: Ali Akbari<html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(100, 11, 222, 33);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
