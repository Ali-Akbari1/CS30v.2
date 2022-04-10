import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 278, 191);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select a conversion type:");
		lblNewLabel.setBounds(10, 55, 174, 14);
		frame.getContentPane().add(lblNewLabel);
		JLabel disp = new JLabel("");
		
		JComboBox cb = new JComboBox();
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String con = " ";
				
				if (cb.getSelectedItem().equals("inches to centimetres"))
				{
					con = "1 inch = 2.54 centimetres";
				} 
				else if(cb.getSelectedItem().equals("feet to metres")) 
				{
					con = "1 foot = 0.3048 metres";
				}
				else if (cb.getSelectedItem().equals("gallons to liters"))
				{
					con = "1 gallon = 4.5461 liters";
				} 
				else if (cb.getSelectedItem().equals("pounds to kilograms"))
				{
					con = "1 pound = 0.4536 kilograms";
				}
				disp.setText(con);
				
			}
		});
		cb.setModel(new DefaultComboBoxModel(new String[] {"", "feet to metres", "inches to centimetres", "gallons to liters", "pounds to kilograms"}));
		cb.setBounds(10, 80, 190, 22);
		frame.getContentPane().add(cb);
		
		disp.setBounds(10, 113, 190, 28);
		frame.getContentPane().add(disp);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Metric Conversion<br/>By: Ali Akbari<html>");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(59, 11, 156, 33);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
