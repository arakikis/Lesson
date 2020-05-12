package obj;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member("荒木","01234567891");
		System.out.println(m);
		//m.show();


		NetMember nm = new NetMember("荒木", "01234567891","abcdefg@hijk.co.jp");
		System.out.println(nm);
		
		//nm.show();
//		En e = new En(10);
//		//e.hankei=10;
//		//e.menseki();
//		e.menseki();
	}



}
