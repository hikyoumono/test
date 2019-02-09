package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class KadaiHizuke {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date today = cal.getTime();
		String today2 = sdf.format(today);
		System.out.println(today2);
		cal.add(Calendar.DAY_OF_MONTH, 100);
		Date month = cal.getTime();
		String keisiki = sdf.format(month);
		
		System.out.println(keisiki);

		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt2 = ldt.plusDays(100);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

		System.out.println(dtf.format(ldt));
		System.out.println(dtf.format(ldt2));

	}

}
