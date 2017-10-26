package cikliniai_algoritmai;
import java.util.Scanner;
public class Uzd33 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite skaiciu a: ");
		int a = reader.nextInt();
		System.out.println("Iveskite skaiciu b: ");
		int b = reader.nextInt();
		reader.close();
		int sum = 0;
		for (int i = a; a <= b; a++) {
			sum = sum + a;
		}
		System.out.println("Suma = " + sum);
	}

}
