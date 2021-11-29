package Chapter3;

import java.util.Scanner;

public class FlowTest13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int sum = 0;
		String exp = "";
		
		for(int i=0;i<=num;i++) {
			sum +=i;
			exp += (i==0)? ""+i:"+"+i;
		}
		System.out.println(exp+"="+sum);
		

	}

}
