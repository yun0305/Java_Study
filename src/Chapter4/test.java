package Chapter4;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		//////////////////////////////////////////////
		/*int[][] array = {{1}, {2,3}, {4,5,6}};// 2차원 배열의 방개수는 가변적으로 만들수 있다
	    //위와 같이 선언할 경우 array6[0][0] 는 1이다. array6[1][0]은 2이다. 
		System.out.println(array[1][1]);
	
	
		int array2[][] = new int[2][2];
		
		array2[0][0] = 1;
		array2[0][1] = 2;
		array2[1][0] = 3;
		array2[1][1] = 4;
		
		
		int array3[][] = new int[2][7];
	*/
		/////////////////////////////////////////////
		/*int recarray[][] = new int[5][5];
		int i=0;
		int j=0;
		recarray[i][j] = 1; 
		System.out.println(recarray[i][j]);
		*/
		////////////////////////////////////////
		/*String array1[] = new String[] {"qq","ww","ee","rr"};
		String array2[] = new String[] {"aa","ss","dd","ff"};
		String array3[] = new String[array1.length+array2.length];
		
		System.arraycopy(array1,0,array3,3,1);
		
		for(String array:array3) {
			System.out.println(array);
		}*/
		////////////////////////////////////////
		/*String array[][] = new String[2][4];
		System.out.println(array.length);
		System.out.println(array[1].length);*/
		
		/*for(int i=0;i<5;i++) {
			//System.out.println(i);
			System.out.print(i);
		}*/
		//////////////////////////////////////////
		/*int random = (int)(Math.random()*5)+1;
		
		stop:do {
		for(int i=0;i<random;i++) {
			System.out.println(random);
			System.out.println(random);
			
			break stop;
		}
		}while(true);
		*/
		///////////////////////중요##########
		/*int teamindex = 0;
		while(teamindex<4) {
			teamindex++;
		//	System.out.println(teamindex);
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(i);
		}
		*//*String member[] = new String[] {"팀장1","팀장2","팀장3","팀장4","팀장5","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19"
				,"20","21","22","23","24","25"};
		String oldMember[] = new String[25];
		int index =1;
		int teamIndex = 0;//67번 for문이 끝나면 
		int oldMemberIndex = 0;
		System.out.println(oldMemberIndex);
		oldMember[oldMemberIndex++] = member[index];
		System.out.println(oldMemberIndex);*/
		/*String team[][] = new String[5][5];
		String member[] = new String[]{"111","222","333","444","555","a","b","c","d","e","f","g","h","i","j","k","l","n","m","o","p","q","r","s","t"};
		
		int index = -1;
		
		for(int i=0;i<team.length;i++) {
			index = (int)(Math.random()*5);
			team[i][0] = member[index];
			
			for(int j=0;j<i;j++) {
				if(team[j][0]==member[index]) {
					i--;
					break;
				}
				
			}
			
		}
		
		
		String oldMember[] = new String[20];
		int teamIndex = 0;
		int oldMemberIndex = 0;
		index = -1;
		
		for(;;) {
			
		for(int j=1;j<team[teamIndex].length;j++) {
			index = (int)(Math.random()*20)+5;
			team[teamIndex][j] = member[index];
			oldMember[oldMemberIndex++] = member[index];
			
			for(int a=0;a<oldMemberIndex-1;a++) {
				if(oldMember[a]==member[index]) {
					j--;
					oldMemberIndex--;
					break;
				}
			}
		
		}
		if(teamIndex<4) {
			teamIndex++;
			
		}
		else {
			break;
		}
		}
		for(int i=0;i<team.length;i++) {
			System.out.println("팀장 :" +team[i][0]);
			System.out.print("팀원 :");
			for(int j=1;j<team[i].length;j++) {
				System.out.print((j==1) ? team[i][j] : ","+team[i][j]);
			}
			System.out.println();
		}*/
		
		
		
		while(true) {
			int leader = (int)(Math.random()*5);
			if(leader==3) {
			System.out.println(leader);
			break;
			}
		}
			
		
		
	}
	}
