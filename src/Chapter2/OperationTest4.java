package Chapter2;

public class OperationTest4 {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		boolean result;
		
		//&& true
		result = x<y && y>=200;
		System.out.println(result);
		
		//false
		result = x<y && y<200;
		System.out.println(result);
		
		//flase
		result = x>y && y++>200;// ���������� ��� ���� ������ false�� ���� ������ �����ʴ´�.(�ӵ� ����� ����)
								// ������ ������� �����Ƿ� y�� �������� ������� �ʴ´�
		System.out.println(result);
		System.out.println(y);
		
		//||true
		result = x<y || y>=200;
		System.out.println(result);
		
		//true
		result = x<y || y<200;
		System.out.println(result);
		
		//true
		result = x<y || y++>200;// �� ���� true�� ������ ������� �ʴ´� �׷��Ƿ� y���� ���� ���� �ʴ´�
		System.out.println(result);
		System.out.println(y);
		
		//flase
		result = x>y || y++>200;//
		System.out.println(result);//|| ������ false �̹Ƿ� ������ ����Ǿ�� �ϹǷ� ���� y���� �����Ǽ� 201�̵�
		System.out.println(y);
		
		//!
		result = !(x>y);
		System.out.println(result);
	}

}
