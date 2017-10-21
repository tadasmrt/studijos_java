package metodai;
import java.util.Scanner;

public class Uzd39_1 {

	public static void main(String[] args) {
		Scanner skaitytuvas = new Scanner(System.in); //kintamasis "skaitytuvas", jo tipas "skaneris"
		int a = skaitytuvas.nextInt(); //
		int b = skaitytuvas.nextInt();
		int c = skaitytuvas.nextInt();
		
		printStars(a);
		printStars(b);
		printStars(c);	
	}
	public static void printStars(int amount) {
		for(int i = 0; i < amount; i++){
			System.out.print("*");
		}
		System.out.println();
	}
}