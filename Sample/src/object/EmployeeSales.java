package object;

public class EmployeeSales  extends EmployeeBase {
    // フィールド
    public String appointment;

    // コンストラクタ
    EmployeeSales() {

    }

    // 引数ありコンストラクタ
    EmployeeSales(int employeeId, String employeeName, int vitality) {
        super.employeeId = employeeId;
        super.employeeName = employeeName;
        super.divisionName = "営業部";
        super.vitality = vitality;
        this.appointment = "未定";
    }

    // 報告するメソッド
        void report() {
                vitality = vitality - 10;
                System.out.println("今日は10件アポイント取りました");
        }

}
