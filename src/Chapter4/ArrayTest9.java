package Chapter4;

public class ArrayTest9 {

	public static void main(String[] args) {
		
		int array[][] = new int[5][5];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(i==0||i==array.length-1||j==0||j==array[i].length-1||i==j) {
					array[i][j] = 1;
				}
			}
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		

	}

}
