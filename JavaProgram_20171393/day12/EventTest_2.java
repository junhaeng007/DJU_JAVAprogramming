package day12;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventTest_2 extends JFrame implements ActionListener {
	
	JButton yellow, pink;
	JPanel jpanel;
	
	public EventTest_2() {
		setTitle("이벤트 연습");
		setVisible(true);
		setSize(400, 500);
		setLocationRelativeTo(null); // 가운데 고정
//		setLayout(new FlowLayout()); // day10/MyFrame_myStudy 주석 참고
		
		yellow = new JButton("노란색");
		pink = new JButton("분홍색");
		jpanel = new JPanel();
		jpanel.setLayout(new FlowLayout());
		
		yellow.addActionListener(/**this**/new ActionListener() {
			
			@Override//Ctrl + Space바 = 자동완성
			public void actionPerformed(ActionEvent e) {
				jpanel.setBackground(Color.YELLOW);
			}
		});
		
		pink.addActionListener(/**this**/new ActionListener() {
			
			@Override//Ctrl + Space바 = 자동완성
			public void actionPerformed(ActionEvent e) {
				jpanel.setBackground(Color.PINK);
			}
		});
		
		
		jpanel.add(yellow);
		jpanel.add(pink);
		add(jpanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new EventTest_2();
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

/**	@Override
	public void actionPerformed(ActionEvent e) {

  1-1	String str = e.getActionCommand();
  1-2	if(str.equals("버튼을 누르시오")
  2-1	Object obj = e.getSource();
  2-2	if(obj == btn1)
  3 	if(e.getSource() == btn1) {
			btn1.setText("마침내 버튼이 눌려졌습니다.");
		}
		
	}**/ //위에서 바로 해버림

}
