package Chapter5;

public class VariableArgument {
	
	void printinfo(String ... infos) {
		if(infos.length !=0) {
			for(int i=0;i<infos.length;i++) {
				System.out.println(infos[i]);
			}
		}
		else {
			System.out.println("���ڰ� ���׿�");
		}
	}
	
	public static void main(String[] args) {
		
		VariableArgument vt = new VariableArgument();
		
		System.out.print("���ڰ� ������ :"); 
		vt.printinfo();
		
		System.out.println();
		
		System.out.print("���ڰ� �� ���϶� :");
		vt.printinfo("����");
		
		System.out.println();
		
		System.out.print("���ڰ� �� ���϶� :");
		vt.printinfo("����","���ߺ�");
		
		System.out.println();
		
		System.out.print("���ڰ� �� ���϶� :");
		vt.printinfo("����","���ߺ�","1��");
		
		System.out.println();
		
	}

}
