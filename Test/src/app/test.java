package app;

public class test implements TestInterface {	//인터페이스를 사용하기 위해 implements
	public static int GetInt() {
		return 1;
	}
	
	@Override
	public void SetString(String a) {
		System.out.println(a);
	}
}
