package sakotieji_algoritmai_if;
import java.util.Scanner;
public class Uzd3 {

	public static void main(String[] args) {
		Scanner skaiciuokle = new Scanner (System.in);
		int a, mod;
		System.out.println("Irasykite skaiciu a = ");
		a = skaiciuokle.nextInt();
		mod = a % 2;
		if (mod == 0) {
			System.out.println("Skaicius yra lyginis, super.");
		}else {
			System.out.println("Skaicius " + a + " yra nelyginis, deja");
		}

	}

}
