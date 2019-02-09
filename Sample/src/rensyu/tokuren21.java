package rensyu;

import java.time.Instant;//時刻APIどんなパソコンからでも表示できるようにするツール
import java.time.LocalDateTime;
import java.time.ZoneOffset;//(ZoneOffset.ofHours)のところ
import java.util.Date;

public class tokuren21 {

	public static void main(String[] args) {

		Date time = new Date();
		Instant ins = time.toInstant();//timeをtoInstantさせる

		//ここ
		LocalDateTime time2 = LocalDateTime.ofInstant(ins,ZoneOffset.ofHours(9));
		System.out.println(time2);

		//ここを比較
		LocalDateTime time3 = LocalDateTime.now();
		Instant ins2 = time3.toInstant(ZoneOffset.ofHours(9));
		Date time4 = Date.from(ins2);
		System.out.println(time4);

	}

}
