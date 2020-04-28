package obj;

import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {

		ArrayList<Drink> Dlist =new ArrayList<Drink>();

		Dlist.add(new Drink("コーラ",500));
		Dlist.add(new Drink("サイダー",350));
		Dlist.add(new Drink("コーヒー",200));

		int sum =0;
		for(Drink dr:Dlist) {
			dr.show();
			sum +=dr.amount;
		}
		System.out.println(sum + "ml");
	}

}
