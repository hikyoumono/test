package rensyu;
import java.util.Calendar;
import java.util.Date;
public class Calendar1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.WEEK_OF_MONTH,1);

	}

}
