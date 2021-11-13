package Chapter3;

import java.util.Scanner;

public class FlowTest21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = (int)(Math.random()*100)+1;//math.random 메소드는 double형으로 0.0에서 1.0사이의 난수를 산출해준다 100을 곱해주면 0부터 99 까지의 수를 반환하기때문에 100에 맞출고 1을 더한것이다
												//while문 밖에 있으니까 한번 랜덤으로 정해준다
			int innumber = 0;//사용자가 입력한 값을 정수 형태로 저장할 inNumber 변수의 값을 0으로 초기화시킨 부분이다
						 // 초기화를 안해주면 무한반복이 일어난다
		
		do {
			System.out.println("숫자를 입력하세요");
			System.out.println("숫자 입력");
			innumber = scan.nextInt();
			
			if(innumber == number) {
				System.out.println("맞췄습니다");
				
				break;
			}
			else if(innumber < number) {
				System.out.println("숫자가 너무 작습니다");
			}
			else{
				System.out.println("숫자가 너무 큽니다");
			}
			
			
			
		}while(true);
	}

}
