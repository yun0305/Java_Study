package Chapter5;

public class StaticMethod {

	//�ν��Ͻ� ��� ����
	int memVar;
	//����ƽ ��� ����
	static int staticVar;
	//�ν��Ͻ� �޼ҵ�
	void memMetho1() {
		int local = memVar;
		local = staticVar;
	}
	
	
	public static void main(String[] args) {
	
		

	}

}
