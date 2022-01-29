package Chapter4;

public class TeamGenerater {
/*
 * String oldmember[] = new String[25];
		index = -1;
		int teamIndex = 0;
		int oldmemberindex = 0;
		
		for(;;) {
			
			
			for(int j=0;j<team[teamIndex].length;j++) {
				index = (int)(Math.random()*25);
				team[teamIndex][j] = member[index];
				oldmember[oldmemberindex++] = member[index];
				
				for(int a=0;a<oldmemberindex-1;a++) {
					if(oldmember[a]==member[index]) {
						j--;
						oldmemberindex--;
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
			System.out.println("팀원 :");
			for(int j=1;j<team[i].length;j++) {
				System.out.println((j==1) ? team[i][j] : ","+team[i][j]);
			}
			System.out.println();
		}
 */	
		public static void TeamGenerater() {
			String member[] = new String[] {"팀장1","팀장2","팀장3","팀장4","팀장5","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19"
					,"20","21","22","23","24","25"};
			String team[][] = new String[5][6];
			int index = -1;
			
			for(int i=0;i<5;i++) {
				index = (int)(Math.random()*5);
				team[i][0] = member[index];
				for(int j=0;j<i;j++) {
					if(team[j][0]==member[index]) {
						i --;
						break;
				}
				}
			}
			
			String oldMember[] = new String[25];//71번 줄에 비교문을위해서 만들어준것이다
			index = -1;
			int teamIndex = 0;//67번 for문이 끝나면 
			int oldMemberIndex = 0;
			
			for(;;) {
				
				for(int j=1;j<team[teamIndex].length;j++) { //j=1
					index = (int)(Math.random()*25)+5;//할당30개 랜덤
					team[teamIndex][j] = member[index];//[0][1]에 3 할당
					oldMember[oldMemberIndex++] = member[index];//1에서 2가됨
					
					for(int a=0;a<oldMemberIndex-1;a++) {//oldmember은 1이다 ++로 후증감 됬으니까
						if(oldMember[a]==member[index]) {
							j--;
							oldMemberIndex --;
							break;
						}
					}
				}
				if(teamIndex<4) {//0,1,2,3,4 0은 이미 완료했고 0에서 1이되고 1들어오고 2들어오고 3들어오고 3이 들어왔을때 마지막으로 4가되고 끝
					
					teamIndex++;// 증감값의 위에 출력문이 있냐(3) 아래에 있냐에(4) 따라 teamindex 값이 다르다
					
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
			}
		}
		public static void TeamGeneraterOther0() {
			String team[][] = new String[5][5];
			String teammember[] = new String[]{"111","222","333","444","555","a","b","c","d","e","f","g","h","i","j","k","l","n","m","o","p","q","r","s","t"};
			
			int index = -1;
			
			for(int i=0;i<team.length;i++) {
				index = (int)(Math.random()*5);
				team[i][0] = teammember[index];
				
				for(int j=0;j<i;j++) {
					if(team[j][0]==teammember[index]) {
						i--;
						break;
					}
					
				}
				
			}
			
			
			String oldmember[] = new String[20];
			int teamindex = 0;
			int oldmemberindex = 0;
			index = -1;
			for(;;) {
			for(int i=1;i<team[teamindex].length;i++) {
				index = (int)(Math.random()*20)+5;
				team[teamindex][i] = teammember[index];
				oldmember[oldmemberindex++] = teammember[index];
				
				for(int a=0;a<oldmemberindex-1;a++) {
					if(team[teamindex][a]==teammember[index]) {
						i--;
						oldmemberindex--;
						break;
					}
				}
				
				
				
			
			}
			if(teamindex<4) {
				teamindex++;
				
			}
			else {
				break;
			}
			
			for(int i=0;i<team.length;i++) {
				System.out.println("팀장 :" +team[i][0]);
				System.out.print("팀원 :");
				for(int j=1;j<team[i].length;j++) {
					System.out.print((j==1) ? team[i][j] : ","+team[i][j]);
				}
				System.out.println();
			}
			}
		}
		public static void main(String[] args) {
	
			//TeamGeneraterOther0();
			TeamGenerater();
			
	}
}
