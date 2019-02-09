package test;

import java.util.Scanner;

public class KadaiUranaiTest {

	public static void main(String[] args) {
		// 課題1
		System.out.println("10段階で相性を表示するよ♪");
		System.out.println("数が小さいほど相性がよく0が一番相性がいいです");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("１人目のお名前は？");
		String num = sc.next();

		int AA = num.charAt(0);
		int code1 = (int) AA;

		System.out.println("２人目のお名前は？");
		String ait = sc.next();
		int BB = ait.charAt(0);
		int code2 = (int) BB;

		int result = (code1 + code2)%10;

		System.out.println("二人の相性は10段階で" + result + "です");

		System.out.println();

		// 課題2
		System.out.println("血液型を入力");
		String tuki01 = sc.next();
		int CC = tuki01.charAt(0);
		System.out.println("お相手さんの血液型は？");
		String tuki02 = sc.next();
		int DD = tuki02.charAt(0);
		int result2 = CC +DD;
		if (result2 % 10 == 0) {
			System.out.println("ソウルメイトです");
		} else if (result2 % 10 > 0 && result2 % 10 <= 5) {
			System.out.println("相性抜群");
		} else if (result2 % 10 > 5 && result2 <= 9) {
			System.out.println("相性はいまいち");
		}
		sc.close();
	}

}
