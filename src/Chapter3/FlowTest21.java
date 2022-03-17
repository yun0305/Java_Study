package Chapter3;

import java.util.Scanner;

public class FlowTest21 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int randomnumber = (int)(Math.random()*100)+1;//math.random 메소드는 double형으로 0.0에서 1.0사이의 난수를 산출해준다 100을 곱해주면 0부터 99 까지의 수를 반환하기때문에 100에 맞출고 1을 더한것이다
												//while문 밖에 있으니까 한번 랜덤으로 정해준다
		
		do {
			System.out.println("숫자를 입력하세요");
			System.out.println("숫자 입력");
			int innumber = scan.nextInt();//여기서 선언및 초기화를 시켜주지 않으면 무한반복이 일어난다 왜냐하면 숫자를 입력해주세요에서 숫자를 입력할 부분이 사라지기 때문이다
			
			if(innumber == randomnumber) {
				System.out.println("맞췄습니다");
				
				break;
			}
			else if(innumber < randomnumber) {
				System.out.println("숫자가 너무 작습니다");
			}
			else{
				System.out.println("숫자가 너무 큽니다");
			}
			
			
			
		}while(true);*/
		
		Scanner scan = new Scanner(System.in);
		int randomnumber = (int)(Math.random()*100)+1;
		
		do {
			System.out.println("숫자를 입력하세요");
			int innumber = scan.nextInt();
			if(innumber==randomnumber) {
				System.out.println("맞췄습니다");
				break;
				
			}
			else if(innumber<randomnumber) {
				System.out.println("입력하신 값이 작습니다");
				
			}
			else {
				System.out.println("입력하신 값이 큽니다");
				
			}
		}while(true);
	}

}
