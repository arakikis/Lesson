package obj;

public class EventMain {

	public static void main(String[] args) {
		Event e =new Event("春の人狼大会");
		e.add(new Sankasya("田中",30));
		e.add(new Sankasya("山田",25));
		e.add(new Sankasya("山本",35));
		e.show();
	}

}
