package day03;
import java.util.*;

public class InputString {

	public static void main(String[] args) {
		String name;
		String tel;
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오 : ");
		name = input.nextLine();
		
		System.out.print("나이를 입력하시오 : ");
		age = input.nextInt();
		
		System.out.print("연락처를 입력하시오 : ");
		tel = input.next();             //nextLine()를 스면 엔터키를 잡아먹기 때문에 그냥 패스해버린다.
		
		System.out.println(name + "님 안녕하세요! " + age + "살이시네요. 이따 " + tel + "로 연락드리겠습니다.");
	}

}
