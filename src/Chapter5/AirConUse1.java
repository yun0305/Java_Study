package Chapter5;

public class AirConUse1 {

	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		
		//���� ���
		aircon.color = "white";
		aircon.temp = 10;
		aircon.price = 10000;
		
		//�޼ҵ� ���
		aircon.uptemp();
		System.out.println("aircon.temp = "+aircon.temp+", aircon,color = "+aircon.color+", aircon.price = "+aircon.price + "�� ");
		aircon.onPower();
		aircon.offPower();
		aircon.downTemp();
		System.out.println("aircon.temp = "+aircon.temp+", aircon,color = "+aircon.color+", aircon.price = "+aircon.price + "�� ");
	}

}
