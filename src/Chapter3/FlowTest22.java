package Chapter3;

import java.util.Scanner;

public class FlowTest22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "����";
		String inString = "";
		
		
		do {
			System.out.println("���ѹα� ������ �Է��ϼ���");
			System.out.println("������ �Է��ϼ���");
			inString = scan.next();
			if(answer.equals(inString)) {
				System.out.println("�����Դϴ�.");
				break;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			
		}while(true);

	}

}
