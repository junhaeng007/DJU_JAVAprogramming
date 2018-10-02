package day04;
import java.util.*;

//깜짝 퀴즈 !! : Random 클래스를 사용하여 1~3까지의 정수 난수를 생성하고 출력하시오.

public class RandomTest {

	public static void main(String[] args) {
		Random number = new Random();
		for(int i = 1; i <= 10; i++)
		{
			int num = number.nextInt(3)+1;
			System.out.println(num);
		}
	}
}
