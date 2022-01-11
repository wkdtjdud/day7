package test.final1;

//final 클래스는 자식클래스가 없다. (다른 클래스가 상속을 받을 수 없다.)
public class Child extends Parent{
	//final 필드는 나중에 값 변경 금지(final 필드 값 변경 금지)
	public int time = 3;
	
	@Override
	public void rest() {
		//time = 5;
		System.out.println(time+" 시간 휴식한다.");
		
	}

}
