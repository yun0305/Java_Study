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
		System.out.println("���̵� �Է��ϼ���");
		String id = scan.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
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
			System.out.println("���̵� Ʋ�Ƚ��ϴ�");
		}
		else if(logresult == 2) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
		}
		else if(logresult == 3) {
			System.out.println("ȯ���մϴ�");
			break;
		}
		
	}while(logresult < 3);

	}

}
