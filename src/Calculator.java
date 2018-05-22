import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력 값: ");
		int first = scanner.nextInt();
		
		System.out.println("두번째 입력 값: ");
		int second = scanner.nextInt();
		
		System.out.println("사칙연산 값: ");
		String symbol = scanner.next();
		
		if(symbol.equals("+")){
			System.out.println("덧셈 : "+ (first+second));
		} else if(symbol.equals("-")){
			System.out.println("뺄셈 : "+ (first-second));
		} else if(symbol.equals("*")){
			System.out.println("곱셈 : "+ (first*second));
		} else if(symbol.equals("/")){
			System.out.println("나눗셈 : "+ (first/second));		
		} else {
			System.out.println("사칙연산 값을 잘못 입력하셨습니다.");
		}
	}
}
