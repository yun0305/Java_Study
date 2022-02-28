package Chapter5;

public class AirConUse1 {

	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		
		//변수 사용
		aircon.color = "white";
		aircon.temp = 10;
		aircon.price = 10000;
		
		//메소드 사용
		aircon.uptemp();
		System.out.println("aircon.temp = "+aircon.temp+", aircon,color = "+aircon.color+", aircon.price = "+aircon.price + "원 ");
		aircon.onPower();
		aircon.offPower();
		aircon.downTemp();
		System.out.println("aircon.temp = "+aircon.temp+", aircon,color = "+aircon.color+", aircon.price = "+aircon.price + "원 ");
	}

}
