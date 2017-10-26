package cikliniai_algoritmai;
import java.util.Scanner;
public class Uzd31 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		System.out.println("Iveskite pirma skaiciu a = ");
		int a = reader.nextInt();
		System.out.println("Iveskite antra skaiciu b = ");
		int b = reader.nextInt();
		reader.close();
		for (int i = a; i<=b; i++) {
			System.out.println(+i);
		}
		if (a>b) {
			System.out.println("Pirmas skaicius turi buti mazesnis");
		}
	}
}