package obj;

public class Seito {
	String name;
	int kokugo;
	int sansu;
	int syakai;

	public void show() {
		System.out.println(this.name+" "+ "国語"+this.kokugo+"点"
				+" "+ "算数"+this.sansu+"点"+" "+ "社会"+this.syakai+"点");
		System.out.println("合計 "+this.goukei()+"点" +" "+"平均"+ this.heikin()+"点");
	}
	 public int goukei() {
		return kokugo+sansu+syakai;
	}
	 public double heikin() {
		 return (goukei()/3);
	 }


}
