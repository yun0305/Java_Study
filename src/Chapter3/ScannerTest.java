package Chapter3;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//next
		System.out.println("문자열 입력:");
		String nextString = scan.next();
		System.out.println("nextString = "+nextString);
		
		//nextInt
		System.out.println("숫자 입력:");
		int nextInt = scan.nextInt();
		System.out.println("nextInt = "+nextInt);
		
	}

}
