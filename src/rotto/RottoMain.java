package rotto;

public class RottoMain {

	public static void main(String[] args) {
		int rottoNumber[] = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
		int rotto[] = new int[6];
		int lukyNumber = (int)(Math.random()*45)+1;
		
		
		for(int i=0;i<6;i++) {// i를 1로 해주면  rotto[]0번방에 아무것도 안들어 가니까 0이 계속 출력됨
			int randomRotto = (int)(Math.random()*45)+1;
		if(rottoNumber[randomRotto] == 0) {
			i--;
			continue;
		}
		else{
			rotto[i] = randomRotto;
			 rottoNumber[randomRotto] = 0;
		}
			
		}
		
		
		for(int i=0;i<=5;i++) {
		
			System.out.print((i==0)? "당신의 행운의 로또 번호는 = "+rotto[i]:","+rotto[i]);
			
			
		}
			System.out.print(" +행운의 번호 "+lukyNumber);
	}                    

}
