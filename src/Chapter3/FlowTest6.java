package Chapter3;

public class FlowTest6 {

	public static void main(String[] args) {
		
		String job = args[0];
		int salary = 0;
		
		switch(job) {
		case "���":
			salary = 30000000;
			break;
		case "�븮":
			salary = 40000000;
			break;
		case "����":
			salary = 50000000;
			break;
		case "����":
			salary = 60000000;
			break;
			default:
				System.out.println("����� ����� �ƴմϴ�.");
		}
		System.out.println("����� ������ = "+salary);

	}
}
