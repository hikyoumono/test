package rensyu;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;//これも日時を保持するツールなのでnew

public class tokuren20 {

	public static void main(String[] args) {
		
		Calendar time = Calendar.getInstance();
		time.set(Calendar.DAY_OF_MONTH,1);
		//setで昔に
		//addで未来に
		
		//このパターンの組み込み方覚える
		Date month = time.getTime();
		System.out.println(month);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String time2 = sdf.format(month);
		System.out.println(month);

	}

}
