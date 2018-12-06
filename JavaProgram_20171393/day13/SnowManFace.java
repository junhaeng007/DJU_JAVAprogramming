package day13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import day13.GraphicTest.MyPanel;

public class SnowManFace extends JFrame {

	class MyPanel extends JPanel {
		int x = 180, y = -180, z = 180;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.YELLOW);
			g.fillOval(20, 30, 200, 200);
			g.setColor(Color.BLACK);
			g.drawArc(50, 80, 50, 50, x, y);
			g.drawArc(143, 80, 50, 50, x, y);
			g.drawArc(70, 130, 100, 70, 180, z);
		}
	}

	public SnowManFace() {
		MyPanel mp;
		setSize(300, 300);
		setTitle("표정");

		JButton button = new JButton("울기");
		mp = new MyPanel();
		mp.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mp.x = 180;
				mp.y = 180;
				mp.z = -180;
				repaint();
			}
		});

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(mp);
	}

	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();
	}
}
//��ư����� ������ ��¾󱼷�