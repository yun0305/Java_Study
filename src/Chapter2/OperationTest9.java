package Chapter2;

import java.util.Scanner;

public class OperationTest9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		String msg = (num%2==0)?"Ȧ��":"¦��";
		System.out.println(msg);
		
		
		
	}

}
