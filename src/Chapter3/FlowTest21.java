package Chapter3;

import java.util.Scanner;

public class FlowTest21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = (int)(Math.random()*100)+1;//math.random �޼ҵ�� double������ 0.0���� 1.0������ ������ �������ش� 100�� �����ָ� 0���� 99 ������ ���� ��ȯ�ϱ⶧���� 100�� ����� 1�� ���Ѱ��̴�
												//while�� �ۿ� �����ϱ� �ѹ� �������� �����ش�
			int innumber = 0;//����ڰ� �Է��� ���� ���� ���·� ������ inNumber ������ ���� 0���� �ʱ�ȭ��Ų �κ��̴�
						 // �ʱ�ȭ�� �����ָ� ���ѹݺ��� �Ͼ��
		
		do {
			System.out.println("���ڸ� �Է��ϼ���");
			System.out.println("���� �Է�");
			innumber = scan.nextInt();
			
			if(innumber == number) {
				System.out.println("������ϴ�");
				
				break;
			}
			else if(innumber < number) {
				System.out.println("���ڰ� �ʹ� �۽��ϴ�");
			}
			else{
				System.out.println("���ڰ� �ʹ� Ů�ϴ�");
			}
			
			
			
		}while(true);
	}

}
