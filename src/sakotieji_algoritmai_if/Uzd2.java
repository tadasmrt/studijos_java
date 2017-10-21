package sakotieji_algoritmai_if;
import java.util.Scanner;
public class Uzd2 {

	public static void main(String[] args) {
	Scanner pilnametyste = new Scanner (System.in);
	double a;
	System.out.println("Irasykite savo metus a = ");
	a = pilnametyste.nextInt();
	if (a <= 17) {
		System.out.println("Sorry, tu dar nepilnametis :)");
	}else{
		System.out.println("Sveikinam, gali jau pirkti alkoholi :)");
	}
	
	

	}

}
