package day09;
import java.util.Scanner;
public class MovieArrayTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Movie[] list = new Movie[2];
		for(int i = 0; i < list.length; i++) {
			System.out.print("영화제목 : ");
			String title = input.nextLine();
			System.out.print("영화감독 : ");
			String director = input.nextLine();
			list[i] = new Movie(title, director);
		}
		for(int i = 0; i < list.length; i++) {
			System.out.println("{ " + list[i].title + ", " + list[i].director + " } ");
		}
	}
}
