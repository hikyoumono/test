package test;

public class KadaiUru {

	public static void main(String[] args) {
		int tosi = 2017;
		if (tosi % 400 != 0 && tosi % 100 == 0) {
			System.out.println(tosi + "年は平年です");
		} else if (tosi % 4 == 0) {
			System.out.println(tosi + "年はうるう年です");
		} else {
			System.out.println(tosi + "年は平年です");
		}

	}

}
