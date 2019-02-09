package rensyu;

public class Setter2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Setter eo = new Setter();
		eo.setEmployeeName("畠山");
		eo.setDivisionName("企画部");
		eo.setVitality(10);

		String ename = eo.getEmployeeName();
		String dname = eo.getDivisionName();
		int vita = eo.getVitality();
		keisann(eo);

		System.out.println(ename);
		

	}

	public static void keisann(Setter nedann) {
		String ename = nedann.getEmployeeName();
		int rieki = 70000;
		int ryoukinn = 0;
		if(rieki >= 50000){
			ryoukinn = 500;
			System.out.println(ename);
			System.out.println(ryoukinn);

	}
	}
}