package rensyu;

import java.util.Arrays;

public class tokuren70 {

	public static void main(String[] args) {
		String[][] array = { { "a", "b", "c" } };
		for (String[] abc : array) {
			System.out.println(Arrays.toString(abc));
		}
		for (Object obj : array) {
			System.out.println(obj);
		}
		int num = 10;
		do {
			num++;
		} while (++num < 10);
		System.out.println(num);
		System.out.println(num);
		System.out.println();

		num = 10;
		while (num++ <= 15) {
			num++;
			System.out.println(num);
		}
		System.out.println(num);

	}

}
