package Chapter3;

public class FlowTest14 {

	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		//for(int i=0;i<=50&&i%2==0;i++) {// 이런식으로 할 경우 &&연산자에서 false가 되므로 for문이 닫이게 된다
		for(int i=1;i<=50;i++) {
			if(i%2==0) {//짝수만 구해서 넣는곳 //if(i%2==1)이 부분을 1로 바꿔주면 홀수로 변한다
			sum += i;
			exp +=(i==2||i==1)?""+i:"+"+i;
			}
		}
		System.out.println(exp+"="+sum);
	}

}
