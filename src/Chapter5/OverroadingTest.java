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
		
		System.out.println("현재 온도 = "+boiler.temp);
		
		boiler.uptemp();
		System.out.println("boiler.uptemp() 후 현재 온도 = "+boiler.temp);
		boiler.uptemp(20);
		System.out.println("boiler.uptemp(20) 후 현재 온도 = "+boiler.temp);
		

	}

}
