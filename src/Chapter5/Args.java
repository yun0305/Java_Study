package Chapter5;

public class Args {
	int x;
	
	void add(int x) {//�޼ҵ� ���� ������ ���� ���� ������ �ٸ��� �ٸ� �Լ��� ����Ѵ�
		x = x+50;
	}
	void add(Args arg) {
		
		arg.x = arg.x+40;
	}
	void addnew(Args arg) {
		arg = new Args();
	
		
	}
	void add(int[] arr) {
		arr[0]++;
		
	}
	public static void main(String[] args) {
			Args arg = new Args();
			
			arg.x = 100;
			int arr[] = new int[1];
		
			arg.add(arg.x);
			System.out.println("arg.x = "+arg.x);
			
			arg.add(arg);
			System.out.println("arg.x = "+arg.x);
			
			arg.addnew(arg);
			System.out.println("arg.x = "+arg.x);
			
			arg.add(arr);
			System.out.println("arr[0] = "+ arr[0]);

	}

}
