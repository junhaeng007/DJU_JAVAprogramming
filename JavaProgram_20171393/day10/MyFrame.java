package day10;
import javax.swing.*;  //필요한 swing 컴포넌트 : JFrame, JButton
import java.awt.*;     //필요한 awt 컴포넌트 : Color, FlowLayout

public class MyFrame extends JFrame{
	
	public MyFrame() {
		super("나만의 프레임 ");  //타이틀명 = setTitle("나만의 프레임 1");
	}

	public static void main(String[] args) {
		
		MyFrame mf = new MyFrame();
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램을 종료한다, 주석처리해도 창은 제거되지만 프로그램이 종료되지 않는다. 
		
		mf.setSize(500, 500);
		
		mf.add(new JButton("NORTH"), BorderLayout.NORTH);
		mf.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		mf.add(new JButton("EAST"), BorderLayout.EAST);
		mf.add(new JButton("WEST"), BorderLayout.WEST);
		mf.add(new JButton("CENTER"), BorderLayout.CENTER);
		
		mf.setVisible(true);   //setVisible default값은 false다.

	}

}
