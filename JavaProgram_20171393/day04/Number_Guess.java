package day04;
import java.util.*;

public class Number_Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int answer = rand.nextInt(101);
		Scanner input = new Scanner(System.in);
		int i = 0;
		while(true)
		{
			i++;
			System.out.print("정답을 추측하여 보시오 : ");
			int guess = input.nextInt();
			if(guess > answer)
				System.out.println("HIGH");
			else if(guess < answer)
				System.out.println("LOW");
			else
			{
				System.out.println("축하합니다. 시도횟수 = " + i);
				break;
			}
		}
	}
}
