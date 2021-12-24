package Chapter4;

public class ArrayTest7 {

	public static void main(String[] args) {
		int[][] array = {{1}, {2,3}, {4,5,6}};// 2차원 배열의 방개수는 가변적으로 만들수 있다  ([2][3])
	    //위와 같이 선언할 경우 array6[0][0] 는 1이다. array6[1][0]은 2이다. 
		System.out.println(array[1][1]);
	
	
		int array2[][] = new int[2][2];
		
		/*array2[][]의 구조
		 * {{값,값},{값,값}}
		 * */
		 
		
		array2[0][0] = 1;
		array2[0][1] = 2;
		array2[1][0] = 3;
		array2[1][1] = 4;
		
		
		int array3[][] = new int[4][7];//7개인(7개가가 들어갈수 있는) 방이 4개
		/*array3[][]의 구조
		 * {{값,값,값,값,값,값,값},{값,값,값,값,값,값,값},{값,값,값,값,값,값,값},{값,값,값,값,값,값,값}}
		 * */
		int array4[][] = new int[6][2];//2개인(2개가가 들어갈수 있는) 방이 6개
		
		
		
		
		
		
		                                   //활용
	/////////////////////////////////////////////////////////////////////////////////////////////
		//int multiArray[][] = new int[1][]; // 앞에있는게 1차원배열 뒤에있는게 2차원배열
		int multiArray[][] = new int[2][2];
		char c = 'A';
		
		for(int i=0;i<multiArray.length;i++) {
			for(int j=0;j<multiArray[i].length;j++) {
				multiArray[i][j] = c++;
				System.out.println("multiArray["+i+"]"+"["+j+"]="+(char)multiArray[i][j]);
			}
		}
		
		
		
		
	}

}
