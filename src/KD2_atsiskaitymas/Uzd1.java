package KD2_atsiskaitymas;
import java.util.Scanner;

public class Uzd1 {

	public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			int a, b; 
			System.out.print("Iveskite intervalo pradzia: ");
			a = reader.nextInt();
			System.out.print("Iveskite intervalo pabaiga: ");
			b = reader.nextInt();
			while (a <= b){
				System.out.print(a + " ");
				a++;
			}
		}
		
	}