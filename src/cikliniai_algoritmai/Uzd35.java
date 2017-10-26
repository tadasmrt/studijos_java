package cikliniai_algoritmai;
import java.util.Scanner;
public class Uzd35 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while(true){
			System.out.print("Iveskite skaiciu = ");
			int a = reader.nextInt();
			if(a<=0) {
				break;
			}
		}
		System.out.println("Aciu. Programa baigesi");
		reader.close();
	}	
}