package Chapter3;

public class FlowTest23 {

	public static void main(String[] args) {
		
		int num = 0;
		char c = 'A';
		aaa: while(true) {
			while(true) {
				num++;
				System.out.print(c++);
											//if(num<=5) �̷������� ���� ������ 1����5������ ����̵ǰ� 26 ���� ��� �ǾߵǴµ� �Ұ�����
				if(num%5==0) {				//�̷����̸� 5�� ������ 0�� ������ ������ break�� �ɸ��� ������ 5 ������ ���� ���� ����//������ �������� ��ǻ�Ϳ��� ���� 0������ ó���� ���Ѵ�
					
					break;
				}
				if(num == 26) {
					break aaa;
				}
				
			}
			System.out.println();
		}

	}

}
