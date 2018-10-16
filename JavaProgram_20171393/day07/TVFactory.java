package day07;

public class TVFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv1 = new Television();
		Television tv2 = new Television(15, 10, true);
		Television tv3 = new Television(5, 20, true);
		
		tv1.print();
		tv2.print();
		tv3.print();
	}

}
