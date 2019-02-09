package test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class InstantSample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date date = new Date();
		Instant ins = date.toInstant();
		LocalDateTime ldt01 = LocalDateTime.ofInstant(ins,
				ZoneOffset.ofHours(9));
		System.out.println(ldt01);
		
		LocalDateTime ldt02 = LocalDateTime.now();
				Instant ins2 = ldt02.toInstant(ZoneOffset.ofHours(9));
				Date date2 = Date.from(ins2);
				System.out.println(date2);
		

	}

}
