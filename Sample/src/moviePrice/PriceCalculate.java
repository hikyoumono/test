package moviePrice;

public class PriceCalculate {

	public static void main(String[] args) {

		Customer cs01 = new Customer();
		cs01.setNennrei(25);
		cs01.setSeibetu("男");
		cs01.setFirstday(false);
		cs01.setLadiesday(false);
		cs01.setLateshow(true);
		cs01.setIs3D(false);
		calcu(cs01);

		Customer cs02 = new Customer();
		cs02.setNennrei(20);
		cs02.setSeibetu("女");
		cs02.setFirstday(false);
		cs02.setLadiesday(false);
		cs01.setLateshow(true);
		cs01.setIs3D(false);
		calcu(cs02);

		Customer cs03 = new Customer();
		cs03.setNennrei(35);
		cs03.setSeibetu("女");
		cs03.setFirstday(true);
		cs03.setLadiesday(true);
		cs03.setLateshow(false);
		cs03.setIs3D(false);
		calcu(cs03);

	}

	private static void calcu(Customer nedanhyou) {
		int nennrei = nedanhyou.getNennrei();
		String seibetu = nedanhyou.getSeibetu();
		int ryoukinn = 0;
		// 0にすることで料金を初期化
		if (nennrei >= 22) {
			ryoukinn = 1800;
			System.out.println("一般料金は" + ryoukinn);
		} else if (nennrei >= 19 && nennrei < 22) {
			ryoukinn = 1500;
			System.out.println("大学生は" + ryoukinn);
		} else if (nennrei >= 16 && nennrei < 19) {
			ryoukinn = 1200;
			System.out.println("高校生は" + ryoukinn);
		} else if (nennrei >= 7 && nennrei <= 16) {
			ryoukinn = 1000;
			System.out.println("小中学生は" + ryoukinn);
		} else if (nennrei >= 0 && nennrei < 7) {
			ryoukinn = 0;
			System.out.println("小学生未満は無料です");
		} else {
			System.out.println("お手数ですがもう一度最初からやり直して下さい");
		}

		boolean Aday = nedanhyou.isFirstday();
		boolean Bday = nedanhyou.isLadiesday();
		boolean Cday = nedanhyou.isLateshow();
		boolean Dday = nedanhyou.isIs3D();

		// レイトショー
		if (Cday == true && ryoukinn > 1500) {
			ryoukinn = 1500;
			System.out.println("レイトショーなので" + ryoukinn + "円です");
		}
		if (Bday == true && seibetu.equals("女") && ryoukinn > 1200) {
			ryoukinn = 1200;
			System.out.println("レディースデイなので" + ryoukinn + "円です");
		}
		if (Aday == true && ryoukinn > 1000) {
			ryoukinn = 1000;
			System.out.println("映画の日なので" + ryoukinn + "円です");
		}
		if (Dday == true) {
			int ao = 400 + ryoukinn;
			System.out.println("3D料金こみで" + ao + "円です");
		}

	}

}
