package obj;

public class Sake extends Drink {
	private double alc;

	public Sake(String name, int amount, double alc) {
		super(name, amount);
		this.alc = alc;
	}

	public void show() {
		super.show();
		System.out.println("アルコール"+ this.alc);
	}



}
