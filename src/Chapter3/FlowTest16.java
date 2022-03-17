package Chapter3;

public class FlowTest16 {

	public static void main(String[] args) {
		/*int num = 0;
		
		for(int x=1;x<=5;x++) {// 몆줄을 만들지 정하는 구간
			for(int y=1;y<=x;y++) {//1이 들어가면 num이 증감되면서 첫줄에 1이나오고 2가 들어가면 2와3이 두번째 줄에 출력된다
				System.out.print(++num+"\t");
			}
			System.out.println();
		}
		num=0;// num을 다시 초기화 시켜줌
		for(int x=1;x<=4;x++) {
			for(int y=4;y>=x;y--) {//x가 1이 들어가면 y는 4니까 첫줄에 num이 5번돈다 1 2 3 4  그다음엔 y가 1이 감소되고 y는 4가된다 그럼 2번째 줄은 5 6 7  가 출력이된다 
				System.out.print(++num+"\t");
			}
			System.out.println();
		}*/
		
		int num = 0;
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(++num+"\t");
			}
			System.out.println();
		}
		num = 0;
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(++num+"\t");
			}
			System.out.println();
		}
		
	}

}
