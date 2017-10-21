package sakotieji_algoritmai_if;
import java.util.Scanner;
public class Uzd4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		int a, b;
		System.out.println("Prasau irasyti pirma skaiciu = ");
		a = reader.nextInt();
		System.out.println("Prasau irasyti antra skaiciu = ");
		b = reader.nextInt();
		if (a > b) {
			System.out.println("Didesnis skaicius yra " + a);
		}else if (a < b ) {
			System.out.println("Didesnis skaicius yra " + b);
		}else {
			System.out.println("Skaiciai yra lygus");
		}

	}

}
