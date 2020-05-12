package Rental;

import java.util.ArrayList;

public class Rental {
	ArrayList<Item> list = new ArrayList<Item>();

	public void add(Item item) {
		this.list.add(item);

	}

	public void show() {
		for (Item item : list) {
			System.out.println(item);
		}
	}

	public int getGoukei() {
		int sum=0;
		for(Item item : list) {
			sum+=item.getPrice();
		}
		return sum;
		}
}
