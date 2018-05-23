import java.util.Scanner;

public class StringCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� �� �Է� : ");
		
		String value = scanner.nextLine();
		
		String[] values = value.split(" ");
		
		int first = Integer.parseInt(values[0]);
		
		int i = 1;
		int result = first;
		while ( i < values.length){
			String symbol = values[i];
			
			int second = Integer.parseInt(values[i + 1]);
			
			result = Calculator.calculate(symbol, result, second);
			
			i = i + 2;
		}
		
		Output.print(result);
	}

}
