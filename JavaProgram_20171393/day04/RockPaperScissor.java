package day04;
import java.util.*;

public class RockPaperScissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2): ");
		int user = sc.nextInt();
		
		int computer = random.nextInt(3);
		if( user == computer )
			System.out.println("인간과 컴퓨터가 비겼음");
		else if ((user == 0) && (computer == 2) || (user == 1) && (computer == 0) || (user == 2) && (computer == 1)) // 0은 1한테 지고 1은 2한테, 2는 0한테 진다.
			System.out.println("인간: " + user + " 컴퓨터: " + computer + " 인간 승리");
		else if ((computer == 0) && (user == 2) || (computer == 1) && (user == 0) || (computer == 2) && (user == 1))
			System.out.println("인간: " + user + " 컴퓨터: " + computer + " 컴퓨터 승리");
		else
			System.out.println("잘못된 입력입니다.");
	}
}
