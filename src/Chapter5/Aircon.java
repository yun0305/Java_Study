package Chapter5;

public class Aircon {
	//��������
	String conpanny;
	String color;
	int price;
	int size;
	int temp;
	
	//�޼ҵ� ����
	
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
