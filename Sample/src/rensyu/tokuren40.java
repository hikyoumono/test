package rensyu;

public class tokuren40 {

	public static void main(String[] args) {
		// 毎日のパケット通信料
		int[] packetPriceArray = { 100, 120, 13, 0, 41, 32, 100, 102 };
		// パケット通信料合計額
		int packetPrice = 0;

		for (int i = 0; i < 8; i++) {
			packetPrice += packetPriceArray[i];
		}
		System.out.println("今週のパケット代は" + packetPrice + "円です。");

		int[] callPriceArray = { 10, 10, 60, 100, 0, 0, 20, 50 };
		int callPrice = 0;

		for (int i = 0; i < 7; i++) {
			callPrice += callPriceArray[i];
		}
		System.out.println("今週の通話料は" + callPrice + "円です");
	}
}
