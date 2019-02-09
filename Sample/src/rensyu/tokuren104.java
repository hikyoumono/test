package rensyu;

import javax.swing.*;

public class tokuren104 extends JPanel {
	static int a = 10;

	public static void main(String[] args) {
		int st = test();
		System.out.println(a);

	}

	public static int test() {
		if (a > 1) {
			a = 100;
			return a;
		} else {
			return a;
		}
	}

}
