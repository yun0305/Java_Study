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
			System.out.println("당신의 입력값은 = "+result);
		}
		else {
			System.out.println("당신의 입력값은 틀렸습니다");
		}*/
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		boolean rightoperation = true;
		do {
			int num1 = scan.nextInt();
			String operation = scan.next();
			int num2 = scan.nextInt();
			
		switch(operation) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "X":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
			default :
				rightoperation = false;
					break;
		}
		
		if(rightoperation) {
			System.out.println(result);
		}
		else {
			System.out.println("연산자가 잘못 되었습니다");
		}
		}while(rightoperation!=true);	
		
	}

}
