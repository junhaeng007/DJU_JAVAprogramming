package day04;
import java.util.*;

public class RockPaperScissor_mine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random computer = new Random();
		Scanner input = new Scanner(System.in);
		int user = -1;
		int check = 1;
		while(check == 1)
		{
			System.out.print("패를 선택하세요(0.가위 | 1.바위 | 2.보) : ");
			user = input.nextInt();
			if(user == 0)
			{
				System.out.println("가위를 선택하셨습니다.");
				check = 0;
			}
			else if(user == 1)
			{
				System.out.println("바위를 선택하셨습니다.");
				check = 0;
			}
			else if(user == 2)
			{
				System.out.println("보를 선택하셨습니다.");
				check = 0;
			}
			else
				System.out.println("(0.가위 | 1.바위 | 2.보)중에서 선택하세요.");
		}
		
		int com = computer.nextInt(3);
		if(com == 0)
			System.out.println("컴퓨터는 가위를 선택");
		else if(com == 1)
			System.out.println("컴퓨터는 바위를 선택");
		else
			System.out.println("컴퓨터는 보를 선택");
		
		System.out.println(user + "," + com);
		
		if (com == user)
			System.out.println("무승부!");
		else if((user - com == 1) | (user - com == -2))
			System.out.println("유저의 승리!");
		else
			System.out.println("컴퓨터의 승리!");
	}
}
