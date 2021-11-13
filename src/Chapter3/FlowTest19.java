package Chapter3;

public class FlowTest19 {

	public static void main(String[] args) {
		int dannumber = Integer.parseInt(args[0]);
		if(dannumber >=2 && dannumber <= 9) {
			
			int num = 1;// 단에 곱해질값
			int result = 0;// 단을 계산하고 그값을 저장해줄 변수
		
			while(num<=9) {
				
				result = dannumber*num;
				System.out.println(dannumber+"*"+num+"="+result);
				
				num++;
				
			}
		}
		else {
			System.out.println("단 값이 잘못되었습니다");
		}

	}

}
