package day13;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class imagePanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imagePanel window = new imagePanel();
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
	public imagePanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 210, 283);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(309, 31, 248, 197);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		panel2.setVisible(false);

		JButton btn1 = new JButton("New button");
		JButton btn2 = new JButton("New button");
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				panel2.setVisible(true);
				panel.setVisible(false);
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				panel2.setVisible(false);
				panel.setVisible(true);
			}
		});
		
		panel.add(btn1);
		panel2.add(btn2);
		btn1.setBounds(12, 34, 97, 23);
		btn2.setBounds(69, 63, 97, 23);
	}
}
