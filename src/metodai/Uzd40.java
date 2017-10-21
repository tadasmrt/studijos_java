package metodai;

public class Uzd40 {

	public static void main(String[] args) {
		printTriangle(8);
	}
	
	public static void printTriangle(int size) {
		for(int i = 1; i <= size; i++) {
			printLine(i * 2 - 1, size - i);
		}
	}
	
	public static void printLine(int star, int empty) {
		for(int i = 1; i <= empty; i++) {
			System.out.print(" ");
		}

		for(int i = 1; i <= star; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}