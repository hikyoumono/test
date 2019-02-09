
	package object;

	/**
	 * @author hogehoge
	 *
	 */
	public class Employeetest01 {

	    public static void main(String[] args) {

	        EmployeeSales es = new EmployeeSales(10, "南野", 200);

	        // 子クラスのフィールドに値をセット
	        es.appointment = "ほげほげ商事株式会社";
	        // 親クラスのメソッドも使えます
	        es.introduce();
	        // 親クラスのメソッドも使えます
	        es.greeting();
	        // 子クラス独自のメソッドも使えます
	        es.report();
	        // 体力表示
	        es.showVitality();

	    }
	}

}
