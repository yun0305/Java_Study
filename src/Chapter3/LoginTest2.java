package Chapter3;

public class LoginTest2 {

	public static void main(String[] args) {
		
		String id = args[0];
		String pass = args[1];
	
		if(!id.equals("javaid")) {//단일 if일 경우에 첫 if에서 끝나기 때문에 !논리 연산자를 사용한것이다
				System.out.println("당신은 우리 회원이 아닙니다");
			}
		else if(!pass.equals("javapass")){
			System.out.println("비밀번화가 다릅니다 다시 입력해주세요");
		}
		else {
			System.out.println("환영합니다");
		}
		
	/*if(!id.equals("javaid")) {// id가 "javaid"와 다르면 (참이면) 11번줄 실행 다르면 13번 조건문 실행
			System.out.println("당신은 우리 회원이 아닙니다");
		}
	else if(!pass.equals("javapass")) {//pass가 javapass와 다르면 참이므로
		System.out.println("비밀번호가 틀립니다");
	}
	else {
		System.out.println("환영합니다");
	}*/
  }

}
               