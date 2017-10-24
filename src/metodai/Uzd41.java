package metodai;

import java.util.Scanner;

public class Uzd41 { //kciortu, einu miegot..

	public static void main(String[] args) {
		Scanner skaitytuvas = new Scanner(System.in);
			System.out.print("Iveskite skaiciu nuo 0 iki 100: ");
			int a = skaitytuvas.nextInt();
			printAnswer(5);
		}

	public static void printAnswer(int atsakymas) {
		int atsakymas = 55;
		int a;
		if (a < atsakymas) {
			System.out.print("Jusu spejimas per mazas");
		
		}else if (a > atsakymas) {
			System.out.print("Jusu atsakymas per didelis");
		
		}else
			System.out.print("Jusu atsakymas teisingas");
			
	}

}
