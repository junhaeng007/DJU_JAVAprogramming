package day09;

public class PersonTest {

	public static void main(String[] args) {
		Person[] person = new Person[2];
		person[0] = new Teacher("홍길동", "대전 동구 용운동", "010101", "자바");
		person[1] = new Staff("강길동", "대전 서구 월평동", "111111");
		
		for(int i = 0; i <= person.length; i++) {
			
			person[i].showInfo();
			
			if(person[i] instanceof Teacher) {//Teacher 인스턴스이면
				Teacher t = (Teacher)person[i];
				System.out.println("교사 정보 : " + t.getT_ID());
			}
			
			else if(person[i] instanceof Staff) {//Staff 인스턴스이면
				Staff t = (Staff)person[i];
				System.out.println("직원 정보 : " + t.getS_ID());
			}
		}
	}

}
