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
			System.out.println("���� :" +team[i][0]);
			System.out.println("���� :");
			for(int j=1;j<team[i].length;j++) {
				System.out.println((j==1) ? team[i][j] : ","+team[i][j]);
			}
			System.out.println();
		}
 */
		public static void main(String[] args) {
	
		String member[] = new String[] {"����1","����2","����3","����4","����5","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19"
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
		
		String oldMember[] = new String[25];
		index = -1;
		int teamIndex = 0;//67�� for���� ������ 
		int oldMemberIndex = 0;
		
		for(;;) {
			
			for(int j=1;j<team[teamIndex].length;j++) {
				index = (int)(Math.random()*25)+5;
				team[teamIndex][j] = member[index];
				oldMember[oldMemberIndex++] = member[index];
				
				for(int a=0;a<oldMemberIndex -1;a++) {//oldmember�� 1�̴� ++�� ������ �����ϱ�
					if(oldMember[a]==member[index]) {
						j--;
						oldMemberIndex --;
						break;
					}
				}
			}
			if(teamIndex<4) {//0,1,2,3,4 0�� �̹� �Ϸ��߰� 0���� 1�̵ǰ� 1������ 2������ 3������ 3�� �������� ���������� 4���ǰ� ��
				
				teamIndex++;// �������� ���� ��¹��� �ֳ�(3) �Ʒ��� �ֳĿ�(4) ���� teamindex ���� �ٸ���
				System.out.println(teamIndex);
			}
			else {
				break;
			}
		}
		for(int i=0;i<team.length;i++) {
			System.out.println("���� :" +team[i][0]);
			System.out.print("���� :");
			for(int j=1;j<team[i].length;j++) {
				System.out.print((j==1) ? team[i][j] : ","+team[i][j]);
			}
			System.out.println();
		}
			
	}
}
