package test;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class DateTimeTest01 {

	public static void main(String[] args) {
		LocalDateTime ldt =LocalDateTime.now();
		System.out.println(ldt);

		OffsetDateTime off = OffsetDateTime.now();
		System.out.println(off);

		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone);

	}

}
