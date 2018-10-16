package day07;

public class Account {
	private int balance;
	private String name, regNumber; //regNumber = 계좌번호
	
//	설정자(setter 메소드)
	public void setRegNumber(String regnum) {regNumber = regnum;}
	public void setName(String name) { this.name = name;}
	public void setBalance(int balance) { this.balance = balance;}
	
//	접근자(access 메소드)
	public String getRegNumber() {return regNumber;}
	public String getName() { return name;}
	public int getBalance() { return balance;}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Account obj = new Account();
//		obj.setName("Tom");
//		obj.setBalance(100000);
//		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + "입니다.");
//	}

}
