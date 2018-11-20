package day11;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGame2 extends JFrame {
	int n1, n2, n3;
	JButton button1, button2, button3;

	// 생성자━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	public SimpleGame2() {
		setTitle("Simple Game Machine");
		setSize(300, 150);

		JPanel panel = new JPanel();

		button1 = new JButton("" + n1);
		button2 = new JButton("" + n2);
		button3 = new JButton("" + n3);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		panel.requestFocus();
		panel.setFocusable(true);

		add(panel);
		setVisible(true);

		panel.addKeyListener(new MyKeyListener());

	}//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

	// 내부 클래스 정의━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			if (keycode == KeyEvent.VK_ENTER) {
				Random rand = new Random();
				n1 = rand.nextInt(10);
				n2 = (int) (Math.random() * 10); // (0.0 ~ 0.9) * 10 = (0 ~ 9) 
				n3 = (int) (Math.random() * 10);
				button1.setText("" + n1);
				button2.setText("" + n2);
				button3.setText("" + n3);
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {}

		@Override
		public void keyTyped(KeyEvent e) {}

	}// 정의 끝━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

	public static void main(String[] args) {
		new SimpleGame2();
	}
}
