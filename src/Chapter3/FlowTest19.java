package Chapter3;

public class FlowTest19 {

	public static void main(String[] args) {
		int dannumber = Integer.parseInt(args[0]);
		if(dannumber >=2 && dannumber <= 9) {
			
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

}
