package Chapter3;

public class ArgsTest {

	public static void main(String[] args) {
		
		aaa:for(char c='A';c<='C';c++) {
			 for(int x=1;x<=3;x++) {
				if(x==2) {
					continue;
				}
				if(c=='B') {//2��° ����뿡�� B���� �̺κ��� �ɸ��� ������ 2��° for���� �������ͼ� ù��° for������ ����
					continue aaa;
				}
				System.out.println("c = "+c+","+"x = "+x);
				
			}
		}
	}

}
