package test.final1;

//final Ŭ������ �ڽ�Ŭ������ ����. (�ٸ� Ŭ������ ����� ���� �� ����.)
public class Child extends Parent{
	//final �ʵ�� ���߿� �� ���� ����(final �ʵ� �� ���� ����)
	public int time = 3;
	
	@Override
	public void rest() {
		//time = 5;
		System.out.println(time+" �ð� �޽��Ѵ�.");
		
	}

}
