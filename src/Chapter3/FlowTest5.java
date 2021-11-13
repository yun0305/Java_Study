package Chapter3;

public class FlowTest5 {

	public static void main(String[] args) {
		
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int mat = Integer.parseInt(args[2]);
		
		int total = kor+eng+mat;
		
		if(total>=180) {//토탈이 180점 이상이거나 같으면 true
			if(kor>=40 && eng>=40 && mat>=40) {//각 점수중 하나라도 40점 이하면 false 과락이다
				System.out.println("당신은 합격입니다");
			}
			else {
				System.out.println("과락입니다 불합격입니다");
			}
		}
		else {
			System.out.println("총점이 모자랍니다 불힙격입니다");
		}

		/**
		 * if(kor<40 || eng<40 || mat<40){
		 *System.out.println(과락입니다 불합격입니다);
		 * }
		 * else{
		 * System.out.println("당신은 합격입니다");
		 * }
		 */
		
	}

}
