package day07;

public class Car {
	int speed;
	int distance;
	String color;
	
//	생성자는 반환형을 쓰지 않는다.
//	기본 생성자
	public Car() {}
//	인자 생성자 1
	public Car(String color, int speed) { 
		this.color = color;
		this.speed = speed;
	}
//	인자 생성자 2
	public Car(String color, int speed, int distance) {
//		this.color = color;
//		this.speed = speed;
		this(color, speed);
		this.distance = distance;
	}
	
	public void speedUp() {
		speed += 5;
	}
	
	public void breakdown() {
		speed -= 10;
	}
	
	public int getCurrentSpeed() {
		return speed;
	}

}
