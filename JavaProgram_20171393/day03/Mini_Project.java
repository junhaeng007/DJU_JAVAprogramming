package day03;
import java.util.*;

public class Mini_Project {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("화씨온도를 입력하시오 : ");
		double temp = input.nextDouble();
		
		System.out.println("섭씨온도는 " + 5.0/9.0*(temp - 32));

	}

}
