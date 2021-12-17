package Chapter4;

public class ArrayTest6 {

	public static void main(String[] args) {
		String cities[] = new String[] {"서울","대구","춘천","울산","광주","천안"};
		String nation[] = new String[] {"대한민국","미국","영국","일본","프랑스"};
		
		String newArray[] = new String[cities.length+nation.length];
		
		//System.arraycopy(복사할 대상,몆번째 인덱스부터 복사할지,복사한걸 담을 배열,담을 배열의 몆번째 인덱스에 넣을지,인덱스를 몆개 복사할지(첫번째 기준으로 인덱스번호1));
		
		//System.arraycopy(cities, 2, newArray, 2, 3);
		
		
		System.arraycopy(cities, 0, newArray, 0, cities.length);
		System.arraycopy(nation, 0, newArray, cities.length, nation.length);
		
		for(String str : newArray) {
			System.out.println(str);
		}
				
		
	}

}
