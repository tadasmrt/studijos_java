package cikliniai_algoritmai;
import java.util.Scanner;

public class Uzd23 {

    private static Scanner reader;

	public static void main(String[] args) {
        reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("Iveskite pirma skaiciu: ");
        int read = Integer.parseInt(reader.nextLine());
        System.out.println("Iveskite antra skaiciu: ");
        read = read + (Integer.parseInt(reader.nextLine()));
        System.out.println("Iveskite treciaji skaiciu: ");
        read = read + (Integer.parseInt(reader.nextLine()));
        
        sum = read;
        System.out.println("Sum: " + sum);
    }
}
