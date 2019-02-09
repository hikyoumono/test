package rensyu;

import java.util.Scanner;

public class tokuren32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("繰り返しの入力");
		
		
		//文字入力があったかどうか判断する
		while(sc.hasNext()){
			String test = sc.next();
			System.out.println("入力した文字は：" + test);
			
		}
		sc.close();

	}

}
