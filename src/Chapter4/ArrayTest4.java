package Chapter4;

import java.util.Scanner;

public class ArrayTest4 {

	public static void mytest() {
		String names[] = new String[] {"홍길동","전우치","이도","세종대왕","이민지","이나라","이민수"};
		Scanner scan = new Scanner(System.in);
		
		//int index = -1;
		aaa:do {
			System.out.println("검색할 이름을 입력하세요");
			System.out.println("이름:");
			String name = scan.next();
			
			for(int i=0;i<names.length;i++) { 
				if(name.equals(names[i])) {//if문은 else가 없어도 돌다가 아무것도 맞는게 없으면 그냥 if문을 종료시킨다
					System.out.println("찾으시는 이름은"+i+"번방에 있습니다");
					break aaa;
				}
				/*else  {// else를 넣게되면 홍길동(처음 0번과 같은)외에 다른 이름들은 첫트에서(i가 0일때부터) 입구컷 당하기 때문에 System.out.println("해당이름은 없습니다");이 출력된다
					System.out.println("해당이름은 없습니다");
					}*/
				
				
			}
				System.out.println("해당이름은 없습니다");
			
			
		}while(true);
	}
	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	public static void booktest() {
		String names[] = new String[] {"홍길동","전우치","이도","세종대왕","이민지","이나라","이민수"};
		Scanner scan = new Scanner(System.in);
		
		//int index = -1;
		do {
			System.out.println("검색할 이름을 입력하세요");
			System.out.println("이름:");
			String name = scan.next();
			
			int index = -1;//-1인 이유는 0부터 7까지 겹치지 않기 위해서
			
			for(int i=0;i<names.length;i++) {
				if(name.equals(names[i])) {
					index = i;
				}	
			}
				if(index != -1) {
					System.out.println("찾으시는 이름은"+index+"번방에 있습니다");
					break;
				}
				else {
					System.out.println("해당이름은 없습니다");
				}
			
			
		}while(true);
	}
	public static void main(String[] args) {
		mytest();
		//booktest();
	}

}
