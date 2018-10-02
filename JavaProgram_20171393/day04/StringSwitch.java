package day04;
import java.util.*;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("월의 이름을 영어로 입력하시오(1~6) : ");
		int check = 1;
		while(check == 1)
		{
			String month = input.next();
			switch(month)
			{
			case "january":
				System.out.println("1");
				check = 0;
				break;
			case "february":
				System.out.println("2");
				check = 0;
				break;
			case "march":
				System.out.println("3");
				check = 0;
				break;
			case "april":
				System.out.println("4");
				check = 0;
				break;
			case "may":
				System.out.println("5");
				check = 0;
				break;
			case "june":
				System.out.println("6");
				check = 0;
				break;
			default:
				System.out.println("1~6중에서만 입력하세요(영어로) : ");
				break;
			}
		}
	}
}
