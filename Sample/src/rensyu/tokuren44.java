package rensyu;

public class tokuren44 {

	public static void main(String[] args) {

		int m, n;
		m = 10;
		n = 30;
		int result = m + n;
		// 上のmやnのように演算子に影響を与える値をオペランドと呼ぶ

		System.out.println(result);
		
		int a;
		System.out.println(a = 50);
		System.out.println(a);
		
		long abc = 100000000;//intだと仮にresult2がlongでもオーバーフローしてしまう
		long xyz = 100000000;
		
		long result2 = abc * xyz;
		System.out.println(result2);
		System.out.println();
		
		String str1 = "今日の天気は";
		String str2 = "晴れ";
		
		System.out.println("今日の天気は" + "晴れ");
		System.out.println(str1 + str2);
		System.out.println();
		
		String str3 = "50";
		System.out.println(1 + str3);
	}

}
