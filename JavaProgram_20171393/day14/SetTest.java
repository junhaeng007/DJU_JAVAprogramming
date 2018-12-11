package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetTest {
	public static void main(String[] args) {
		HashSet<Integer> lottoNumber = new HashSet<>();
		
		while(lottoNumber.size() < 6) {
			Random rand = new Random();
			lottoNumber.add(new Integer(rand.nextInt(45) + 1));
		}
		
		Iterator<Integer> iterator = lottoNumber.iterator();
		
		while(iterator.hasNext()) {	
			System.out.println(iterator.next() + " ");
		}
	}

}
