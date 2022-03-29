package Chapter5;

public class StaticMethod {

	//인스턴스 멤버 변수
	int memVar;
	//스택틱 멤버 변수
	static int staticVar;
	//인스턴스 메소드
	void memMetho1() {
		int local = memVar;
		local = staticVar;
	}
	
	
	public static void main(String[] args) {
	
		

	}

}
