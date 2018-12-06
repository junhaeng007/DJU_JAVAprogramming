package day13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicTest extends JFrame {
	int x, y;

	public GraphicTest() {
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Basic Painting");
		add(new MyPanel());
		setVisible(true);
	}

	class MyPanel extends JPanel {

		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.ORANGE);
			g.fillRect(x, y, 100, 100);
		}
	}

	public static void main(String[] args) {
		new GraphicTest();
	}
}
