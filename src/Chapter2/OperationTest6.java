package Chapter2;

public class OperationTest6 {

	public static void main(String[] args) {
		int x = 8;
		int y = 3;
		int result = 0;
		boolean bresult = false;
		
		/**
		 * 비트로 변경
		 * 8 : 00000000 00000000 00000000 00001000
		 * 3 : 00000000 00000000 00000000 00000011
		 */
		
		//&
		result = x&y;
		System.out.println("x&y = "+result);
		bresult = false&true;
		System.out.println("true&false = "+bresult);
		System.out.println();
		
		//|
		result = x|y;
		System.out.println("x|y = "+result);
		bresult = false|true;
		System.out.println("true|false = "+bresult);
		System.out.println();
		
		//^
		result = x^y;
		System.out.println("x^y = "+result);
		bresult = false^true;
		System.out.println("true^false = "+bresult);
		System.out.println();
	}
	

}
