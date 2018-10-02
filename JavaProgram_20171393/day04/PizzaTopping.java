package day04;

public class PizzaTopping {

	public static void main(String[] args) {
		String[] toppings = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};
		
		for(int i = 0; i < toppings.length; i++)
			System.out.print(toppings[i] + " ");
		System.out.println("");
		for(String name : toppings)
			System.out.print(name + " ");
	}
}
