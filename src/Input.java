import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner scanner) {
		System.out.println("�Է� ��: ");
		int result = scanner.nextInt();
		return result;
	}
	
	static int getSecondValue(Scanner scanner) {
		System.out.println("�Է� ��: ");
		int second = scanner.nextInt();
		return second;
	}
	
	static String getSymbol(Scanner scanner) {
		System.out.println("��ȣ: ");
		String symbol = scanner.next();
		return symbol;
	}
}
