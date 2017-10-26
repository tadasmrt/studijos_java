package KD2_atsiskaitymas;
import java.util.Scanner;

public class Uzd3 {

	private static Object command;
	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		while (true) {
			int m, a, sum = 0, im=0, ats=0;
			System.out.print("Dienos limitas: ");
			m = reader.nextInt();
			int a1[] = new int[m];
			for (int i = 0; i < m; i++){
				System.out.print("Iveskite atstuma: ");
				a1[i] = reader.nextInt();
				sum=sum+a1[i];
				if (command.equals(sum)) { 
					/*kiekvieno nuvaziuoto atstumo suma
					 * turi buti mazesne negu dienos limitas.
					 * Pasiekus ta riba - nebeleidziama toliau
					 * vesti atstumu.
					 */
					break;
				}
			ats=ats+a1[i];
			}
			System.out.println("Aptarnauta imoniu =  " + im);
			System.out.println("Iveiktas atstumas = " + ats);
			}
	}
}