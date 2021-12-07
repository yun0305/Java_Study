package Chapter4;

public class ArrayTest3 {

	public static void main(String[] args) {
		String[] cities = new String[] {"서울","대구","춘천","울산","광주","천안"};
		String[] nation = new String[] {"대한민국","미국","영국","일본","프랑스"};
		
		for(int i=0;i<cities.length;i++) {
			System.out.println("cities["+i+"] = "+cities[i]);
		}
		for(int i=0; i<nation.length;i++) {
			System.out.println("nation["+i+"] = "+nation[i]);
		}

	}

}
