package obj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {
		Date d =new Date();                      //現在日時
		System.out.println(d);
		System.out.println(d.getTime());
		Date d2 = new Date(1588913326666L);
		System.out.println(d2);

		Calendar c = Calendar .getInstance();
		c.set(2010,2-1,10);
		Date d3 = c.getTime();
		System.out.println(d3);

		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日");

		c.set(2020,6-1,1);
		Date d4 = c.getTime();
		System.out.println(d4);

		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		String s = f.format(d4);
		System.out.println(s);

		SimpleDateFormat f2 = new SimpleDateFormat("HH時mm分ss秒");
		System.out.println(f2.format(d));


	}

}
