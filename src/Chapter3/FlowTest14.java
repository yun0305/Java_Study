package Chapter3;

public class FlowTest14 {

	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		//for(int i=0;i<=50&&i%2==2;i++) {// �̷������� �� ��� &&�����ڿ��� false�� �ǹǷ� for���� ���̰� �ȴ�
		for(int i=1;i<=50;i++) {
			if(i%2==0) {//¦���� ���ؼ� �ִ°�
			sum += i;
			exp +=(i==2)?""+i:"+"+i;
			}
		}
		System.out.println(exp+""+sum);
	}

}
