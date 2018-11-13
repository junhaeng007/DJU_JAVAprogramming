package day09;

public class Person {
	//has-a
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void showInfo() {
		System.out.println("===================");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
	}
}
