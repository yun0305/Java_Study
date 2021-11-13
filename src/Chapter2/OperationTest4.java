package Chapter2;

public class OperationTest4 {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		boolean result;
		
		//&& true
		result = x<y && y>=200;
		System.out.println(result);
		
		//false
		result = x<y && y<200;
		System.out.println(result);
		
		//flase
		result = x>y && y++>200;// 논리연산자의 경우 좌측 연산이 false면 우측 연산은 하지않는다.(속도 향상을 위함)
								// 우측은 실행되지 않으므로 y의 증감값은 실행되지 않는다
		System.out.println(result);
		System.out.println(y);
		
		//||true
		result = x<y || y>=200;
		System.out.println(result);
		
		//true
		result = x<y || y<200;
		System.out.println(result);
		
		//true
		result = x<y || y++>200;// 좌 측이 true라서 우측은 실행되지 않는다 그러므로 y값은 증감 되지 않는다
		System.out.println(result);
		System.out.println(y);
		
		//flase
		result = x>y || y++>200;//
		System.out.println(result);//|| 좌측이 false 이므로 우측도 실행되어야 하므로 우측 y값이 증갑되서 201이됨
		System.out.println(y);
		
		//!
		result = !(x>y);
		System.out.println(result);
	}

}
