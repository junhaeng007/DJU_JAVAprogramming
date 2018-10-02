package day04;
import java.util.*;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하시오 : ");
		double score = input.nextDouble();
		
		if(score >= 90)
			System.out.println("학점 A");
		else if(score >= 80)
			System.out.println("학점 B");
		else if(score >= 70)
			System.out.println("학점 C");
		else if(score >= 60)
			System.out.println("학점 D");
		else
			System.out.println("학점 F");
		System.out.println("프로그램이 종료되었습니다.");
	}
}
