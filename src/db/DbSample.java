package db;

import java.util.ArrayList;

public class DbSample {

	public static void main(String[] args) {
		ShouhinDAO dao = new ShouhinDAO();

		//すべて検索
		ArrayList<Shouhin> slist = dao.findAll();
		for (Shouhin s : slist) {
			System.out.println(s.getSname());

			//1つだけ検索
			Shouhin s1 = dao.findBySid(1);
			System.out.println(s.getSname());

			//追加
			//Shouhin s2 = new Shouhin(0,"バナナ",110);
			//dao.insert(s2);

			//変更
			Shouhin s3 = new Shouhin(4, "メロン", 600);
			dao.update(s3);

			//削除
			dao.delete(9);

			UriageDAO udao = new UriageDAO();

			//すべて検索
			ArrayList<Uriage> ulist = udao.findAll();
			for (Uriage u : ulist) {
				System.out.println(u.getUid());

				//sidで検索
				Uriage u1 = udao.findByUid(1);
				System.out.println(u1.getSid());

				//追加
				Uriage u2 = new Uriage(0, 1, 2, null);
				udao.insert(u2);

				//変更
//				Calendar c = Calendar.getInstance();
//				c.set(2020,4,1);
//				Date hi = new Date(c.getTimeInMillis());
//				Uriage u3 = new Uriage(5, 3, 2, hi);
//				udao.update(u3);

				//削除
				udao.delete(7);
				//				Shouhin s = new Shouhin(0,"バナナ",110);
				//				dao.update(s);
				//				dao.insert(s);
				//				Shouhin s = dao.findBySid(3);
				//				System.out.println(s.getName());
				//
				//				}
				//				dao.dalete(9);

				//			UriageDAO dao = new UriageDAO();
				//
				//			ArrayList<Uriage> list = dao.findAll();
				//			System.out.println("sid 個数    日付");
				//			for (Uriage u : list) {
				//				System.out.println(" " + u.getSid() + "    " + u.getKosu() + "   " + u.getHi());
				//			}
				//
				//			System.out.println();
				//
				//			Uriage u = dao.findByUid(3);
				//			System.out.println("sid[" + u.getSid() + "]は" + u.getHi() + "に" + u.getKosu() + "個売れました。");
				//
				//			Date d = new Date(2020, 5, 11);
				//			Uriage u2 = new Uriage(6, 2, 7, d);
				//			dao.insert(u2);
			}
		}
	}
}