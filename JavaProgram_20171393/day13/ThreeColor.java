package day13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyPanel extends JPanel implements ActionListener {
	int light_number = 0;

	public MyPanel() {
		setLayout(new BorderLayout());
		JButton b = new JButton("신호등 변경");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(100, 10, 100, 100);
		g.drawOval(200, 10, 100, 100);
		g.drawOval(300, 10, 100, 100);

		if (light_number == 0) {
			g.setColor(Color.RED);
			g.fillOval(100, 10, 100, 100);
		} else if (light_number == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(200, 10, 100, 100);
		} else {
			g.setColor(Color.YELLOW);
			g.fillOval(300, 10, 100, 100);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (++light_number >= 3)
			light_number = 0;
		repaint();
	}
}

public class ThreeColor extends JFrame {
	public ThreeColor() {
		setTitle("신호등");
		add(new MyPanel());
		setSize(600, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ThreeColor();
	}
}