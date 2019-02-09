package rensyu;

public class tokuren5 {

	public static void main(String[] args) {

		int sansu = 60;
		int kokugo = 60;

		if (sansu >= 60 && kokugo >= 60) {
			System.out.println("合格");
		} else if (sansu >= 60 || kokugo >= 60) {
			System.out.println("どっちかミスった");
		} else {
			System.out.println("アホ");
		}
	}

}
