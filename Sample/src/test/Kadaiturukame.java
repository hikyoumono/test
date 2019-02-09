package test;

public class Kadaiturukame {
	final static int turu = 2;
	final static int kame = 4;

	public static void main(String[] args) {
		int asinogoukei = 30;
		int turukamegoukei = 10;
		int kamesu;
		kamesu = (asinogoukei - turukamegoukei * turu) / (kame - turu);
		System.out.println("カメの合計は" + kamesu + "匹");

		int turusu;
		turusu = (asinogoukei - turukamegoukei * kame) / (turu - kame);
		System.out.println("鶴の合計は" + turusu + "匹");

	}

}
