package Chapter3;

import java.util.Scanner;

public class DayCountOfMonth {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		
		
		do {
		int year = scan.nextInt();
		int month = scan.nextInt();
		int daycount = 0;
		boolean rigthoperation = true;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			daycount = 31;
			break;
		case 4: case 6: case 9: case 11:
			daycount = 30;
			break;
		case 2:
			if(year%4==0&&year%100!=0||year%400==0) {
				daycount = 29;
			}
			else {
				daycount = 28;
			}
			break;
		default :
			rigthoperation = false;
			
		}
		
		if(rigthoperation) {
			System.out.println(year+"년도"+month+"월은"+daycount+"일 입니다");
		}
		else {
			System.out.println("잘못된 입력 값입니다");
		}
		}
		while(true);*/
		
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		int month = scan.nextInt();
		int result = 0;
		boolean rightoperation = true;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = 31;
			break;
			
		case 4: case 6: case 9: case 11:
			result = 30;
			break;
			
		case 2:
			result = (year%4==0 && year%100 != 1 || year%400 ==0)? 29:28;
			break;
			default :
				rightoperation  = false;
		}
		
		if(rightoperation) {
			System.out.println(year+"년 "+month+"월은 "+result+"일까지 있습니다" );
		}
		else {
			System.out.println("제대로된 년도를 와 월을 입력해 주세요");
		}
		
		
		
		
	}

}
