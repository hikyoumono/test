package test;

import java.util.Random;

//クラス名とインポートしてくるクラス名一緒にしない
public class KadaiRan {

	public static void main(String[] args) {
		// 課題1
		Random rdm = new Random();

		int ran = rdm.nextInt(101);
		System.out.println(ran);
		System.out.println();

		// 課題2
		int ran2 = (int) (Math.random() * 6 + 1);
		// cast doubleをint型に変える

		System.out.println(ran2);
		System.out.println();

		// 課題3
		for (int i = 0; i <= 9; i++) {
			int ran3 = (int) (Math.random() * 10 + 1);

			System.out.println(ran3);
		}
		System.out.println();
		// 課題4
		int sum = 0;
		for (int i = 0; i <= 9; i++) {
			int ran4 = (int) (Math.random() * 6 + 1);
			sum += ran4;
			System.out.println(ran4);
		}
		System.out.println(sum);

	}
}
