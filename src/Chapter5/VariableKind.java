package Chapter5;

public class VariableKind {

	//�ν��Ͻ� ����
	int memVar;// ��ü�� �����ؾ� ��밡�� //��ü�� �����Ҷ����� �ʱ�ȭ��
	
	// static ��� ����
	static int staticVar;
	
	
	public static void main(String[] args) {
		//���ú���
		int localVal;
		
		VariableKind vk1 = new VariableKind();//�ν��Ͻ� ��� ������ static �޼ҵ� �ȿ��� ����Ϸ��� ��ü�� �����ؾ� �Ѵ� �ν��Ͻ� ��� ������ ��ü�� �����Ҷ� �ʱ�ȭ �Ǳ� �����̴�
		System.out.println(" �ν��Ͻ� ���� ȣ��:vk1.memVar = " + vk1.memVar);
		
		System.out.println("static ����  ȣ��:vk1.staticvar = "+vk1.staticVar);
		
		System.out.println("Ŭ���� �����Ͽ� static���� ȣ��:VariableKind.staticvar = "+ VariableKind.staticVar);//static��� ������ Ŭ������ �ε��Ҷ� �ٷ� �ʱ�ȭ �ǹǷ� Ŭ���� �̸����� ������ �� �ִ� �ٸ� Ŭ�������� �����Ҷ��� Ŭ���� �̸������� ���� �Ҽ� �ִ�
		
		System.out.println("Staticvar = "+staticVar);//������ ������ static �޼ҵ忡���� static ������ �̸������� �ٷ� �����Ҽ� �մ� �Ѵ� Ŭ������ �ε��� �� �ٷ� �ν� �Ǳ� �����̴� 
		
		VariableKind vk2 = new VariableKind();
		vk2.memVar = 100;
		vk1.staticVar = 20;
		
		System.out.println("vk1.memVar = "+vk1.memVar);
		
		System.out.println("vk2.memVar = "+vk2.memVar);
		
		System.out.println("vk1.staticVar = "+ vk1.staticVar);//���� ��� ��ü���� �����ȴ�
		
		System.out.println("vk2.staticVar = "+vk2.staticVar);
		//System.out.println("localVar = "+ localVar);
		
		
		
		

	}

}
