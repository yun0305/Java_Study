package Chapter3;

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
		
		int num1 = Integer.parseInt(args[0]);
		String operation = args[1];
		int num2 = Integer.parseInt(args[2]);
		
		int result = 0;
		boolean rightoperation = true;
		
		switch(operation) {
		case "+":
			result=num1+num2;
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
			default:
				rightoperation = false;
				break;
					
		}
		
		if(rightoperation) {
			System.out.println(num1 + operation +num2 + "=" + result);
		}
		else {
			System.out.println("�����ڰ� �߸� �Ǿ� �ֽ��ϴ�");
		}
		
	}

}
