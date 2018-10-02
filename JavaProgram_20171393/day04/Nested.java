package day04;
import java.util.*;

public class Nested {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int n = input.nextInt();
		
		if(n > 0)
			System.out.println("입력된 정수는 양수입니다.");
		else if(n < 0)
			System.out.println("입력된 정수는 음수입니다.");
		else
			System.out.println("입력된 정수는 0입니다.");
		System.out.println("프로그램이 종료되었습니다.");
	}
}
