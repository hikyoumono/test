package rensyu;

public class tokuren6 {
	
	public static void main(String[] args){
		int nimotu = 5;
		int ryoukin = 0;
		if(nimotu >= 0 && nimotu <=1){
			ryoukin = 250;
			System.out.println("荷物の重さが"+nimotu + "送料は" + ryoukin + "円です");
		}
		else if(nimotu > 1 && nimotu<= 3){
			ryoukin = 400;
			System.out.println("荷物の重さが"+nimotu + "送料は" + ryoukin + "円です");
		}
		else if(nimotu > 3 && nimotu <=5){
			ryoukin = 500;
			System.out.println("荷物の重さが"+nimotu + "送料は" + ryoukin + "円です");
		}
		else if(nimotu > 5 && nimotu <= 10){
			ryoukin = 900;
			System.out.println("荷物の重さが"+nimotu + "送料は" + ryoukin + "円です");
		}
		else if(nimotu > 10){
		ryoukin = 1200;
		System.out.println("荷物の重さが"+nimotu + "送料は" + ryoukin + "円です");
		}
		else{
			System.out.println("入力エラー");
		}
		}
}
