package Chapter3;

public class FlowTest4 {

	public static void main(String[] args) {
	//Scanner scan = new Scanner(System.in);
		//int age = scan.nextInt();
		int age = Integer.parseInt(args[0]);
		
		String generation;
		
		if(age/10==0) {
			generation = "10대 이하";
		}
		else if(age/10==1) {
			generation = "10대";
		}
		else if(age/10==2) {
			generation = "20대";
		}
		else if(age/10==3) {
			generation = "30대";
		}
		else if(age/10==4) {
			generation = "40대";
		}
		else if(age/10==5) {
			generation = "50대";
		}
		else if(age/10==6) {
			generation = "60";
		}
		else {
			generation = "사람이 아닙니다";
			
		}
		System.out.println(generation);
	}

}
