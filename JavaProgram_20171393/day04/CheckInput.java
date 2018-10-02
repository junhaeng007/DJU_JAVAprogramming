package day04;
import java.util.*;
public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int month = 0;
		do
		{
			System.out.print("올바른 월을 입력하시오 [1-12] : ");
			month = input.nextInt();
		}while(1 > month || 12 < month);
		System.out.println("사용자가 입력한 월은 " + month);
	}
}
