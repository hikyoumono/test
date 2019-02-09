package rensyu;

public class tokuren16 {

	public static void main(String[] args) {
		tokuren15 ac = new tokuren15();
		ac.setEmployeename("畠山");
		ac.setDivisionname("総務部");
		ac.setVitality(100);
		cul(ac);

	}

	private static void cul(tokuren15 nedanhyou) {
		String ename = nedanhyou.getEmployeename();
		// getterを使う時、イコールの後は今のクラス名
		String dname = nedanhyou.getDivisionname();
		int vital = nedanhyou.getVitality();
		if (vital >= 100) {
			System.out.println(ename);
		} else {
			System.out.println(dname);
		}
	}

}
