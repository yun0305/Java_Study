package Chapter3;

import java.util.Scanner;

public class LoginTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
		String id = scan.next();// �Է� ���� while�� �ۿ� �־����� ������ Ʋ���� ��� ���� �ݺ��� �Ͼ�� �ֳĸ� Ʋ������ ��� �ԷµǾ��ֱ⶧���� Ʋ���� �������� ��� while ���� ����
								//�� 11�� 13�� �ֵ鵵 while������ ��� ������� �ʱ�ȭ�Ǹ鼭 ���ο� ���� �Է¹޴´�
		String pass = scan.next();
		
		
		if(id.equals("javaid")) {
			if(pass.equals("javapass")) {
				System.out.println("ȯ���մϴ�");
				break ;// break ���� �־��־ �����Ų��//�ݺ����� �ϳ��� �׳� break �ϳ��� ���α׷��� �����Ų��
			}
			else {
				System.out.println("��й�ȣ�� �ٸ��ϴ� �ٽ� �Է��� �ּ���");
				
			}
		}
		else {
			System.out.println("���̵� �ٸ��ϴ� �ٽ� �Է��� �ּ���");
			
		}
		}while(true);
		
		
		/*if(id.equals("javaid")) {
			if(pass.equals("javapass")) {
				System.out.println("ȯ���մϴ�");
			}
			else {
				System.out.println("��й�ȣ�� �ٸ��ϴ�");
			}
		}
		else {
			System.out.println("����� �츮 ȸ���� �ƴմϴ�");
		}*/

	}

}
