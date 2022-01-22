package Chapter4;

public class ArrayTest1 {

	public static void main(String[] args) {
		//배열 선언
		int ages[];
		String names[];
		
		
		//배열 객체 생성
		ages = new int[3];
		names = new String[3];
		
		//배열 초기화
		ages[0] = 1;
		ages[1] = 2;
		ages[2] = 3;
		
		names[0] = "one";
		names[1] = "two";
		names[2] = "three";
	
		//선언 및 객체생성 초기화는 따로 해주야 한다
		int[] array = new int[4];
		String[] Stringarray = new String[4];
		
		//선언 및 객체생성 초기화 
		int[] intarray = new int[] {1,2,3,4};
		int[] intarray2 = {1,2,3,4};
		
		
	}

}
