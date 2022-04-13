package Chapter5;

public class Args {
	int x;
	
	void add(int x) {//메소드 명이 같더라도 인자 값의 개수가 다르면 다른 함수로 취급한다
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
