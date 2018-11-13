package day10;
import java.util.*;
//필요한 유틸리티 : Random, StringTokenizer, Calendar 

public class Ex02_Test {

	public static void main(String[] args) {
		
//		1.0부터 100사이의 난수 출력
		Random random = new Random();
		int num = random.nextInt(100)+1;
		System.out.println(num);
		System.out.println("---------------");
		
//		2.StringTokenizer 클래스를 사용해서 따로 출력
		StringTokenizer callnumber1 = new StringTokenizer("082-2-777-5566", "-");
		while (callnumber1.hasMoreTokens()) {
	         System.out.println(callnumber1.nextToken());
	     }
		System.out.println("---------------");
		
//		2-1.String클래스의 split() 메소드 사용
		String[] callnumber2 = "082-2-777-5566".split("-");
		for(String token : callnumber2)
			System.out.println(token);
		System.out.println("---------------");
		
//		3.Calendar 클래스를 사용해서 오늘 날짜 출력
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR) + "/" + (today.get(Calendar.MONTH)+1) + "/" + today.get(Calendar.DATE));
		System.out.println("---------------");
		
//		4. Ex02_Test 클래스의 객체를 생성 & 이 객체를 통하여 객체를 생성한 클래스의 이름 출
		Ex02_Test et = new Ex02_Test();
		System.out.println(et.getClass());
	}

}
