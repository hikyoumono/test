
public class sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "abc" + "xyz";
		System.out.println(str1);

		String str2 = "123";
		//Stringでobjectを作った＝の後は" "でくくっておく必要がある
		System.out.println(str1 + str2);

		String str3 = "A型 ";
				//血液型
		String str4 = "男性 ";
	            //性別
		String str5 = "畠山直也です。";
		        //名前
		String str6 = "出身は奈良県、";
		        //出身地
		String str7 = "趣味はプログラミングです！";
		        //趣味
		System.out.println(str3 + str4 + str5 + str6 + str7);

	}

}
