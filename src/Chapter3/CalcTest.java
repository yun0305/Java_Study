package Chapter3;

public class CalcTest {

	public static void main(String[] args) {
		
		/*int num1 = Integer.parseInt(args[0]);//연산값을 입력하는 변수이다
		int num2 = Integer.parseInt(args[2]);//연산값을 입력하는 변수이다
		
		String operation = args[1];//연산자를 정해주는 변수 입력받았을떄 if문에서 돌아서 맞는 연산자를 찾는다
		int result = 0;
		boolean rightOperation = true;//평소에는 true인데 맞는 연산자가 없다면 if문을 통해 false로 바뀐다
		
		if(operation.equals("+")) {
			result = num1+num2;
		}
		else if(operation.equals("-")) {
			result = num1-num2;
		}
		else if(operation.equals("/")) {
			result = num1/num2;
		}
		else if(operation.equals("X")) {//
			result = num1*num2;
		}
		else {
			rightOperation = false;
		}
		
		if(rightOperation) {//false면 작동되지 않는다 flase라면 맞는 연산자가 없기 때문이다
			System.out.println(num1 + operation + num2 + "=" + result);
		}
			else {
				System.out.println("연산자가 잘못됬습니다");
			}*/
		
		int num1 = Integer.parseInt(args[0]);//좌측 피연산자를 넣어주는 구간
		String operation = args[1];//연산자를 넣어주는 구간
		int num2 = Integer.parseInt(args[2]);// 우측 피연산자를 넣어주는 구간
		
		int result = 0;// 연산자를 구분해서 찾았을때 어떤 수를 연산해서 result에 담아주는 구간
		boolean rightoperation = true;// 연산자 4개중에 하나를 찾아서 값을 산출하는데 못찯을경우 false로 바뀜 기본적으로 true이다
		
		if(operation.equals("+")) {
			result = num1+num2;
		}
		else if(operation.equals("-")) {
			result = num1-num2;
		}
		else if(operation.equals("X")) {
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
			System.out.println("연산자가 잘못되었습니다");
		}
				
			}
		
	}


