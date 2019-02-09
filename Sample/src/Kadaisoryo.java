
public class Kadaisoryo {

	public static void equals(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String basyo = "北海道";

		if (basyo == "北海道") {
			System.out.println(basyo + "への送料は1,000円です");
		} else if (basyo == "東北") {
			System.out.println(basyo + "への送料は800円です");
		} else if (basyo == "関東" || basyo == "甲信越") {
			System.out.println(basyo + "への送料は700円です");
		} else if (basyo == "中部") {
			System.out.println(basyo + "への送料は650円です");
		} else if (basyo == "近畿") {
			System.out.println(basyo + "への送料は600円です");
		} else if (basyo == "四国") {
			System.out.println(basyo + "への送料は700円です");
		} else if (basyo == "中国") {
			System.out.println(basyo + "への送料は800円です");
		} else if (basyo == "九州" || basyo == "沖縄") {
			System.out.println(basyo + "への送料は950円です");
		} else {
			System.out.println("入力データエラーです");
		}
	}

}
