package Chapter4;

public class ArrayTest6 {

	public static void main(String[] args) {
		String cities[] = new String[] {"����","�뱸","��õ","���","����","õ��"};
		String nation[] = new String[] {"���ѹα�","�̱�","����","�Ϻ�","������"};
		
		String newArray[] = new String[cities.length+nation.length];
		
		//System.arraycopy(������ ���,�p��° �ε������� ��������,�����Ѱ� ���� �迭,���� �迭�� �p��° �ε����� ������,�ε����� �p�� ��������(ù��° �������� �ε�����ȣ1));
		
		System.arraycopy(cities, 2, newArray, 2, 3);
		
		for(String newarray:newArray) {
			System.out.println(newarray);
			
		}
	}

}
