package test;

public class Employee01 {

	public String employeeName;
	public String divisionName;
	public int vitality;

	// コントラクタ
	Employee01() {
		System.out.println("初期化時にコントラストラクタが呼ばれました");
		employeeName = "未設定です";
		divisionName = "営業部";
		vitality = 0;
	}

	// 引数ありコントラクタ
	Employee01(String employeeName, String divisionName, int vitality) {
		System.out.println("初期化時に引数ありコントラクタが呼ばれました");
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;

	}

	void introduce(){
		vitality = vitality - 10;
		System.out.println("私の名前は" + employeeName + "です。");
		System.out.println("所属部署は" + divisionName + "です。");
		
	}
	
		void greeting(){
			vitality = vitality -10;
			System.out.println("おはようございます");
		}
			
		void report(){
			vitality = vitality - 10;
			System.out.println("今日は10件アポを取りました");
		}
		
			void showVitality(){
				vitality = vitality - 10;
				System.out.println("残りの体力は" + vitality);
				
		}
			void attendance(){
				
			}
			void leavework(){
			
	}
}
	
	


