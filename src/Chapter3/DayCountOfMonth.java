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
			System.out.println(year+"�⵵"+month+"����"+daycount+"�� �Դϴ�");
		}
		else {
			System.out.println("�߸��� �Է� ���Դϴ�");
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
			System.out.println(year+"�� "+month+"���� "+result+"�ϱ��� �ֽ��ϴ�" );
		}
		else {
			System.out.println("����ε� �⵵�� �� ���� �Է��� �ּ���");
		}
		
		
		
		
	}

}
