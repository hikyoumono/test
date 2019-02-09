package rensyu;

public class tokuren49 {

	public static void main(String[] args) {
		// 分岐処理
		int i = 3;
		if (i == 3) {
			System.out.println("iは" + i + "です");
		} else {
			System.out.println("違うよ");
		}
		System.out.println();
		

		// switch文でも分岐を作れる
		switch (i) {
		case 1:
			System.out.println("iは1です");
			break;
		case 2:
			System.out.println("iは2です");
			break;
		case 3:
			System.out.println("iは3です");
			break;
		default:
			System.out.println("4以上");

		}

	}

}
