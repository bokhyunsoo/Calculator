import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("�Է� ��: ");
			int first = scanner.nextInt();
			
			while(true) {
			
			System.out.println("��ȣ: ");
			String symbol = scanner.next();
			
			if ("quit".equals(symbol)){
				System.out.println("���� �� : "+first);
				break;
			}
			
			System.out.println("�Է� ��: ");
			int second = scanner.nextInt();
			
			
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
		}
	}
}