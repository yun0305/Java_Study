package rotto;

public class RottoMain {

	public static void main(String[] args) {
		int rottoNumber[] = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
		int rotto[] = new int[6];
		int lukyNumber = (int)(Math.random()*45)+1;
		
		
		for(int i=0;i<6;i++) {// i�� 1�� ���ָ�  rotto[]0���濡 �ƹ��͵� �ȵ�� ���ϱ� 0�� ��� ��µ�
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
		
			System.out.print((i==0)? "����� ����� �ζ� ��ȣ�� = "+rotto[i]:","+rotto[i]);
			
			
		}
			System.out.print(" +����� ��ȣ "+lukyNumber);
	}                    

}
