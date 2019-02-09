package test;

public class KadaiBMICa {

	public static void main(String[] args) {
		KadaiBMI na = new KadaiBMI();
		na.setTaiju(60);
		na.setSintyo(160);
		calc(na);
	}

	private static void calc(KadaiBMI keisanhyou) {
		double taiju = keisanhyou.getTaiju();
		double sintyo = keisanhyou.getSintyo();
		double BMI = taiju / (sintyo * sintyo / 10000);
		System.out.println("BMIは" + BMI + "です");

		if (BMI < 18.5) {
			System.out.println("やせぎみですです");
		} else if (BMI >= 18.5 && BMI <= 25) {
			System.out.println("健康な体です");
		} else if (BMI > 25) {
			System.out.println("肥満です");
		} else {
			System.out.println("エラー！");
		}

	}

}
