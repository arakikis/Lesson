package db;

import java.util.ArrayList;

public class UriageCheck {

	public static void main(String[] args) {
		System.out.println("どの売り上げを見たいですか？");
		int uri =new java.util.Scanner(System.in).nextInt();
		UriageDAO udao = new UriageDAO();

		ArrayList<Uriage> ulist = udao.findBySid(uri);
		for(Uriage u :ulist) {
			System.out.println(u.getHi()+" "+ u.getKosu()+"個");
		}

	}

}
