package obj;

public class Member {
	String name;
	String tell;

	public Member(String name, String tell) {
		this.name = name;
		this.tell = tell;
	}

//	public void show() {
//		System.out.println(this.name + " " + this.tell);
//	}

	@Override
	public String toString() {
		return  name + " " + tell;
	}
	

}
