package Chapter3;

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
		int num1 = Integer.parseInt(args[0]);
		String operation = args[1];
		int num2 = Integer.parseInt(args[2]);
		boolean rightoperation = true;
		int result = 0;
		
		if(operation.equals("+")) {
			result = num1+num2;
		}
		else if(operation.equals("-")) {
			result = num1-num2;
		}
		else if(operation.equals("X")) {
			result = num1*num2;
		}
		else if(operation.equals("/")){
			result = num1/num2;
		}
		else {
			rightoperation = false;
		}
		
		if(rightoperation) {
			System.out.println(result);
		}
		else {
			System.out.println("�����ڰ� �߸� �Ǿ����ϴ�");
		}
			}
		
	}



