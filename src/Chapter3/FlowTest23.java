package Chapter3;

public class FlowTest23 {

	public static void main(String[] args) {
		
		int num = 0;
		char c = 'A';
		aaa: while(true) {
			while(true) {
				num++;
				System.out.print(c++);
											//if(num<=5) 이런식으로 안한 이유는 1에서5까지만 출력이되고 26 까지 출력 되야되는데 불가능함
				if(num%5==0) {				//이런식이면 5로 나눠서 0이 나오는 구간은 break가 걸리기 때문에 5 단위로 끈어 쓸수 있음//나누어 떨어져도 컴퓨터에선 몫이 0단위면 처리를 안한다
					
					break;
				}
				if(num == 26) {
					break aaa;
				}
				
			}
			System.out.println();
		}

	}

}
