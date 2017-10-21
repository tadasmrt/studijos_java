package metodai;

public class Uzd39_2 {

	public static void main(String[] args) {
		printSquare(9);
	}
	
	public static void printSquare(int size) {
		for(int i = 0; i < size; i++) {
			printLine(size);
		}
	}
	
	public static void printLine(int size) {
		for(int i = 0; i < size; i++){;
			System.out.print("*");
		}
		System.out.println();
	}
}