package app;
//member 객체 만들어서 사용하는 것을 JAVABEAN
public class Bean {
	String name;
	int age;
	boolean check;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	@Override	//상속받은것이 아니다.
	public String toString() {
		return "Bean [name=" + name + ", age=" + age + ", check=" + check + "]";
	}
}
