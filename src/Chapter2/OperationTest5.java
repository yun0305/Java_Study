package Chapter2;

public class OperationTest5 {

	public static void main(String[] args) {
		int var_inc = 0;//0���� �ʱ�ȭ ���س����� ������ �ȵ� �ֳĸ� ���� �ȵ� �����ϱ�
		int result = 0;
		
		//++
		result = var_inc++;//�������� � ������ �Ҵ� ��ų���� �� ���� ���� ���� ��Ű�� �Ȱ� �Ҵ��Ѵ�
		System.out.println(result);//var_inc���� 0�� ���� result ������ �Ҵ��ϰ� var_inc ���� �ϳ� ������Ų��
		System.out.println(var_inc);
		
		result = ++var_inc;//������ ���� �ٺ��� ���� ������
		System.out.println(result);//var_inc�� ���� �� 2�� 3���� ������Ű�� result ������ �����Ѵ�
		System.out.println(var_inc);
	}

}
