package day13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPaintApp extends JFrame {
	int x, y;
	Vector<Point> list = new Vector<>();	

	class MyPanel4 extends JPanel {
		public MyPanel4() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent event) {
					x = event.getX();
					y = event.getY();
					list.add(new Point(x, y));
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (Point p : list)
			{
				g.setColor(Color.RED);
				g.fillOval(p.x, p.y, 10, 10); //fillOval(중심x좌표, 중심y좌표, 가로길이, 세로길이)
			}
		}
	}
	public MyPaintApp() {
		setSize(600, 150);
		setTitle("My Paint");
		setVisible(true);
		add(new MyPanel4());
	}

	public static void main(String[] args) {
		new MyPaintApp();
	}
}


