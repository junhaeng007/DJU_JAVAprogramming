package day10;

public class Archer extends Hero{
	
	public void fireArrow() {
		System.out.println("불화살 쏘기");
	}

	@Override
	public void attack() {
		System.out.println("불화살 쏘기");
	}
}
