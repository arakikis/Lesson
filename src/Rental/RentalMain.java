package Rental;

public class RentalMain {

	public static void main(String[] args) {
		Rental r = new Rental();
		r.add(new Book("ワンピース",7));
		r.add(new CD("パプリカ",3));
		r.add(new CD("Lemon",2));

		r.show();
		System.out.println(r.getGoukei()+"円");
	}

}
