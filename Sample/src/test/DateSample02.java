package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//日時を指定の書式で出力
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH,1);
		
		Date month = cal.getTime();
		System.out.println(month);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sdf.format(month);
		System.out.println(str);
		

	}

}
