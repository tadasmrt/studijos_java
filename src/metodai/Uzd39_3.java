package metodai;

import java.util.Scanner;

public class Uzd39_3 {

	public static void main(String[] args) {
		Scanner skaitytuvas = new Scanner(System.in);
		System.out.print("Iveskite staciakampio ploti: ");
		int a = skaitytuvas.nextInt();
		System.out.print("Iveskite staciakampio auksti: ");
		int b = skaitytuvas.nextInt();
		printRectangle(a);
		printRectangle(b);
	}
	
	public static void printRectangle(int size) {
		for(int i = 0; i < size; i++) {
			printLine(size);
		}
	}
	
	public static void printLine(int size) {
		for(int i = 0; i < size; i++){;
			System.out.print("*");
		}
		System.out.println();
	}
}