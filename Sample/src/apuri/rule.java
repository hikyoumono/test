package apuri;

import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.Color;

public class rule {
	static int mysu = 13; // カードの最大枚数
	static int cardnumber = 13; // カードの最強数字
	static ArrayList mycard = new ArrayList();
	static ArrayList cpucard = new ArrayList();
	static int myselect; // プレイヤー出したカード
	static int cpuselect; // CPU出したカード
	static int mylist = 0; // プレイヤーの最終カード
	static int cpulist = 0; // CPUの最終カード
	static boolean mypass = false;
	static boolean cpupass = false;
	static String yomikomi;

	public static void manage() {
		Random ran = new Random();
		for (int i = 0; i < mysu; i++) {
			mycard.add(ran.nextInt(cardnumber) + 1);
			cpucard.add(ran.nextInt(cardnumber) + 1);
		}

	}

	// プレイヤー手持ち表示ラベル;
	// CPU手持ち表示ラベル;
	public static void select() throws IOException {
		game gg = new game();
		game.hyouzi(Color.YELLOW, Color.RED, "スタート！", 300, gg.jpg);
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		// 手持ちカード表示ラベル
		try {
			while (cpupass == false) {

				yomikomi = buf.readLine();
				if (yomikomi.equals("P") || yomikomi.equals("p")) {

					// 最後に出したカードを0
					mylist = 0;
					break;
				} else {
					// int型に変換
					myselect = Integer.parseInt(yomikomi);

					if (myselect < 1) {
						// 1以下の数字を出した件

					} else if (myselect > mycard.size()) {
						// カードの数より大きい数字を出したとき

					} else {

						if ((int) mycard.get(myselect - 1) <= cpulist) {
							// 場に出ているカードと同じか小さい数字を選択した場合の処理
						} else {
							mylist =(int) mycard.get(myselect - 1);
							// 選択したカード表示ラベル

							// 選択されたカードは変数の中身をからにする
							mycard.remove(myselect - 1);

							// 正常な入力をされた場合はtrueを渡してループから抜け出す
							mypass = true;
						}

					}
				}
			}
			// ループから抜けた後に初期化
			mypass = false;

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		// 勝敗メソッド
		judge(name.namelist);

	}

	public static void cpuselect() {
		game gg = new game();
		game.hyouzi(Color.YELLOW, Color.RED, "あなたのターンです", 100, gg.jpg);

		for (int i = 0; i < cpucard.size(); i++) {
			// 場のカードと持ち札比較

			if (i < (int) cpucard.get(i)) {
				// 場のカードより強いカードを持っていた時の処理(cpucardの内、(i)ターンの.getの一枚
				// 選択したカード表示メソッド

				// 場に出たカード代入
				cpulist = (int) cpucard.get(i);

				// 選択されたカードを除いていく
				cpucard.remove(i);

				// パス
				cpupass = false;

				break;

			} else {
				cpupass = true;

				// 最後に出したカードを0
				cpulist = 0;

			}
		}
		// trueを渡された場合はpass
		if (cpupass == true) {
			game.hyouzi(Color.CYAN, Color.BLUE, "パス", 300, gg.jpg);

			cpupass = false;
			// 初期化
		} else {

		}
		judge("CPU");
	}

	// 勝敗判定メソッド作成
	public static void judge(String str) {
		game gg = new game();
		// プレイヤーかCPUの手持ちカードが0枚になった場合の処理
		if (mycard.size() == 0 || cpucard.size() == 0) {
			game.hyouzi(null, Color.YELLOW, "終了ー！！" + str + "の勝ち", 150, gg.jpg);
			// strの勝ちメソッド

			rule.manage();
			// 再戦するためのメソッド
		}
	}

}
