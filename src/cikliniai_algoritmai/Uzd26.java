package cikliniai_algoritmai;
import java.util.Scanner;

public class Uzd26 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
           int read = Integer.parseInt(reader.nextLine());
           if (read == 0) {
                break;
           }
           //cia reikia rasyti 
           
          System.out.println("Sum now: " + sum);
        }
        
        System.out.println("Sum in the end: " + sum);
    }
}