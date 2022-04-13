package Chapter5;

public class VariableArgument {
	
	void printinfo(String ... infos) {
		if(infos.length !=0) {
			for(int i=0;i<infos.length;i++) {
				System.out.println(infos[i]);
			}
		}
		else {
			System.out.println("인자가 없네요");
		}
	}
	
	public static void main(String[] args) {
		
		VariableArgument vt = new VariableArgument();
		
		System.out.print("인자가 없을때 :"); 
		vt.printinfo();
		
		System.out.println();
		
		System.out.print("인자가 한 개일때 :");
		vt.printinfo("허윤");
		
		System.out.println();
		
		System.out.print("인자가 두 개일때 :");
		vt.printinfo("허윤","개발부");
		
		System.out.println();
		
		System.out.print("인자가 세 세일때 :");
		vt.printinfo("허윤","개발부","1억");
		
		System.out.println();
		
	}

}
