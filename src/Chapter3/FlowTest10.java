package Chapter3;

public class FlowTest10 {
	
	public static void FlowTest18() {
		int sum = 0;
		int i = 0;
		String exp = "";
		while(true) {
			sum += i;
			exp += (i==0)? ""+i:"+"+i;//+=�� �����ָ� �������� ������ +=�� ���ָ� �����Ǵ� ���� ���� �� ������ �����ش�
			i++;
			
			if(i==51) {
				break;
			}
		}
		System.out.println(exp+"="+sum);
	}
	
	public static void FlowTest17() {
		 int sum = 1;
		 int i = 1;
		 while(i<=50) {
			 sum += i;
			 i++;
		 }
		 System.out.println("����="+sum);
		 
	}
	
	
	public static void FlowTest10() {
		int sum = 0;
		String exp = "";
		
		for(int i=0;i<=50;i++) {
			sum += i;//=�� �ʱ�ȭ ����� +=�� ��� �߰� ����� 
			//���� y���ٰ� i�� �־��ִϱ� 2�� ������� 1�� �ʱ�ȭ�ȴ�
			/*int i = 1;
			  int y = 2;
			 y=i;
			 System.out.println(y);*/
			exp += (i==0)? ""+i:"+"+i;
			
		}
		System.out.println(exp+"="+sum);
	}

	
	public static void main(String[] args) {
		
		int num = 0;
		String exp = "";
		
		for(int i=1;i<=50;i++) {
			num+=i;
			exp += (i==1)? ""+i:"+"+i;
		}
		System.out.println(exp+"="+num);
	}

}
