package Chapter3;

import java.util.Scanner;

public class FlowTest21 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int randomnumber = (int)(Math.random()*100)+1;//math.random �޼ҵ�� double������ 0.0���� 1.0������ ������ �������ش� 100�� �����ָ� 0���� 99 ������ ���� ��ȯ�ϱ⶧���� 100�� ����� 1�� ���Ѱ��̴�
												//while�� �ۿ� �����ϱ� �ѹ� �������� �����ش�
		
		do {
			System.out.println("���ڸ� �Է��ϼ���");
			System.out.println("���� �Է�");
			int innumber = scan.nextInt();//���⼭ ����� �ʱ�ȭ�� �������� ������ ���ѹݺ��� �Ͼ�� �ֳ��ϸ� ���ڸ� �Է����ּ��信�� ���ڸ� �Է��� �κ��� ������� �����̴�
			
			if(innumber == randomnumber) {
				System.out.println("������ϴ�");
				
				break;
			}
			else if(innumber < randomnumber) {
				System.out.println("���ڰ� �ʹ� �۽��ϴ�");
			}
			else{
				System.out.println("���ڰ� �ʹ� Ů�ϴ�");
			}
			
			
			
		}while(true);*/
		
		Scanner scan = new Scanner(System.in);
		int randomnumber = (int)(Math.random()*100)+1;
		
		do {
			System.out.println("���ڸ� �Է��ϼ���");
			int innumber = scan.nextInt();
			if(innumber==randomnumber) {
				System.out.println("������ϴ�");
				break;
				
			}
			else if(innumber<randomnumber) {
				System.out.println("�Է��Ͻ� ���� �۽��ϴ�");
				
			}
			else {
				System.out.println("�Է��Ͻ� ���� Ů�ϴ�");
				
			}
		}while(true);
	}

}
