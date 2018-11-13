package day10;
import javax.swing.*;  //필요한 swing 컴포넌트 : JFrame, JButton
import java.awt.*;     //필요한 awt 컴포넌트 : Color, FlowLayout

public class MyFrame_myStudy extends JFrame{
	
	public MyFrame_myStudy() {
		super("나만의 프레임 ");  //타이틀명 = setTitle("나만의 프레임 1");
	}

	public static void main(String[] args) {
		
		MyFrame_myStudy mf = new MyFrame_myStudy();
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램을 종료한다, 주석처리해도 창은 제거되지만 프로그램이 종료되지 않는다.
		mf.setSize(300, 300);
		mf.setLocation(500, 200); //창 띄울때 창의 위치(절대 좌표), default값은 (0, 0)
		
		mf.setLayout(new FlowLayout()); //패널 & 애플릿의 디폴트 배치 관리자 - 왼쪽부터 오른쪽으로 버튼을 배치
		//mf.setLayout(new BorderLayout()) => 프레임, 애플릿, 대화상자같은 최상위 컨테이너의 디폴트 배치 관리자 - 동서남북과 가운데 중 하나로 추가 및 배치
		mf.getContentPane().setBackground(Color.yellow);
		
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		
		mf.add(button1);
		mf.add(button2);
		
		mf.setVisible(true);   //setVisible default값은 false다.

	}

}
