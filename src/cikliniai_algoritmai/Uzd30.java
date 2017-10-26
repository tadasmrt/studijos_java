package cikliniai_algoritmai;
import java.util.Scanner;
public class Uzd30 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.print("Prasau ivesti skaiciu: ");
		int number = Integer.parseInt(reader.nextLine());
		int count = 1;
		
		System.out.println(number);
		
		while (count<number) {
			count++;
			System.out.println(count);
		}
	}
}
