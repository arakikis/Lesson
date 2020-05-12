package member;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		MemberDAO mdao = new MemberDAO();

		//midとnameを全表示
		ArrayList<Member> mlist = mdao.findAll();
		for (Member m : mlist) {
			System.out.println(m.getMid()+" "+m.getName());

		}
		//mid入力でadr表示
		System.out.println("どの住所を見たいですか？");
		int mid = new java.util.Scanner(System.in).nextInt();

		Member m1 = mdao.findByMid(mid);
		System.out.println(m1.getAdr());

	}
}
