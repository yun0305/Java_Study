package Chapter5;

public class StaticMethod {

	//�ν��Ͻ� ��� ����
	int memVar;
	//����ƽ ��� ����
	static int staticVar;
	//�ν��Ͻ� �޼ҵ�
	void memMethod1() {
		int local = memVar;// �ν��Ͻ� �޼ҵ� �ȿ����� �ν��Ͻ� ������ ����Ҽ��ִ�
		local = staticVar;// �ν��Ͻ� �޼ҵ� �ȿ��� ����ƽ ������ ����Ҽ� �ִ�
		staticMethod1();// �ν��Ͻ� �޼ҵ忡�� static �޼ҵ带 ������ �� �ִ�
		memMethod2();//���� Ŭ������ �ִ� �ν��Ͻ� �޼ҵ�� ����  "�ٷ�"ȣ���� �����ϴ�
		System.out.println("memMethod1");
	}
	void memMethod2() {
		
		System.out.println("memMthod2");
	}
	//����ƽ�żҵ�
	static void staticMethod1() {
		//int local = memVar;//����ƽ �żҵ� �ȿ����� �ν��Ͻ� ������ ���� �Ҽ� ����
		//memMethod();//����ƽ �żҵ忡���� �ν��Ͻ� �żҵ带 ȣ���Ҽ� ����
		StaticMethod st = new StaticMethod();//����ƽ �޼ҵ� �ȿ����� �ν��ϼ� �޼ҵ峪 ������ ����Ϸ��� ��ü�� �����ؼ� ��ü�� �����ؾ��Ѵ�
		int loacal = st.memVar;
		st.memMethod2();
		staticMethod2();// ����ƽ �޼ҵ� �ȿ��� �ٸ� ����ƽ �޼ҵ带 ȣ�� �Ҽ� �ִ�
		System.out.println("staticMthod1");
	}
	static void staticMethod2() {
		System.out.println("staticMthod2");
	}
	//���� �޼ҵ� (����ƽ)
	public static void main(String[] args) {//���� �޼ҵ嵵 ����ƽ �޼ҵ��
		
		//StaticMethod.memMethod1
		StaticMethod st = new StaticMethod();
		st.memMethod1();// ����ƽ �޼ҵ� �ȿ��� �ν��Ͻ� �޼ҵ带 ȣ���Ϸ��� ��ü�� �����ؾ� �Ѵ�
		StaticMethod.staticMethod2();// ����ƽ �޼ҵ�� Ŭ���� ������ ���� �����ؼ� ȣ���� �����ϴ�
		staticMethod2();//���� ����ƽ �޼ҵ� �ȿ����� �ٷ� ȣ�� �Ҽ� �ִ�
		int local = staticVar;//����ƽ �޼ҵ�� �ȿ����� ����ƽ ������ ���� �Ҽ��ִ�
		//local = memVar;//����ƽ �޼ҵ� �ȿ����� �ν��Ͻ� ������ �����Ҽ� ����

	}

}
