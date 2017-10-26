package cikliniai_algoritmai;
import java.util.Scanner;

public class Uzd22 {

	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	while (true) {
		System.out.print("Irasykite slaptazodi: ");
		String command = reader.nextLine();
		System.out.println("Slaptazodis neteisingas :)");
		if (command.equals("bar")){
			break;
		}
	}
	
System.out.print("Paslaptis yra: jqryy qbar!");
reader. close();
}
}