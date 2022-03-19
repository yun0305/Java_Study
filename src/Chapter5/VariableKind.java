package Chapter5;

public class VariableKind {

	//인스턴스 변수
	int memVar;// 객체를 생성해야 사용가능 //객체를 생성할때마다 초기화됨
	
	// static 멤버 변수
	static int staticVar;
	
	
	public static void main(String[] args) {
		//로컬변수
		int localVal;
		
		VariableKind vk1 = new VariableKind();//인스턴스 멤버 변수를 static 메소드 안에서 사용하려면 객체를 생성해야 한다 인스턴스 멤버 변수는 객체를 생성할때 초기화 되기 때문이다
		System.out.println(" 인스턴스 변수 호출:vk1.memVar = " + vk1.memVar);
		
		System.out.println("static 변수  호출:vk1.staticvar = "+vk1.staticVar);
		
		System.out.println("클래스 접근하여 static변수 호출:VariableKind.staticvar = "+ VariableKind.staticVar);//static멤버 변수는 클래스를 로딩할때 바로 초기화 되므로 클래스 이름으로 접근할 수 있다 다른 클래스에서 접근할때도 클래스 이름만으로 접근 할수 있다
		
		System.out.println("Staticvar = "+staticVar);//동일한 레벨인 static 메소드에서는 static 변수를 이름만으로 바로 접근할수 잇다 둘다 클래스를 로딩할 때 바로 인식 되기 때문이다 
		
		VariableKind vk2 = new VariableKind();
		vk2.memVar = 100;
		vk1.staticVar = 20;
		
		System.out.println("vk1.memVar = "+vk1.memVar);
		
		System.out.println("vk2.memVar = "+vk2.memVar);
		
		System.out.println("vk1.staticVar = "+ vk1.staticVar);//값을 모든 객체마다 공유된다
		
		System.out.println("vk2.staticVar = "+vk2.staticVar);
		//System.out.println("localVar = "+ localVar);
		
		
		
		

	}

}
