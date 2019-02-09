
public class KadaiSeizinn {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int seizinn = 20;

		if (seizinn >= 20) {
			System.out.println("成人ですね");
			if (seizinn >= 20 && seizinn < 30) {
				System.out.println("一般料金です");
			} else {
				System.out.println("社会人料金です");
			}
		} else if (seizinn >= 0 && seizinn < 20) {
			System.out.println("子供料金です");
		}else {
			System.out.println("エラー");
		}

	}

}
