package rensyu;

public class tokuren12 {

	public static void main(String[] args) {

		// 課題1
		for (int i = 1; i <= 9; i++) {
			for (int n = 1; n <= 9; n++) {
				System.out.print(i * n);
				System.out.print(" ");
				if (n == 9) {
					System.out.println();

				}
			}
		}
		System.out.println();

		// 課題2
		System.out.print("      ");
		for(int ue = 1;ue<=9;ue++){
			System.out.print(ue);
			System.out.print("  ");
		}
		System.out.println();
		for (int a = 1; a <= 9; a++) {
			System.out.print(a + "の段 ");
		for (int b = 1; b <= 9; b++) {
				System.out.print(a * b);
				System.out.print(" ");
				if (a * b/10==0 ) {
					System.out.print(" ");
				}
				if (b == 9) {
					System.out.println();
				}

			}

		}
	}
}
