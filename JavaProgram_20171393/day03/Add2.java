package day03;
import java.util.*; //Scanner 클래스 포함

public class Add2 {

	public static void main(String[] args) {
		//Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요:");
		int num1 = input.nextInt(); //10이라고 입력하면 input.nextInt()에 들어가고 num1에 10이 삽입됨
		
		System.out.print("두번째 정수를 입력하세요:");
		int num2 = input.nextInt(); //10이라고 입력하면 input.nextInt()에 들어가고 num1에 10이 삽입됨
		
		int sum = num1 + num2;
		
		System.out.println(sum);
	}

}
