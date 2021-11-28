package Chapter3;

public class test {

	public static void main(String[] args) {
		//Flowtest23
		/*int i = 4;
		boolean num = true;
		num = (i%5==0)?true:false;
			System.out.println(9%5);
		*/
		
		//ArgsTest
		for(int i=1; i<9; i++){//반복문은 거짓이 되면 돌지 않는다
            if(i==3) { //3에서 멈추고 출력은 하지 않는다
            	break;
            }
            if(i==3) {//3을 없애준다 나머지 숫자들은 나오도록 해준다
            	continue;
            }
            System.out.println(i);
            
        }
 
        System.out.println("반복문 끝!");
    }


		

		//for(int i = 0; i<=5; i++) {
		//System.out.println(i);
		//}
	}


