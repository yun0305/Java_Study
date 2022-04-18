package Chapter5;

import java.util.Scanner;

public class CalculateMain {

	int factorial = 1;
	int power = 0;
	
	
	int getFactorial(int num) {
		
		for(int i=num;i>0;i--) {
		
			factorial *= i;
			
		}
		return factorial;
	}
		
	int getPower(int num) {
		for(int i=1;i<=num;i++) {
			power += i*i;
		}
		return power;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		System.out.println("연산할값:"+num);
		
		
		CalculateMain cl = new CalculateMain();
		
		System.out.println("factorial : "+cl.getFactorial(num));
		System.out.println("power : "+cl.getPower(num));
		
	}

}
