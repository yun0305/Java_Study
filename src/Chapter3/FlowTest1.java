package Chapter3;

import java.util.Scanner;

public class FlowTest1 {

	public static void main(String[] args) {
		
		//int year = Integer.parseInt(args[0]);
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		boolean leapYear = false;
		
		leapYear = (year%4==0 && year%100 != 0 || year%400==0);//조건식이 맞으면 true로바뀐다
		//년도를 4로 나눠서 0으로 떨어지고,년도를 100으로 나누어서 0으로 떨어지지 않고(0이 되면 안된다) "또는" 년도를 400으로 나누었을때 떨어지면 true
		if(leapYear) {
			System.out.println("올해는 윤년");
		}
		else{
			System.out.println("올해는 윤년이 아님");
		}
	}

}
