import java.util.Scanner;

public class Calculator {
		
		
		static int calculate(String symbol, int result, int second){
			if(symbol.equals("+")){
				result = result + second;
				System.out.println("���� �� : "+result);
			} else if(symbol.equals("-")){
				result = result - second;
				System.out.println("���� �� : "+result);
			} else if(symbol.equals("*")){
				result = result * second;
				System.out.println("���� �� : "+result);
			} else if(symbol.equals("/")){
				result = result / second;
				System.out.println("���� �� : "+result);
			} else {
				System.out.println("��Ģ���� ���� �߸� �Է��ϼ̽��ϴ�.");
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