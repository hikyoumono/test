package rensyu;

import java.util.Date;//日付を保持したツール　保持だけなのでnewでOK
import java.util.Calendar;//日付操作ツール　操作なのでgetterが必要

public class tokuren19 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		
		//日付操作
		Calendar ca = Calendar.getInstance();
		ca.add(Calendar.WEEK_OF_MONTH,1);//addで追加
		
		//このパターンの組み込み方覚える
		Date next = ca.getTime();//Dateにcalendarで操作したやつ追加
		System.out.println(next);

	}

}
