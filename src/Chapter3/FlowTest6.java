package Chapter3;

public class FlowTest6 {

	public static void main(String[] args) {
		
		String job = args[0];
		int salary = 0;
		
		switch(job) {
		case "사원":
			salary = 30000000;
			break;
		case "대리":
			salary = 40000000;
			break;
		case "부장":
			salary = 50000000;
			break;
		case "차장":
			salary = 60000000;
			break;
			default:
				System.out.println("당신은 사원이 아닙니다.");
		}
		System.out.println("당신의 연봉은 = "+salary);

	}
}
