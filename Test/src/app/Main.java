package app;

public class Main extends test{
	
	//오버라이드
	public static int GetInt() {
		return 2;
	}
	//오버로드
	public static int GetInt(int a) {
		return a;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello world! 안녕!");
		
		Bean b = new Bean();
		b.setName("구디");
		b.setAge(55);
		b.setCheck(true);
		
		System.out.println(b.getName());
		System.out.println(b.getAge());
		System.out.println(b.isCheck());
		
		System.out.println(b);	//자바 heap메모리에 저장된 주소값 ( 객체 정보 )
		System.out.println(b.toString());
		
		System.out.println(GetInt());	//오버라이드 결과
		System.out.println(GetInt(3));	//오버로드 결과
		
		//부모에 잇는것을 메인에서 사용하고 싶을떄는 생성자로 사용해야한다.
		test t = new test();
		t.SetString("안녕!");
	}
}

