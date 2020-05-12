package obj;

public class Chugakusei extends Seito {
	int eigo;

	public Chugakusei(String name, int kokugo, int sansu, int syakai, int eigo) {
		super(name, kokugo, sansu, syakai);
		this.eigo = eigo;
	}
	public void show() {
		System.out.println(super.getName()+" "+ "国語"+super.getKokugo()+"点"
				+" "+ "算数"+super.getSansu()+"点"+" "+ "社会"+super.getSyakai()+"点"+" "+ "英語"+this.eigo+"点");
		System.out.println("合計 "+this.goukei()+"点" +" "+"平均"+ this.heikin()+"点");
	}

	public int goukei() {
		return super.goukei() + this.eigo;
	}
}
