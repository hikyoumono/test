package test;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.DayOfWeek;

//import java.time.Instant;インスタント意味調べる

public class Heizitu {

	public static void main(String[] args) {
		Date today = new Date();
		Calendar time = Calendar.getInstance();
		time.setTime(today);
		int week = time.get(Calendar.DAY_OF_WEEK);
		// int必要

		if (week == Calendar.SATURDAY || week == Calendar.SUNDAY) {
			System.out.println("今日はお休みです");
		} else {
			System.out.println("お仕事頑張りましょう");
		}
		// Date-TimeAPI
		LocalDateTime ldt = LocalDateTime.now();
		DayOfWeek week2 = ldt.getDayOfWeek();

		if (week2 == DayOfWeek.SATURDAY || week2 == DayOfWeek.SUNDAY) {
			System.out.println("今日はおやすみです");
		} else {
			System.out.println("お仕事頑張りましょう");
		}

	}
}