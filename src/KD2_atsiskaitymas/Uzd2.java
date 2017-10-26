package KD2_atsiskaitymas;
import java.util.Scanner;

public class Uzd2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("Iveskite skaiciu: ");
			int a;
			String command = reader.nextLine();
			if (command.equals("0")){
				break;
				}
			}
		int a;
		if(a % 2 == 0)
			int lyg_sk=a+a;
			int nelyg_sk=0;
			
			System.out.println("Lyginiu skaiciu suma: " + lyg_sk);
			System.out.print("Nelyginiu skaiciu suma: " + nelyg_sk);
	}
}
