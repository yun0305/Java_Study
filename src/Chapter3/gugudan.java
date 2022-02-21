package Chapter3;

import java.util.Scanner;

public class gugudan {
	
	public static void FlowTest19() {
		
		
		//String[] args;//이런식으로 배열을 따로 만들어줘서 넣어줫더니 오류가 발생한다 배열 객체를 선언 해줘도 안됨// 이유 Run configation으로 돌려야 하는데 내가 배열을 만들어주면 사용할수 없어서?
		Scanner scan = new Scanner(System.in);
		String args = scan.next();
		
		int dannumber = Integer.parseInt(args);
		if(dannumber >=2 && dannumber <= 9) {// 2와 9 사이의 모든 숫자(단 int니까 정수만)
			
			int num = 1;// 단에 곱해질값
			int result = 0;// 단을 계산하고 그값을 저장해줄 변수
		
			while(num<=9) {
				
				result = dannumber*num;
				System.out.println(dannumber+"*"+num+"="+result);
				
				num++;
				
			}
		}
		else {
			System.out.println("단 값이 잘못되었습니다");
		}

	}

	
	
	
	
	
	
	public static void gugudan() {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"X"+j+"="+i*j);
				
			}
		System.out.println();
		}
	}

	

	public static void main(String[] args) {
		
		FlowTest19();
		//gugudan();

	}

}
