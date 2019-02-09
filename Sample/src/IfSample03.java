
public class IfSample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int score = 80;
		if (score > 60) {
			System.out.println("合格してます！");
		} else if (score >= 80) {
			System.out.println("よくできました");
		} else if (score == 100) {
			System.out.println("満点です、褒美を取らせよう");
		} else {
			System.out.println("赤点です。補講に来なさい");
		}
	}
}