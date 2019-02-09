package rensyu;

import java.util.Scanner;

public class tokuren35 {

	public static void main(String[] args) {
		
		int oka;
		Scanner nehosi = new Scanner(System.in);
		System.out.println("数値入力");
		
	while(true){
			if(nehosi.hasNextInt()){
				oka = nehosi.nextInt();
				break;
			}else {
				System.out.println("す　う　ち　を　に　ゅ　う　り　ょ　く");
				nehosi.next();
			}
		}
		System.out.println("入力したのは" + oka);
		nehosi.close();
	}


}