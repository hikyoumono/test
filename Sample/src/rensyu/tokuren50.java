package rensyu;

import java.util.Random;

public class tokuren50 {

	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(11);
		System.out.println("i = " + i);

		if (i < 2) {
			System.out.println("iは2より小さい");
		} else if (i > 2 && i < 5) {
			System.out.println("iは2より大きい");
		} else {
			System.out.println("iは5より大きい");
		}if(i == 6|| i == 7){
			System.out.println("しかも6か7");

		}
	}

}
