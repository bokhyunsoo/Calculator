import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner scanner) {
		System.out.println("입력 값: ");
		int result = scanner.nextInt();
		return result;
	}
	
	static int getSecondValue(Scanner scanner) {
		System.out.println("입력 값: ");
		int second = scanner.nextInt();
		return second;
	}
	
	static String getSymbol(Scanner scanner) {
		System.out.println("기호: ");
		String symbol = scanner.next();
		return symbol;
	}
}
