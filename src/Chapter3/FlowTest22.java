package Chapter3;

import java.util.Scanner;

public class FlowTest22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "서울";
		String inString = "";
		
		
		do {
			System.out.println("대한민국 수도를 입력하세요");
			System.out.println("수도를 입력하세요");
			inString = scan.next();
			if(answer.equals(inString)) {
				System.out.println("정답입니다.");
				break;
			}
			else {
				System.out.println("틀렸습니다.");
			}
			
		}while(true);

	}

}
