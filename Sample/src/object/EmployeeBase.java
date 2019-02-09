package object;

public class EmployeeBase {
	
	   public int employeeId;// 社員ID
	    public String employeeName;// 社員名
	    public String divisionName;// 部署名
	    public int vitality;// 体力

	    // コンストラクタ
	    EmployeeBase() {

	    }

	    // 引数ありコンストラクタ
	    EmployeeBase(int employeeId, String employeeName, String divisionName,
	            int vitality) {
	    this.employeeId = employeeId;
	        this.employeeName = employeeName;
	        this.divisionName = divisionName;
	        this.vitality = vitality;
	    }

	    // 自己紹介メソッド
	    void introduce() {
	        vitality = vitality - 10;
	        System.out.println("私の名前は" + employeeName + "です。");
	        System.out.println("所属部署は" + divisionName + "です。");
	    }

	    // 挨拶をするメソッド
	    void greeting() {
	        vitality = vitality - 10;
	        System.out.println("おはようございます");
	    }

	    // 挨拶をするメソッド、オーバーロード
	    void greeting(String divisionName) {
	        vitality = vitality - 10;
	        System.out.println(divisionName + "の皆さん、おはようございます");
	    }

	    // 残り体力を知らせるメソッド
	    void showVitality() {
	        vitality = vitality - 10;
	        System.out.println("残り体力は" + vitality);
	    }
	

}
