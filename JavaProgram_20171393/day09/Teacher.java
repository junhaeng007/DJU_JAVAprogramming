package day09;

public class Teacher extends Person {

	String t_ID;
	String t_Subject;
	
	public Teacher(String name, String address) {
		super(name, address); // 자식클래스인 Teacher에는 name, address가 없기 때문에 부모클래스 Person에서 빌려와야한다.
	}
	
	public Teacher(String name, String address, String ID, String Subject) {
		
		super(name, address);
		t_ID = ID;
		t_Subject = Subject;
	}
	
	@Override
	public void showInfo() {
		super.showInfo(); //Teacher은 Person의 자식클래스이므로
		System.out.println("아이디 : " + t_ID);
		System.out.println("과목 : " + t_Subject);
	}
	
	public String getT_ID() {
		return t_ID;
	}
}
