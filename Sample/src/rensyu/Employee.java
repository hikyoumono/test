package rensyu;

public class Employee {
	//フィールド
	public String employeeName;
	public String divisionName;
	public int vitality;

	public void introduce(){
		//メインメソッドでないから実行しても何も起きない
		vitality = vitality -10;
	System.out.println("私の名前は" + employeeName);
	System.out.println("所属部署は" + divisionName);	
	}
	public void greeting(){
		vitality = vitality - 10;
		System.out.println("おはようございます");
	}
	public void report(){
		vitality = vitality - 10;
		System.out.println("今日は10件アポを取りました");
	}
	public void ShowVitality(){
		vitality = vitality - 10;
		System.out.println("残金は" + vitality);
	}
	public void syatiku(){
	}
	public void leavework(){
	
		
	}

}
