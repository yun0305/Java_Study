package Chapter3;

import java.util.Scanner;

public class LoginTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
		String id = scan.next();// 입력 값을 while문 밖에 넣어주지 않으면 틀렸을 경우 무한 반복이 일어난다 왜냐면 틀린값은 계속 입력되어있기때문에 틀린값 기준으로 계속 while 문이 돈다
								//즉 11번 13번 애들도 while문에서 계속 돌아줘야 초기화되면서 새로운 값을 입력받는다
		String pass = scan.next();
		
		
		if(id.equals("javaid")) {
			if(pass.equals("javapass")) {
				System.out.println("환영합니다");
				break ;// break 문을 넣어주어서 종료시킨다//반복문이 하나라서 그냥 break 하나라도 프로그램을 종료시킨다
			}
			else {
				System.out.println("비밀번호가 다릅니다 다시 입력해 주세요");
				
			}
		}
		else {
			System.out.println("아이디가 다릅니다 다시 입력해 주세요");
			
		}
		}while(true);
		
		
		/*if(id.equals("javaid")) {
			if(pass.equals("javapass")) {
				System.out.println("환영합니다");
			}
			else {
				System.out.println("비밀번호가 다릅니다");
			}
		}
		else {
			System.out.println("당신은 우리 회원이 아닙니다");
		}*/

	}

}
