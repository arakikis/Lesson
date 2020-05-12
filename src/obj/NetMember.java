package obj;

public class NetMember extends Member {
	String mail;

	public NetMember(String name, String tell, String mail) {
		super(name, tell);
		this.mail = mail;
	}

	public void show() {
		System.out.println(super.name + " " + super.tell + " " + this.mail);
	}

	@Override
	public String toString() {
		return this.name+" "+this.tell+" " + this.mail;
	}


}
