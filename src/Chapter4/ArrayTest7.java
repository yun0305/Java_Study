package Chapter4;

public class ArrayTest7 {

	public static void main(String[] args) {
		int[][] array = {{1}, {2,3}, {4,5,6}};// 2���� �迭�� �氳���� ���������� ����� �ִ�  ([2][3])
	    //���� ���� ������ ��� array6[0][0] �� 1�̴�. array6[1][0]�� 2�̴�. 
		System.out.println(array[1][1]);
	
	
		int array2[][] = new int[2][2];
		
		/*array2[][]�� ����
		 * {{��,��},{��,��}}
		 * */
		 
		
		array2[0][0] = 1;
		array2[0][1] = 2;
		array2[1][0] = 3;
		array2[1][1] = 4;
		
		
		int array3[][] = new int[4][7];//7����(7������ ���� �ִ�) ���� 4��
		/*array3[][]�� ����
		 * {{��,��,��,��,��,��,��},{��,��,��,��,��,��,��},{��,��,��,��,��,��,��},{��,��,��,��,��,��,��}}
		 * */
		int array4[][] = new int[6][2];//2����(2������ ���� �ִ�) ���� 6��
		
		
		
		
		
		
		                                   //Ȱ��
	/////////////////////////////////////////////////////////////////////////////////////////////
		//int multiArray[][] = new int[1][]; // �տ��ִ°� 1�����迭 �ڿ��ִ°� 2�����迭
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
