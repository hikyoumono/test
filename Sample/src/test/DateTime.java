//LocalDateTime   時差を扱わないなら
//OffsetDateTime  時差を扱うなら
//ZomedDateTime   時差に加えて、地域ごとの日時を考慮する

package test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class DateTime {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//時差なしの日時
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		

	}

}
