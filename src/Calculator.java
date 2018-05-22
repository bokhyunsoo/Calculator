import java.util.Scanner;

public class Calculator {
		
		static int getFirstValue(Scanner scanner) {
			System.out.println("�Է� ��: ");
			int first = scanner.nextInt();
			return first;
		}
		
		static String getSymbol(Scanner scanner) {
			System.out.println("��ȣ: ");
			String symbol = scanner.next();
			return symbol;
		}
		
		static int getSecondValue(Scanner scanner) {
			System.out.println("�Է� ��: ");
			int second = scanner.nextInt();
			return second;
		}
		
		static int calculate(String symbol, int first, int second){
			if(symbol.equals("+")){
				first = first + second;
				System.out.println("���� �� : "+first);
			} else if(symbol.equals("-")){
				first = first - second;
				System.out.println("���� �� : "+first);
			} else if(symbol.equals("*")){
				first = first * second;
				System.out.println("���� �� : "+first);
			} else if(symbol.equals("/")){
				first = first / second;
				System.out.println("���� �� : "+first);
			} else {
				System.out.println("��Ģ���� ���� �߸� �Է��ϼ̽��ϴ�.");
			}
			
			return first;
			
		}
		
		static void print(int first){
				System.out.println("���� �� : "+first);
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			int first = getFirstValue(scanner);
			
			while (true) {
				String symbol = getSymbol(scanner);
				
				if ("quit".equals(symbol)){
					print(first);
					break;
				}
				
				int second = getSecondValue(scanner);
				
				first = calculate(symbol, first, second);
			}
			
			scanner.close();
		}
}