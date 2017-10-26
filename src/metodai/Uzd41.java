package metodai;

import java.util.Scanner;

public class Uzd41 {

	public static void GuessNumbe() {
		Scanner skaitytuvas = new Scanner(System.in);
			System.out.print("Iveskite skaiciu nuo 0 iki 100: ");
			int a = skaitytuvas.nextInt();
			return (a);
		}

	public static void main(String[] args) {
		int skaicius = ivestiSkaiciu();
		int spejimas = spetiSkaiciu();
		int spejimuSkaicius = 1;
		while (skaicius != spejimas) {
			spejimuSkaicius++;
			if (spejimas < skaicius) {
				System.out.println("Skaicius yra didesnis,prasome speti dar karta: " + spejimuSkaicius);
			} else if (skaicius > spejimas) {
				System.out.println("Skaicius yra mazesnis, prasome speti dar karta: " + spejimuSkaicius);;
			}
			spejimas = spetiSkaiciu();
		}
		System.out.println("Sveikiname");
	}
}
	