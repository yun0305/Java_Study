package Chapter4;

public class ArrayTest2 {

	public static void main(String[] args) {
		/*int num = 3;
		
		int[] array1 = new int[3];
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = num++;
		}
		
		for(int i=0;i<array1.length;i++) {
			System.out.println("array1["+i+"] = "+array1[i]);
		}*/
		
		int num = 3;
		
		int array[] = new int[3];
		
		for(int i=0;i<array.length;i++) {
			array[i]= num++;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}

	}

}
