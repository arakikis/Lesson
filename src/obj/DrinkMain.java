package obj;

import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {
//		Sake s = new Sake("ビール",500,0.05);
//		s.show();

		ArrayList<Drink> Dlist =new ArrayList<Drink>();

		Dlist.add(new Drink("コーラ",500));
		Dlist.add(new Drink("サイダー",350));
		Dlist.add(new Drink("コーヒー",200));
		Dlist.add(new Sake("ビール",500,0.05));

		int sum =0;
		for(Drink dr:Dlist) {
			dr.show();
			sum +=dr.getAmount();
		}
		System.out.println(sum + "ml");
	}

}
