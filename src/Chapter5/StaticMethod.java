package Chapter5;

public class StaticMethod {

	//인스턴스 멤버 변수
	int memVar;
	//스택틱 멤버 변수
	static int staticVar;
	//인스턴스 메소드
	void memMethod1() {// 객체로 불러와도 메소드안에 있는 변수는 사용할수없다
		int local = memVar;
		local = staticVar;
		staticMethod1();
		memMethod2();
		System.out.println("memMethod1");
	}
	void memMethod2() {
		
		System.out.println("memMthod2");
	}
	//스태틱매소드
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
	//메인 메소드 (스태틱)
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
