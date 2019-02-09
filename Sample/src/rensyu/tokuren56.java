package rensyu;

public class tokuren56 {

	public static void main(String[] args) {
		int i = ttt(3, 4);// 実引数
		System.out.println(i);
		
		/*
		 * System.out.println(x); System.out.println(y);
		 * System.out.println(sum);
		 */

		/*
		 * 上のx,y,sumのような別メソッドの数字は使うことができない。 
		 * このような、ブロックの中でのみ有効な数字をローカル変数と呼ぶ
		 * その範囲のことを変数のスコープと呼ぶ
		 */

	}

	static int ttt(int x, int y) {
		int sum = x + y;// 仮引数
		return sum;

	}

}
