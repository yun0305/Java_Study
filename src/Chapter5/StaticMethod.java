package Chapter5;

public class StaticMethod {

	//�ν��Ͻ� ��� ����
	int memVar;
	//����ƽ ��� ����
	static int staticVar;
	//�ν��Ͻ� �޼ҵ�
	void memMethod1() {// ��ü�� �ҷ��͵� �޼ҵ�ȿ� �ִ� ������ ����Ҽ�����
		int local = memVar;
		local = staticVar;
		staticMethod1();
		memMethod2();
		System.out.println("memMethod1");
	}
	void memMethod2() {
		
		System.out.println("memMthod2");
	}
	//����ƽ�żҵ�
	static void staticMethod1() {
		//int local = memVar;
		//memMethod()
		StaticMethod st = new StaticMethod();
		int loacal = st.memVar;
		st.memMethod2();
		staticMethod2();
		System.out.println("staticMthod1");
	}
	static void staticMethod2() {
		System.out.println("staticMthod2");
	}
	//���� �޼ҵ� (����ƽ)
	public static void main(String[] args) {
		
		//StaticMethod.memMethod1
		StaticMethod st = new StaticMethod();
		st.memMethod1();
		StaticMethod.staticMethod2();
		staticMethod2();
		int local = staticVar;
		//local = memVar;

	}

}
