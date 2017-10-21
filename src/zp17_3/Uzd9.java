package zp17_3;
import java.util.Scanner;
public class Uzd9 {

	public static void main(String args[]) {
		Scanner skaiciuokle = new Scanner (System.in);
		double skaicius1, skaicius2, atsakymas;	
		System.out.println("Prasau ivesti pirma skaiciu ");
		skaicius1 = skaiciuokle.nextInt();
		System.out.println("Prasau ivesti antra skaiciu ");
		skaicius2 = skaiciuokle.nextInt();
		atsakymas = skaicius1 / skaicius2;
		System.out.println("Atsakymas yra " + atsakymas);
	}

}
