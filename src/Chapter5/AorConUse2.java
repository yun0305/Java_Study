package Chapter5;

public class AorConUse2 {

	public static void main(String[] args) {
		
		Aircon airCon1 = new Aircon();
		
		//���� ���
		airCon1.color = "white";
		airCon1.temp = 10;
		airCon1.price = 10000;
		
		//�޼ҵ� ���
		airCon1.uptemp();
		System.out.println("airCon1.temp = "+airCon1.temp+", airCon1.color = "+airCon1.color+", airCon1.price = "+airCon1.price+"��"+"\n");
		
		airCon1.onPower();
		airCon1.offPower();
		airCon1.downTemp();
		airCon1.color = "black";
		System.out.println("airCon1.temp = "+airCon1.temp+", airCon1.color = "+airCon1.color+", airCon1.price = "+airCon1.price+"��"+"\n");
		
		
		//�ι�° ��ü ����
		Aircon airCon2 = new Aircon();
		
		System.out.println("aircon2.temp = "+airCon2.temp+", airCon2.color = "+airCon2.color+", airCon2.price = "+airCon2.price+"��"+"\n");
		
		
		//airCon2 ������ aircon1 ���� ���� �� �Ҵ�
		airCon2 = airCon1;
		System.out.println("aircon2.temp = "+airCon2.temp+", airCon2.color = "+airCon2.color+", airCon2.price = "+airCon2.price+"��"+"\n");
		

	}

}
