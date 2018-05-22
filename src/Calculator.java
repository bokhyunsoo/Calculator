import java.util.Scanner;

public class Calculator {
		
		
		static int calculate(String symbol, int result, int second){
			if(symbol.equals("+")){
				result = result + second;
				System.out.println("현재 값 : "+result);
			} else if(symbol.equals("-")){
				result = result - second;
				System.out.println("현재 값 : "+result);
			} else if(symbol.equals("*")){
				result = result * second;
				System.out.println("현재 값 : "+result);
			} else if(symbol.equals("/")){
				result = result / second;
				System.out.println("현재 값 : "+result);
			} else {
				System.out.println("사칙연산 값을 잘못 입력하셨습니다.");
			}
			
			return result;
			
		}
		
		
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			int result = Input.getFirstValue(scanner);
			
			while (true) {
				String symbol = Input.getSymbol(scanner);
				
				if ("quit".equals(symbol)){
					Output.print(result);
					break;
				}
				
				int second = Input.getSecondValue(scanner);
				

				result = calculate(symbol, result, second);
			}
			
			scanner.close();
		}
}