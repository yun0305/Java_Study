package Chapter3;

public class LoginTestTuning {

	public static void main(String[] args) {
		String dbId="java";
		String dbpasswd="java";
		
		String userid = args[0];
		String userpasswd = args[1];
		
		int loginResult;
		
		if(!userid.equals(dbId)) {
			loginResult = 1;
		}
		else if(!userpasswd.equals(dbpasswd)) {
			loginResult = 2;
		}
		else {
			loginResult = 3;
		}
		
		if(loginResult == 1) {
			System.out.println("당신은 우리 회원이 아닙니다");
		}
		else if(loginResult ==2) {
			System.out.println("비밀번호가 일치하지 않습니다");
		}
		else {
			System.out.println("환영합니다");
				
			}
		}
	}


