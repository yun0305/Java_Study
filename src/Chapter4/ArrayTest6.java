package Chapter4;

import java.util.Arrays;

public class ArrayTest6 {
	
	public static void arraytest6() {
		String cities[] = new String[] {"����","�뱸","��õ","���","����","õ��"};
		String nation[] = new String[] {"���ѹα�","�̱�","����","�Ϻ�","������"};
		
		String newArray[] = new String[cities.length+nation.length];
		
		//System.arraycopy(������ ���,�p��° �ε������� ��������,�����Ѱ� ���� �迭,���� �迭�� �p��° �ε����� ������,�ε����� �p�� ��������(ù��° �������� �ε�����ȣ1));
		
		//System.arraycopy(cities, 2(�迭���ȣ0����), newArray, 2(�迭���ȣ0����), 3(�迭�� ����1����));
		
		System.arraycopy(cities, 0, newArray, 0, cities.length);
		//System.arraycopy(nation, 0, newArray, cities.length, nation.length);
		
		for(String str : newArray) {
			System.out.println(str);
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		String test[] = new String[] {"1","2","3","4","5"};
		
		System.out.println(Arrays.toString(test));
	}
	public static void test() {
		String citis[] = new String[] {"����","�뱸","�λ�","�ϻ�","��õ"};
		String nation[] = new String[] {"���ѹα�","�Ϻ�","�߱�","�̱�","����"};
		
		String result[] = new String[citis.length+nation.length];
		
		System.arraycopy(citis,2,result,2,3);
		for(String full : result) {
			System.out.println(full);
		}
		
	}

	public static void main(String[] args) {
			test();
	}

}
