package Rental;

public abstract class Item {
	private String name;
	private int days;

	public String getName() {
		return name;
	}


	public int getDays() {
		return days;
	}


	public Item(String name, int days) {
		this.name = name;
		this.days = days;
	}


	public abstract int getPrice();


	@Override
	public String toString() {
		return name+" "+days+"日"+this.getPrice()+"円";
	}


}
