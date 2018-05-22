import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("입력 값: ");
			int first = scanner.nextInt();
			
			while(true) {
			
			System.out.println("기호: ");
			String symbol = scanner.next();
			
			if ("quit".equals(symbol)){
				System.out.println("최종 값 : "+first);
				break;
			}
			
			System.out.println("입력 값: ");
			int second = scanner.nextInt();
			
			
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
		}
	}
}