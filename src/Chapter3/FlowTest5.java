package Chapter3;

public class FlowTest5 {

	public static void main(String[] args) {
		
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int mat = Integer.parseInt(args[2]);
		
		int total = kor+eng+mat;
		
		if(total>=180) {//��Ż�� 180�� �̻��̰ų� ������ true
			if(kor>=40 && eng>=40 && mat>=40) {//�� ������ �ϳ��� 40�� ���ϸ� false �����̴�
				System.out.println("����� �հ��Դϴ�");
			}
			else {
				System.out.println("�����Դϴ� ���հ��Դϴ�");
			}
		}
		else {
			System.out.println("������ ���ڶ��ϴ� �������Դϴ�");
		}

		/**
		 * if(kor<40 || eng<40 || mat<40){
		 *System.out.println(�����Դϴ� ���հ��Դϴ�);
		 * }
		 * else{
		 * System.out.println("����� �հ��Դϴ�");
		 * }
		 */
		
	}

}
