package Chapter3;

import java.util.Scanner;

public class DayCountOfMonth {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);//char�� �Է� ���� ���� (char)System.in.read �޼��带 �̿��Ѵ�
	int year = scan.nextInt();  //int�� �Է� ���� ���� nextInt �޼��带 �̿��Ѵ�.
								// �⵵�� �־��ִ� ����
	int month = scan.nextInt();//���� �־��ִ� ����
	
	int daycount = 0; //�־��� ���� �p���� �ִ��� �־��ִ� ����
	boolean rigthMonth = true;//�⵵�� �ް��� �ǹٸ��� �ʴٸ� false�� �ٲ��
	
	switch(month){
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		daycount =31;
		break;
	case 4: case 6: case 9: case 11:
	daycount = 30;
		break;
	case 2:
		if(year%4==0 && year%100 != 0 || year%400 == 0) {
			daycount = 29;
		}
		else {
			daycount = 28;
		}
		break;
	default :
		rigthMonth = false;
	
	}
	
	
	if(rigthMonth) {
		System.out.println(year+"�� "+month+"���� "+daycount+"�� �����Դϴ�");
	}
	else {
		System.out.println("�������� �ʴ� �� �Դϴ�");
	}
	
	
	}

}
