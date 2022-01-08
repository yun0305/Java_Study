package Chapter3;

import java.util.Scanner;

public class FlowTest22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "서울";
		//String inString = "";//전역변수로 사용해주는게 호환성으로 따져봤을때 안정적이다
		
		
		do {
			
			System.out.println("대한민국 수도를 입력하세요");
			System.out.println("수도를 입력하세요");
			String inString = scan.next();
			if(inString.equals(answer)) {
				System.out.println("정답입니다.");
				break;
			}
			else {
				System.out.println("틀렸습니다.");
			}
			
		}while(true);

	}

}
