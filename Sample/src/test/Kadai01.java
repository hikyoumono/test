package test;

import java.util.Scanner;

public class Kadai01 {

	public static void main(String[] args) {
		// 課題1
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
		System.out.println("誕生日を4文字で入力");
		String tuki01 = sc.next();
		int CC = tuki01.charAt(0);
		int code3 = (int) CC;
		System.out.println("お相手さんの誕生日は？");
		String tuki02 = sc.next();
		int DD = tuki02.charAt(0);
		int code4 = (int)DD;
		int result2 = code3 + code4;
		if (result2 % 10 == 0) {
			System.out.println("ソウルメイトです");
		} else if (result2 % 10 > 0 && result2 % 10 <= 5) {
			System.out.println("相性抜群");
		} else if (result2 % 10 > 5 && result2 <= 9) {
			System.out.println("相性はいまいち");
		}
	}

}
