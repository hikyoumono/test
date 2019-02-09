package rensyu;

import java.util.Scanner;

public class tokuren34 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("数値入力");
		
		if(s1.hasNextInt()){
			int s2 = s1.nextInt();
			System.out.println(s2);
		}else{
			System.out.println("数値入力しろ");
		}
		s1.close();

	}

}
