package Chapter3;

public class FlowTest16 {

	public static void main(String[] args) {
		/*int num = 0;
		
		for(int x=1;x<=5;x++) {// �p���� ������ ���ϴ� ����
			for(int y=1;y<=x;y++) {//1�� ���� num�� �����Ǹ鼭 ù�ٿ� 1�̳����� 2�� ���� 2��3�� �ι�° �ٿ� ��µȴ�
				System.out.print(++num+"\t");
			}
			System.out.println();
		}
		num=0;// num�� �ٽ� �ʱ�ȭ ������
		for(int x=1;x<=4;x++) {
			for(int y=4;y>=x;y--) {//x�� 1�� ���� y�� 4�ϱ� ù�ٿ� num�� 5������ 1 2 3 4  �״����� y�� 1�� ���ҵǰ� y�� 4���ȴ� �׷� 2��° ���� 5 6 7  �� ����̵ȴ� 
				System.out.print(++num+"\t");
			}
			System.out.println();
		}*/
		
		int num = 0;
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(++num+"\t");
			}
			System.out.println();
		}
		num = 0;
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(++num+"\t");
			}
			System.out.println();
		}
		
	}

}
