package Chapter4;

import java.util.Scanner;

public class ArrayTest4 {

	public static void mytest() {
		String names[] = new String[] {"ȫ�浿","����ġ","�̵�","�������","�̹���","�̳���","�̹μ�"};
		Scanner scan = new Scanner(System.in);
		
		//int index = -1;
		aaa:do {
			System.out.println("�˻��� �̸��� �Է��ϼ���");
			System.out.println("�̸�:");
			String name = scan.next();
			
			for(int i=0;i<names.length;i++) { 
				if(name.equals(names[i])) {//if���� else�� ��� ���ٰ� �ƹ��͵� �´°� ������ �׳� if���� �����Ų��
					System.out.println("ã���ô� �̸���"+i+"���濡 �ֽ��ϴ�");
					break aaa;
				}
				/*else  {// else�� �ְԵǸ� ȫ�浿(ó�� 0���� ����)�ܿ� �ٸ� �̸����� ùƮ����(i�� 0�϶�����) �Ա��� ���ϱ� ������ System.out.println("�ش��̸��� �����ϴ�");�� ��µȴ�
					System.out.println("�ش��̸��� �����ϴ�");
					}*/
				
				
			}
				System.out.println("�ش��̸��� �����ϴ�");
			
			
		}while(true);
	}
	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	public static void booktest() {
		String names[] = new String[] {"ȫ�浿","����ġ","�̵�","�������","�̹���","�̳���","�̹μ�"};
		Scanner scan = new Scanner(System.in);
		
		//int index = -1;
		do {
			System.out.println("�˻��� �̸��� �Է��ϼ���");
			System.out.println("�̸�:");
			String name = scan.next();
			
			int index = -1;//-1�� ������ 0���� 7���� ��ġ�� �ʱ� ���ؼ�
			
			for(int i=0;i<names.length;i++) {
				if(name.equals(names[i])) {
					index = i;
				}	
			}
				if(index != -1) {
					System.out.println("ã���ô� �̸���"+index+"���濡 �ֽ��ϴ�");
					break;
				}
				else {
					System.out.println("�ش��̸��� �����ϴ�");
				}
			
			
		}while(true);
	}
	
	public static void test() {
		Scanner scan = new Scanner(System.in);
		String name[] = new String[] {"ȫ�浿","����ġ","�̵�","�������","�̹���","�̳���","�̹μ�"};
		
		stop:do {
			System.out.println("�̸��� �Է��Ͻʽÿ�");
			System.out.println("�̸�");
			String names = scan.next();
			
			for(int i=0;i<name.length;i++) {
				if(names.equals(name[i])) {
					System.out.println("ã���ô� �̸���"+name[i]+"�Դϴ�");
					System.out.println("ã���ô� �̸���"+i+"���濡 �ֽ��ϴ�");
					break stop;
				}
				
				//System.out.println("ã���ô� �̸��� �����ϴ� �ٽ� �Է��� �ֽʽÿ�"); for ���� ������ָ� for������ �ݺ��Ǳ� ������ for�� �ۿ��� ���������
			}
			System.out.println("ã���ô� �̸��� �����ϴ� �ٽ� �Է��� �ֽʽÿ�");
		}while(true);
		
		
	}
	public static void main(String[] args) {
		//mytest();
		//booktest();
		test();
		
	}

}
