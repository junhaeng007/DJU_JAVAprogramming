package day07;
import java.util.*;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		int i, sum = 0, average;
		Random rand = new Random();
		
		for(i = 0; i <arr.length; i++) {
			arr[i] = rand.nextInt(100)+1;
			sum += arr[i];
			}
		
		average = sum / arr.length;
		System.out.println(sum + ", " + average);
	}
}
