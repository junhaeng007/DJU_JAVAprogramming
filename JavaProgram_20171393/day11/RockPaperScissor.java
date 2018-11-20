package day11;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RockPaperScissor extends JFrame implements ActionListener {

	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
//	final VS static

	private JPanel panel;
	private JLabel output, information;
	private JButton rock, paper, scissor;

	public RockPaperScissor() {
		setTitle("가위, 바위, 보");
		setSize(400, 150);

		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		information = new JLabel("아래의 버튼 중에서 하나를 ㅡ클릭하시오!");

		output = new JLabel("Good Luck!");
		rock = new JButton("0: 가위");
		paper = new JButton("1: 바위");
		scissor = new JButton("2: 보");

		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);

		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);

		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new RockPaperScissor();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource(); // 버튼을 눌렀을 때 그 소스값을 JButton형 변수 b에 대입
		int user = Integer.parseInt("" + b.getText().charAt(0)); 
//		int형으로 변환 , EX) String형 "0: 가위" -> 0이라는 char형을 int형으로 변환 ==> 0이라는 숫자가 나옴
// 		※String형은 char형 데이터들의 배열형이므로 String형 데이터에서 추출된 0은 char형이다.

		Random random = new Random();
		int computer = random.nextInt(3); //0, 1, 2 중 무작위 선택

		if (user == computer)
			output.setText("인간: " + user + " 컴퓨터: " + computer + "   무승부");
		else if (user == (computer + 1) % 3)
			output.setText("인간: " + user + " 컴퓨터: " + computer + "   인간 승리");
		else
			output.setText("인간: " + user + " 컴퓨터: " + computer + "   컴퓨터 승리");
	}
}
