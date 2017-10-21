package zp17_3;
import java.util.Scanner;

public class Uzd10 {

	public static void main(String[] args) {
		Scanner skaiciuokle = new Scanner (System.in);
		double radius, atsakymas;
		System.out.println ("Irašykite apskritimo radius = ");
		radius = skaiciuokle.nextDouble();
		atsakymas = radius*Math.PI*2;
		System.out.println ("Apskritimo ilgis yra " + atsakymas);
		
	}

}
