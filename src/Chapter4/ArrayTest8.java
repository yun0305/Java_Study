package Chapter4;

public class ArrayTest8 {

	public static void main(String[] args) {
			
		int recarray[][] = new int[5][5];
		
		for(int i=0;i<recarray.length;i++) {
			for(int j=0;j<recarray[i].length;j++) {
				if(i==0||i==recarray.length-1||j==0||j==recarray[i].length-1) {
					recarray[i][j] = 1;
				}
			}
		}
		for(int i=0;i<recarray.length;i++) {
			for(int j=0;j<recarray.length;j++) {
				System.out.printf(recarray[i][j]+"");
			}
			System.out.println();
		}
	}

}
