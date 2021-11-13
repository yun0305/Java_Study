package Chapter2;

public class OperationTest2 {

	public static void main(String[] args) {
		/*int total = 0;
		int avg = 0;
		
		int kor = Integer.parseInt(args[0]);
		int mat = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		
		total = kor+mat+eng;
		avg = total/3;
		
		System.out.println("총합 = "+total);
		System.out.println("평균 = "+avg);*/
		
		int total = 0;
		int avg = 0;
		
		int kor = Integer.parseInt(args[0]);//Integer.parseInt 함수를 사용하려면 이함수를 받아주는 데이터 타입은 정수 타입이여야 한다
		int mat = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		
		total = kor+mat+eng;
		avg = total/3;
		
		System.out.println("총합 = "+total);
		System.out.println("평균 = "+avg);
	}

}
