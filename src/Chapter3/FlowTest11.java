package Chapter3;

public class FlowTest11 {

	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		for(int i=0;i<=50;i+=2) {
			sum += i;
			exp += (i==0)?""+i:"+"+i;
		}
		System.out.println(exp+"="+sum);

	}

}
