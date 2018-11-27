package day12;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	int img_size_x = 620, img_size_y = 240; //이미지 사이즈
	int img_x = 0, img_y = 0; //이미지 좌표
	int x = 800, y = 400; //공간 사이즈

	public MyFrame() {
		setSize(x, y);
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon("C:\\Users\\403\\Desktop\\JavaProgram_20171393\\src\\day12\\car.jpg");
		JPanel panel = new JPanel();
		
		button.setIcon(icon);
		button.setLocation(img_x, img_y);
		
		panel.add(button);
		panel.requestFocus(); // 역할??
		panel.setFocusable(true);
		panel.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP:
					if(img_y > 0)      //공간탈출 방지
						img_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					if(img_y < (y - img_size_y - 50 ))  //50은 버튼 크기와 이미지 크기 차이인 듯 하다
						img_y += 10;
					break;
				case KeyEvent.VK_LEFT:
					if(img_x > 0)
						img_x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					if(img_x < (x - img_size_x - 50 ))
						img_x += 10;
					break;
				}
				button.setLocation(img_x, img_y);
			}

			public void keyReleased(KeyEvent arg0) {
			}

			public void keyTyped(KeyEvent arg0) {
			}
		});
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
