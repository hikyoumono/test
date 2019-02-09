package test;

import java.util.Calendar;
import java.util.Date;

public class DateSample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date date = new Date();
				System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.WEEK_OF_MONTH,1);
		Date nextWeek = cal.getTime();
		System.out.println(nextWeek);

	}

}
