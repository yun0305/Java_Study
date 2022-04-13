package Chapter5;

public class StaticMethod {

	//인스턴스 멤버 변수
	int memVar;
	//스택틱 멤버 변수
	static int staticVar;
	//인스턴스 메소드
	void memMethod1() {
		int local = memVar;// 인스턴스 메소드 안에서는 인스턴스 변수를 사용할수있다
		local = staticVar;// 인스턴스 메소드 안에서 스태틱 변수를 사용할수 있다
		staticMethod1();// 인스턴스 메소드에서 static 메소드를 참조할 수 있다
		memMethod2();//같은 클래스에 있는 인스턴스 메소드는 서로  "바로"호출이 가능하다
		System.out.println("memMethod1");
	}
	void memMethod2() {
		
		System.out.println("memMthod2");
	}
	//스태틱매소드
	static void staticMethod1() {
		//int local = memVar;//스태틱 매소드 안에서는 인스턴스 변수를 참조 할수 없다
		//memMethod();//스태틱 매소드에서는 인스턴스 매소드를 호출할수 없다
		StaticMethod st = new StaticMethod();//스택틱 메소드 안에서는 인스턴수 메소드나 변수를 사용하려면 객체를 생성해서 객체로 접근해야한다
		int loacal = st.memVar;
		st.memMethod2();
		staticMethod2();// 스태틱 메소드 안에서 다른 스태틱 메소드를 호출 할수 있다
		System.out.println("staticMthod1");
	}
	static void staticMethod2() {
		System.out.println("staticMthod2");
	}
	//메인 메소드 (스태틱)
	public static void main(String[] args) {//메인 메소드도 스태틱 메소드다
		
		//StaticMethod.memMethod1
		StaticMethod st = new StaticMethod();
		st.memMethod1();// 스태틱 메소드 안에서 인스턴스 메소드를 호출하려면 객체를 생성해야 한다
		StaticMethod.staticMethod2();// 스태틱 메소드는 클래스 명으로 직접 접근해서 호출이 가능하다
		staticMethod2();//같은 스태틱 메소드 안에서는 바로 호출 할수 있다
		int local = staticVar;//스태틱 메소드는 안에서는 스태틱 변수를 참조 할수있다
		//local = memVar;//스태틱 메소드 안에서는 인스턴스 변수를 참조할수 없다

	}

}
