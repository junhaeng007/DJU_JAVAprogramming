package day04;
import java.util.*;
public class LoopExample2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하시오 : ");
		int n = input.nextInt();
		int i = 1;
		while(i<10)
		{
			System.out.println(n + "*" + i + "=" + n * i++);
		}
	}
}
