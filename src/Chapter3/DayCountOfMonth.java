package Chapter3;

import java.util.Scanner;

public class DayCountOfMonth {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);//char를 입력 받을 때는 (char)System.in.read 메서드를 이용한다
	int year = scan.nextInt();  //int를 입력 받을 때는 nextInt 메서드를 이용한다.
								// 년도를 넣어주는 구간
	int month = scan.nextInt();//달을 넣어주는 구간
	
	int daycount = 0; //넣어준 달이 몆일이 있는지 넣어주는 구간
	boolean rigthMonth = true;//년도와 달값이 옳바르지 않다면 false로 바뀐다
	
	switch(month){
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		daycount =31;
		break;
	case 4: case 6: case 9: case 11:
	daycount = 30;
		break;
	case 2:
		if(year%4==0 && year%100 != 0 || year%400 == 0) {
			daycount = 29;
		}
		else {
			daycount = 28;
		}
		break;
	default :
		rigthMonth = false;
	
	}
	
	
	if(rigthMonth) {
		System.out.println(year+"년 "+month+"월은 "+daycount+"일 까지입니다");
	}
	else {
		System.out.println("존재하지 않는 달 입니다");
	}
	
	
	}

}
