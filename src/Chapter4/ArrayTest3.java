package Chapter4;

public class ArrayTest3 {

	public static void main(String[] args) {
		String[] cities = new String[] {"����","�뱸","��õ","���","����","õ��"};
		String[] nation = new String[] {"���ѹα�","�̱�","����","�Ϻ�","������"};
		
		for(int i=0;i<cities.length;i++) {
			System.out.println("cities["+i+"] = "+cities[i]);
		}
		for(int i=0; i<nation.length;i++) {
			System.out.println("nation["+i+"] = "+nation[i]);
		}

	}

}
