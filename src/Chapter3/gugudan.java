package Chapter3;

import java.util.Scanner;

public class gugudan {
	
	public static void FlowTest19() {
		
		
		//String[] args;//�̷������� �迭�� ���� ������༭ �־�Z���� ������ �߻��Ѵ� �迭 ��ü�� ���� ���൵ �ȵ�// ���� Run configation���� ������ �ϴµ� ���� �迭�� ������ָ� ����Ҽ� ���?
		Scanner scan = new Scanner(System.in);
		String args = scan.next();
		
		int dannumber = Integer.parseInt(args);
		if(dannumber >=2 && dannumber <= 9) {// 2�� 9 ������ ��� ����(�� int�ϱ� ������)
			
			int num = 1;// �ܿ� ��������
			int result = 0;// ���� ����ϰ� �װ��� �������� ����
		
			while(num<=9) {
				
				result = dannumber*num;
				System.out.println(dannumber+"*"+num+"="+result);
				
				num++;
				
			}
		}
		else {
			System.out.println("�� ���� �߸��Ǿ����ϴ�");
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
