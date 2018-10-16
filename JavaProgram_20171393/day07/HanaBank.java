package day07;

public class HanaBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account();
		
		account1.setRegNumber("111-222-333");
		account1.setName("홍길동");
		account1.setBalance(100000);

		
		System.out.println("현재 계좌번호: " + account1.getRegNumber());
		System.out.println("현재 예금주: " + account1.getName());
		System.out.println("현재 잔액: " + account1.getBalance());
	}

}
