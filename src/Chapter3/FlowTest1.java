package Chapter3;

import java.util.Scanner;

public class FlowTest1 {

	public static void main(String[] args) {
		
		//int year = Integer.parseInt(args[0]);
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		boolean leapYear = false;
		
		leapYear = (year%4==0 && year%100 != 0 || year%400==0);//���ǽ��� ������ true�ιٲ��
		//�⵵�� 4�� ������ 0���� ��������,�⵵�� 100���� ����� 0���� �������� �ʰ�(0�� �Ǹ� �ȵȴ�) "�Ǵ�" �⵵�� 400���� ���������� �������� true
		if(leapYear) {
			System.out.println("���ش� ����");
		}
		else{
			System.out.println("���ش� ������ �ƴ�");
		}
	}

}
