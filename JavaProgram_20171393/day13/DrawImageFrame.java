package day13;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawImageFrame extends JFrame {
	Image img;

	public DrawImageFrame() {
		ImageIcon icon = new ImageIcon("C:\\Users\\403\\Desktop\\JavaProgram_20171393\\src\\day12\\car.jpg");
		img = icon.getImage();				
		setSize(500, 200);
		MyPanel3 mp3 = new MyPanel3();
		mp3.setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		add(mp3);
		setVisible(true);
	}
	class MyPanel3 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this);	// 이미지를 화면의 원점에 그린다. 
		}
	}
	public static void main(String[] args) {
		DrawImageFrame f = new DrawImageFrame();
		f.pack();
		f.setResizable(false);  //사이즈 변경 여부확인
	}
}

