package Chapter3;

import java.util.Scanner;

public class Loginwhile {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String iddb = "javaid";
	String passdb = "javapass";
	int logresult = 0;
	
	do {
		System.out.println();
		System.out.println("아이디를 입력하세요");
		String id = scan.next();
		System.out.println("비밀번호를 입력하세요");
		String pass = scan.next();
		
		if(!id.equals(iddb)) {
			logresult = 1;
		}
		else if(!pass.equals(passdb)) {
			logresult = 2;
		}
		else if(id.equals(iddb)&&pass.equals(passdb)){
			logresult = 3;
		}
		else {
			logresult = 4;
		}
		
		if(logresult == 1) {
			System.out.println("아이디가 틀렸습니다");
		}
		else if(logresult == 2) {
			System.out.println("비밀번호가 틀렸습니다");
		}
		else if(logresult == 3) {
			System.out.println("환영합니다");
			break;
		}
		
	}while(logresult < 3);

	}

}
