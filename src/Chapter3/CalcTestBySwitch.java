package Chapter3;

import java.util.Scanner;

public class CalcTestBySwitch {

	public static void main(String[] args) {
		/*int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		
		String operation = args[1];
		int result = 0;
		boolean rightoperation = true;
		
		switch(operation) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "/":
			result = num1/num2;
			break;
		case "X":
			result = num1*num2;
			break;
			default:
				rightoperation = false;
				break;
		}
		
		if(rightoperation) {
			System.out.println("����� �Է°��� = "+result);
		}
		else {
			System.out.println("����� �Է°��� Ʋ�Ƚ��ϴ�");
		}*/
		
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		String operation = scn.next();
		int num2 = scn.nextInt();
		int result = 0;
		boolean rightoperation = true;
		
		switch(operation) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1+num2;
			break;
		case "X":
			result=num1+num2;
			break;
		case "/":
			result=num1+num2;
			break;
			default :
				rightoperation = false;
		}
		if(rightoperation) {
			System.out.println(result);
		}
		else {
			System.out.println("�����ڸ� �ٽ� �Է� �ϼ���");
		}
		
	}

}
