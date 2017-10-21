package sakotieji_algoritmai_if;

import java.util.Scanner;

public class Uzd1 {

	public static void main(String[] args) {
		Scanner skaiciai = new Scanner(System.in);
		double a;
		System.out.println("Iveskite skaiciu a = ");
		a = skaiciai.nextInt();
		skaiciai.close();
		if (a > 0) {
			System.out.println("Skaicius yra teigiamas, tau pasiseke :)");
		} else {
			System.out.println("Skaicius yra neigiamas, tau nepasiseke :(");
		}
	}

}