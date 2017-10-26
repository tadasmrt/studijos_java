package KD2_atsiskaitymas;
import java.util.Scanner;

public class Uzd6 {

	public static void main(String[] args) {
		int n, m, t, v_vid=2, t_max=0;
		Scanner reader = new Scanner(System.in); 
			System.out.print("Iveskit ratu skaiciu n: ");
			n = reader.nextInt();
			System.out.print("Vieno rato ilgis m (metru): ");
			m = reader.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++){
				System.out.print("Rata iveike per: ");
				a[i] = reader.nextInt();
			t_max=t_max+a[i];
			v_vid=n*m/t_max;
			}
			System.out.println("Vidutinis greitis yra = " + v_vid + " m/s");
			System.out.println("Sugaiso = " + t_max + " sekundziu.");
			reader.close();
	}
}