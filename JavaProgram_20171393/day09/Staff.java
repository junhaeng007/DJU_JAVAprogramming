package day09;

public class Staff extends Person{

	String s_ID;
	
	public Staff(String name, String address, String s_ID) {
		super(name, address);
		this.s_ID = s_ID;
		// TODO Auto-generated constructor stub
	}

	public String getS_ID() {
		return s_ID;
	}
}
