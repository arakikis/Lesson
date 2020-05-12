package Sukkiri;

public class Sword {
	private String name;
	private int damage;

	public Sword(String n,int d) {
		this.name = n;
		this.damage = d;
	}
	public String getName() {
		return this.name;
	}
	public int getDamage() {
		return this.damage;
	}
}
