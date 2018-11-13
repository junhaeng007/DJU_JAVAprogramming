package day10;

public class Wizard extends Hero{
	
	public void freezing() {
		System.out.println("얼리기");
	}

	@Override
	public void attack() {
		System.out.println("얼리기");
	}
}
