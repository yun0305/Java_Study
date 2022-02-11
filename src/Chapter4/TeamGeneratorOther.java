package Chapter4;

public class TeamGeneratorOther {

	public static void main(String[] args) {
		String team[][] = new String[5][6];
		String player[] = new String[] {"111","222","333","444","555","a","b","c","d","e","f","g","h","i","j",
												"k","l","n","m","o","p","q","r","s","t","t","u","v","w","x","y"};
		
		for(int i=0;i<5;i++) {
			int leaderIndex = (int)(Math.random()*5);
			if(player[leaderIndex] == null) {
				i--;
				continue;
			}
			else {
				team[i][0] = player[leaderIndex];
				player[leaderIndex] = null; 
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<6;j++) {// j=1���� 1�� ������ 1�� ������ �� �����ϱ�
				int memberIndex = (int)(Math.random()*25)+5;
				if(player[memberIndex] == null) {
					j--;
					continue;
				}
				else {
					team[i][j] = player[memberIndex];
					player[memberIndex] = null;
				}
				
			}
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("���� : "+team[i][0]);
			System.out.print("���� : ");
			for(int j=1;j<5;j++) {
				System.out.print(team[i][j] +" ");
			}
			System.out.println();
		}
	
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

