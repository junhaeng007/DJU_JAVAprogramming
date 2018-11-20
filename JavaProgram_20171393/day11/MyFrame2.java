package day11;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;	
import javax.swing.JLabel;

public class MyFrame2 extends JFrame {
	private JButton button;
	private JLabel label;
	int counter = 0;

	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		button = new JButton("증가");
		button.addActionListener(new MyListener()); // 이벤트처리 객체 등록
//		button.addActionListener(e -> { counter++; label.setText("카운터 값 :  "+counter); }) ==> 변수초기화랑 비슷한 원리, MyListener클래스 생성 필요X
		label = new JLabel("카운터 값 : " + counter);
		
		add(label, "Center");
		add(button, "East");
		setTitle("카운터값 출력");
		setVisible(true);
	}

// 	내부 클래스로 이벤트 처리 객체 구현
	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			counter++;
			label.setText("카운터 값 : " + counter);
		}
	}

	public static void main(String[] args) {
		new MyFrame2();
	}
}
