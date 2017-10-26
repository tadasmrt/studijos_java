package cikliniai_algoritmai;
import java.util.Scanner;
public class Uzd32 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		int a = reader.nextInt();
		reader.close();
		int sum=0;
		for (int i = 0; i <= a; i++) {
			sum = sum + i;
		}
		System.out.println("Visu skaitmenu suma = " + sum);
	}

}
