package day07;

public class CarManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car dogCar = new Car();
		dogCar.speedUp();
		dogCar.speedUp();
		System.out.println(dogCar.getCurrentSpeed());
		
		dogCar.breakdown();
		System.out.println(dogCar.getCurrentSpeed());
	}

}
