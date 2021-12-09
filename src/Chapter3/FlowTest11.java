package Chapter3;

public class FlowTest11 {

	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		for(int i=0;i<=50;i+=2) {//++는1 그 외에는 +=숫자 를 넣어준다
			sum += i;
			exp += (i==0)?""+i:"+"+i;
		}
		System.out.println(exp+"="+sum);

	}

}
