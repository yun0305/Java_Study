package Chapter5;


	
	class Boiler{
	
	int temp;
	
	void uptemp() {
		temp++;
	}
	void uptemp(int amount) {
		temp+=amount;
	 }
	}
	public class OverroadingTest {
	public static void main(String[] args) {
		
		Boiler boiler = new Boiler();
		
		System.out.println("���� �µ� = "+boiler.temp);
		
		boiler.uptemp();
		System.out.println("boiler.uptemp() �� ���� �µ� = "+boiler.temp);
		boiler.uptemp(20);
		System.out.println("boiler.uptemp(20) �� ���� �µ� = "+boiler.temp);
		

	}

}
