package rensyu;

public class tokuren7 {

	public static void main(String[] args) {
		int ryoukin = 0;
		String a = "九州";
		if (a == "北海道") {
			ryoukin = 1000;
			System.out.println(a + "への送料は" + ryoukin);
		} else if (a == "東北") {
			ryoukin = 800;
			System.out.println(a + "への送料は" + ryoukin);
		} else if (a == "関東" || a == "甲信越") {
			ryoukin = 700;
			System.out.println(a + "への送料は" + ryoukin);
		} else if (a == "中部") {
			ryoukin = 650;
			System.out.println(a + "への送料は" + ryoukin);
		} else if (a == "近畿") {
			ryoukin = 600;
			System.out.println(a + "への送料は" + ryoukin);
		} else if (a == "四国") {
			ryoukin = 700;
			System.out.println(a + "への送料は" + ryoukin);
		} else if (a == "中国") {
			ryoukin = 800;
			System.out.println(a + "への送料は" + ryoukin);
		} else if (a == "九州" || a == "沖縄") {
			ryoukin = 950;
			System.out.println(a + "への送料は" + ryoukin);
		}else{
			System.out.println("エラー");
		}

	}

}
