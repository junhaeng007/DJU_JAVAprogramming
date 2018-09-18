package day03;
import java.util.*;

public class Box {

	public static void main(String[] args) {
		double W, H;
		Scanner input = new Scanner(System.in);
		
		System.out.print("사각형의 가로를 입력하시오 : ");
		W = input.nextFloat();
		System.out.print("사각형의 세로를 입력하시오 : ");
		H = input.nextFloat();
		
		System.out.println("사각형의 넓이는" + W*H);
		System.out.println("사각형의 둘레는" + 2.0*(W+H));
	}

}
