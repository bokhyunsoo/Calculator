import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù ��° �Է� ��: ");
		int first = scanner.nextInt();
		
		System.out.println("�ι�° �Է� ��: ");
		int second = scanner.nextInt();
		
		System.out.println("��Ģ���� ��: ");
		String symbol = scanner.next();
		
		if(symbol.equals("+")){
			System.out.println("���� : "+ (first+second));
		} else if(symbol.equals("-")){
			System.out.println("���� : "+ (first-second));
		} else if(symbol.equals("*")){
			System.out.println("���� : "+ (first*second));
		} else if(symbol.equals("/")){
			System.out.println("������ : "+ (first/second));		
		} else {
			System.out.println("��Ģ���� ���� �߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
