package obj;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event  {
	String name;
	Date hi=new Date();
	List<Sankasya> slist = new ArrayList<>();

	public Event(String name) {
		this.name = name;
		Date d =new Date();
	}
	public void add(Sankasya s) {
		this.slist.add(s);
	}
	public void show() {
		System.out.println(this.name);
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		String s = f.format(hi);
		System.out.println(s);

		for(Sankasya sa: slist) {
			System.out.println(sa.getName()+" "+sa.getAge()+"歳");
		}

	}





	}
