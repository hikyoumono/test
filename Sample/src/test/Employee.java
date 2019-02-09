package test;

public class Employee {
	public String employeeName;
	public String divisionName;
	public int vitality;

	public void introduce() {
		System.out.println("私の名前は" + employeeName + "です。");
		System.out.println("所属部署は" + divisionName + "です。");
        
	}

	public void greeting() {
		vitality = vitality - 10;
		System.out.println("おはようございます");
	}

	public void report() {
		vitality = vitality - 10;
		System.out.println("今日は10件アポを取りました");

	}

	public void showVitality() {
		vitality = vitality - 10;
		System.out.println("残り体力は" + vitality);
	}

	public void attendance() {
	}

	public void leavework() {
	}

}
