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
			System.out.println("����� �츮 ȸ���� �ƴմϴ�");
		}
		else if(loginResult ==2) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
		}
		else {
			System.out.println("ȯ���մϴ�");
				
			}
		}
	}


