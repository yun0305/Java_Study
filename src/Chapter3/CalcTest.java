package Chapter3;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		
		
		
		/*int num1 = Integer.parseInt(args[0]);//���� �ǿ����ڸ� �־��ִ� ����
		String operation = args[1];//�����ڸ� �־��ִ� ����
		int num2 = Integer.parseInt(args[2]);// ���� �ǿ����ڸ� �־��ִ� ����
		
		int result = 0;// �����ڸ� �����ؼ� ã������ � ���� �����ؼ� result�� ����ִ� ����
		boolean rightoperation = true;// ������ 4���߿� �ϳ��� ã�Ƽ� ���� �����ϴµ� ���F����� false�� �ٲ� �⺻������ true�̴�
		
		if(operation.equals("+")) {
			result = num1+num2;
		}
		else if(operation.equals("-")) {
			result = num1-num2;
		}
		else if(operation.equals("X")) {//*�̰ɷ� �Ұ�� ���� �߻�
			result = num1*num2;
		}
		else if(operation.equals("/")) {
			result = num1/num2;
		}
		else {
			rightoperation = false;
		}
		if(rightoperation) {
			System.out.println(num1 + operation + num2 + "=" + result);
		}
		else {
			System.out.println("�����ڰ� �߸��Ǿ����ϴ�");
		}*/
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		boolean rigthoperation = true;
		do {
			int num1 = scan.nextInt();
			String operation = scan.next();
			int num3 = scan.nextInt();
		
		
		
		if(operation.equals("+")) {
			result = num1+num3;
		}
		else if(operation.equals("-")) {
			result = num1-num3;
		}
		else if(operation.equals("X")) {
			result = num1*num3;
		}
		else if(operation.equals("/")) {
			result = num1/num3;
		}
		else {
			rigthoperation = false;
		}
	
		
		if(rigthoperation) {
				System.out.println(num1+operation+num3+"="+result );
			}
			 else {
				 System.out.println("�����ڰ� �߸��Ǿ����ϴ�");
	}
		}while(!rigthoperation);
	}
}


