package Chapter2;

public class OperationTest5 {

	public static void main(String[] args) {
		int var_inc = 0;//0으로 초기화 안해놓으면 증감이 안됨 왜냐면 값이 안들어가 있으니까
		int result = 0;
		
		//++
		result = var_inc++;//후증감을 어떤 변수에 할당 시킬때는 후 증감 값은 증감 시키지 안고 할당한다
		System.out.println(result);//var_inc값인 0을 먼저 result 변수에 할당하고 var_inc 값을 하나 증감시킨다
		System.out.println(var_inc);
		
		result = ++var_inc;//선증감 현재 줄부터 증감 시켜줌
		System.out.println(result);//var_inc의 현재 값 2를 3으로 증감시키고 result 변수에 대입한다
		System.out.println(var_inc);
	}

}
