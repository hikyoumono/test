package test;

import java.util.Calendar;

public class Kadai02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		

		if(hour >=0  && hour < 7){
			System.out.println(hour + "時、睡眠中");
		}else if(hour >=7 && hour <12){
			System.out.println(hour + "時、学校で授業");
		}else if(hour >=12 && hour<14){
			System.out.println(hour + "時、ごはん");
		}else if(hour>=14 && hour<17){
			System.out.println(hour + "時、学校で授業");
		}else if(hour >=17 && hour < 20){
			System.out.println(hour + "時、おでかけ");
		}else if(hour >=20 && hour< 21){
			System.out.println(hour + "時、晩御飯");
		}else if(hour >= 21 && hour < 23){
			System.out.println(hour + "時、課題と予習");
		}
		
		

	}

}
