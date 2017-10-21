package metodai;

public class Uzd39_4 {

	public static void main(String[] args) {
		printTriangle(8);
	}
	
	public static void printTriangle(int size) {
		for(int i = 1; i <= size; i++) {
			printLine(i, size - i);
		}
	}
	
	public static void printLine(int star, int empty) {
		for(int i = 1; i <= star; i++ ) {
			System.out.print("*");
		}
		System.out.println();
	}
}
