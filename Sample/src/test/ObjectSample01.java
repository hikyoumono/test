package test;

public class ObjectSample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Employee emp = new Employee();
		// Employeeはクラス名
		emp.employeeName = "大島";
		emp.divisionName = "営業部";
		emp.vitality = 150;
		emp.introduce();
		emp.showVitality();
		// introduceはメソッド

		Employee emp02 = new Employee();
		emp02.employeeName = "寺川";
		emp02.divisionName = "営業部";
		emp02.vitality = 250;
        emp02.introduce();
        emp02.greeting();
        emp02.report();
		emp02.showVitality();

	}

}
