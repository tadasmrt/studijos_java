package KD2_atsiskaitymas;
import java.util.Scanner;

public class Uzd5 {

	public static void main(String[] args) {
		int n, sk=1;
		Scanner reader = new Scanner(System.in); 
			System.out.print("Iveskit skaiciu n: ");
			n = reader.nextInt();
			int a[] = new int[n];
			System.out.println("Iveskite " + n + " skaicius: ");
			for (int i = 0; i < n; i++){
				a[i] = reader.nextInt();
				sk = sk * a[i];
			}
			System.out.println("Ivestu skaiciu sandauga yra: " + sk);
			reader.close();
	}
}
