package Chapter3;

public class LoginTest2 {

	public static void main(String[] args) {
		
		String id = args[0];
		String pass = args[1];
	
		if(!id.equals("javaid")) {//���� if�� ��쿡 ù if���� ������ ������ !�� �����ڸ� ����Ѱ��̴�
				System.out.println("����� �츮 ȸ���� �ƴմϴ�");
			}
		else if(!pass.equals("javapass")){
			System.out.println("��й�ȭ�� �ٸ��ϴ� �ٽ� �Է����ּ���");
		}
		else {
			System.out.println("ȯ���մϴ�");
		}
		
	/*if(!id.equals("javaid")) {// id�� "javaid"�� �ٸ��� (���̸�) 11���� ���� �ٸ��� 13�� ���ǹ� ����
			System.out.println("����� �츮 ȸ���� �ƴմϴ�");
		}
	else if(!pass.equals("javapass")) {//pass�� javapass�� �ٸ��� ���̹Ƿ�
		System.out.println("��й�ȣ�� Ʋ���ϴ�");
	}
	else {
		System.out.println("ȯ���մϴ�");
	}*/
  }

}
               