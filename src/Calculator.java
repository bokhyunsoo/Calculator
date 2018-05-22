import java.util.Scanner;

public class Calculator {
		
		static int getFirstValue(Scanner scanner) {
			System.out.println("입력 값: ");
			int first = scanner.nextInt();
			return first;
		}
		
		static String getSymbol(Scanner scanner) {
			System.out.println("기호: ");
			String symbol = scanner.next();
			return symbol;
		}
		
		static int getSecondValue(Scanner scanner) {
			System.out.println("입력 값: ");
			int second = scanner.nextInt();
			return second;
		}
		
		static int calculate(String symbol, int first, int second){
			if(symbol.equals("+")){
				first = first + second;
				System.out.println("현재 값 : "+first);
			} else if(symbol.equals("-")){
				first = first - second;
				System.out.println("현재 값 : "+first);
			} else if(symbol.equals("*")){
				first = first * second;
				System.out.println("현재 값 : "+first);
			} else if(symbol.equals("/")){
				first = first / second;
				System.out.println("현재 값 : "+first);
			} else {
				System.out.println("사칙연산 값을 잘못 입력하셨습니다.");
			}
			
			return first;
			
		}
		
		static void print(int first){
				System.out.println("최종 값 : "+first);
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