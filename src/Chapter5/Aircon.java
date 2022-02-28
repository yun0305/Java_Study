package Chapter5;

public class Aircon {
	//변수정의
	String conpanny;
	String color;
	int price;
	int size;
	int temp;
	
	//메소드 정의
	
	void onPower() {
		System.out.println("power on");
	}
	void offPower() {
		System.out.println("power off");
	}
	void uptemp() {
		temp++;
	}
	void downTemp() {
		temp--;
	}
	
}
