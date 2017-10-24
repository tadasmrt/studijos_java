package metodai;

import java.util.Scanner;

public class Uzd40 {

	public static void main(String[] args) {
		Scanner skaitytuvas = new Scanner(System.in);
		System.out.print("Kokio aukscio eglute reikalinga: ");
		int a = skaitytuvas.nextInt();
		printTriangle(a);
	}
	
	public static void printTriangle(int size) {
		for(int i = 1; i <= size; i++) {
			printLine(i * 2 - 1, size - i);
		}
	}
	
	public static void printLine(int star, int empty) {
		for(int i = 1; i <= empty; i++) {
			System.out.print(" ");
		}

		for(int i = 1; i <= star; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}