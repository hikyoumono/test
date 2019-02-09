package test;

public class KadaiKan {

	public static void main(String[] args) {
		KadaiHakubutu ny = new KadaiHakubutu();
		ny.setNinzu(10);
		ny.setNedan(750);
		calc(ny);
	}

	private static void calc(KadaiHakubutu nedanhyou) {
		int ninzu = nedanhyou.getNinzu();
		int nedan = nedanhyou.getNedan();
		double kai = nedan * ninzu;
		double yasuuri = kai * 75 / 100;
		double yasuuri2 = yasuuri / ninzu;
		double sisyagonyu = Math.floor(yasuuri);

		if (ninzu < 15) {
			System.out.println("一人" + nedan + "で" + ninzu + "人で" + kai + "円です");
		} else if (nedan >= 15) {
			System.out.println("一人" + yasuuri2 + "で" + ninzu + "人で" + sisyagonyu + "円です");
		}

	}

}
