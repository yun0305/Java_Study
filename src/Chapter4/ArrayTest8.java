package Chapter4;

public class ArrayTest8 {
	public static void arrayTest8() {
int recarray[][] = new int[5][5];
		
		for(int i=0;i<recarray.length;i++) {
			for(int j=0;j<recarray[i].length;j++) {
				if(i==0||i==recarray.length-1||j==0||j==recarray[i].length-1) {
					recarray[i][j] = 1;
				}
			}
		}
		for(int i=0;i<recarray.length;i++) {
			for(int j=0;j<recarray[i].length;j++) {
				System.out.print(recarray[i][j]);
			}
			System.out.println();
		}
		//recarray[i].length���� �濡 �p���� ���� �ִ��� �����ش� ��
		/*String array[][] = new String[2][4];
		System.out.println(array.length);
		System.out.println(array[1].length);*/
	}
	
	public static void myArrayTest9() {
		int recarray[][] = new int[5][5];
		
		for(int i=0;i<recarray.length;i++) {
			for(int j=0;j<recarray[i].length;j++) {
				if(j==0||i==4||j==4||i==0||i==1&&j==1||i==2&&j==2||i==3&&j==3) {
					recarray[i][j] = 1;
				}
			}
		}
		for(int i=0;i<recarray.length;i++) {
			for(int j=0;j<recarray[i].length;j++) {
				System.out.print(recarray[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void test() {
		int ractangleArray[][] = new int[5][5];
		
	
		for(int i=0;i<ractangleArray.length;i++) {
			for(int j=0;j<ractangleArray[i].length;j++) {
				if(i==0||i==ractangleArray.length-1||j==0||j==ractangleArray[i].length-1||i==j) {
					ractangleArray[i][j] = 1;
				}
			}
		}
		for(int i=0;i<ractangleArray.length;i++) {
			for(int j=0;j<ractangleArray[i].length;j++) {
				System.out.print(ractangleArray[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		//myArrayTest9();
		test();
		//arrayTest8();
	}

}
