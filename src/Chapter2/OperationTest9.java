package Chapter2;

import java.util.Scanner;

public class OperationTest9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String msg = "";
		int stac = scn.nextInt();
		
		msg = (stac%2==0)? "¦��":"Ȧ��";
		
		System.out.println(msg);
		
		
	}

}
