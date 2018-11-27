package day12;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest_1 extends JFrame implements ActionListener {
	
	JButton btn1;
	
	public EventTest_1() {
		setTitle("이벤트 연습");
		setVisible(true);
		setSize(400, 500);
		setLocationRelativeTo(null); // 가운데 고정
		setLayout(new FlowLayout()); // day10/MyFrame_myStudy 주석 참고
		
		btn1 = new JButton("버튼을 누르시오.");
		btn1.addActionListener(this);
		
		add(btn1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new EventTest_1();
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {

//1-1	String str = e.getActionCommand();
//1-2	if(str.equals("버튼을 누르시오")
//2-1	Object obj = e.getSource();
//2-2	if(obj == btn1)
/*3  */	if(e.getSource() == btn1) {
			btn1.setText("마침내 버튼이 눌려졌습니다.");
		}
		
	}

}
