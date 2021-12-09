package Chapter3;

public class ArgsTest {

	public static void main(String[] args) {
		
		aaa:for(char c='A';c<='C';c++) {
			 for(int x=1;x<=3;x++) {
				if(x==2) {
					continue;
				}
				if(c=='B') {//2번째 디버깅에서 B에서 이부분이 걸리기 때문에 2번째 for문을 빠져나와서 첫번째 for문으로 간다
					continue aaa;
				}
				System.out.println("c = "+c+","+"x = "+x);
				
			}
		}
	}

}
