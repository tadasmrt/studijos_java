package zp17_3;
import java.util.Scanner;

public class Uzd11 {

	public static void main(String[] args) {
		Scanner palyginimas = new Scanner (System.in);
		double skaicius1, skaicius2 , atsakymas;
		System.out.println("Iveskite skaiciu ");
		skaicius1 = palyginimas.nextDouble();
		System.out.println("Iveskite antra skaiciu ");
		skaicius2 = palyginimas.nextDouble();
		Double MaxResult = Math.max(skaicius1,  skaicius2);
		System.out.println("Vis delto didesnis skaicius yra " + MaxResult);
	}

}
