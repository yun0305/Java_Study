package Chapter3;

public class FlowTest10 {
	
	public static void FlowTest18() {
		int sum = 0;
		int i = 0;
		String exp = "";
		while(true) {
			sum += i;
			exp += (i==0)? ""+i:"+"+i;//+=를 안해주면 최종값만 나오고 +=를 해주면 증감되는 수에 따라 그 과정을 보여준다
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
		 System.out.println("합은="+sum);
	}
	public static void FlowTest10() {
		int sum = 0;
		String exp = "";
		
		for(int i=0;i<=50;i++) {
			sum += i;
			exp += (i==0)? ""+i:"+"+i;
			
		}
		System.out.println(exp+"="+sum);
	}

	public static void main(String[] args) {
		
		//FlowTest17();
		//FlowTest10();
		FlowTest18();
		
	}

}
