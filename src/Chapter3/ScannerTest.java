package Chapter3;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//next
		System.out.println("���ڿ� �Է�:");
		String nextString = scan.next();
		System.out.println("nextString = "+nextString);
		
		//nextInt
		System.out.println("���� �Է�:");
		int nextInt = scan.nextInt();
		System.out.println("nextInt = "+nextInt);
		
	}

}
