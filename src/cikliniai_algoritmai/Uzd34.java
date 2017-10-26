package cikliniai_algoritmai;
import java.util.Scanner;
public class Uzd34 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite skaiciu a = ");
		int a = reader.nextInt();
		reader.close();
		int i,fact=1;
		for(i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("Skaiciaus " + a + " faktorialas yra " + fact);
	}
}
