package rensyu;

public class tokuren47 {

	public static void main(String[] args) {

		// 同じ型の変数を連続して並べたものを配列と呼ぶ
		// 配列内の変数を要素
		// 要素へはインデックスと呼ばれる番号でアクセスします
		int[] array = new int[4];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println();

		String[] array2 = new String[3];
		array2[0] = "A";
		array2[1] = "B";
		array2[2] = "C";

		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array[3] + array2[1]);
		System.out.println();

		//多次元配列
		int[][] tazigen = new int[2][];
		tazigen[0] = new int[3];
		tazigen[1] = new int[3];
		tazigen[0][0] = 10;
		tazigen[0][1] = 20;
		tazigen[0][2] = 30;
		tazigen[1][0] = 40;
		tazigen[1][1] = 50;
		tazigen[1][2] = 60;

		System.out.println(tazigen[0][0]);
		System.out.println(tazigen[0][2]);
		System.out.println(tazigen[1][0]);
		System.out.println();

		//多次元配列省略型
		int[][] tazigensyouryaku = {{10,20,30,},{40,50,60}};
		System.out.println(tazigensyouryaku[0][0] + "一個目");
		System.out.println(tazigensyouryaku[0][1] + "二個目");
		System.out.println(tazigensyouryaku[0][2]);
		System.out.println(tazigensyouryaku[1][0]);
		System.out.println(tazigensyouryaku[1][1]);
		System.out.println(tazigensyouryaku[1][2]);
	}

}
