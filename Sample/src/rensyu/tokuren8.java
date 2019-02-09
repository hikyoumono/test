package rensyu;

public class tokuren8 {

	public static void main(String[] args) {
		int kyori = 50;
		int ryoukin = 0;
		if(kyori >= 0 && kyori < 100){
			ryoukin = 600;
			System.out.println(kyori + "先に荷物を送るための送料は" + ryoukin + "円です");
		}else if(kyori >= 100 && kyori< 250){
			ryoukin = 800;
			System.out.println(kyori + "先に荷物を送るための送料は" + ryoukin + "円です");
		}else if(kyori >= 250 && kyori <500){
			ryoukin = 900;
			System.out.println(kyori + "先に荷物を送るための送料は" + ryoukin + "円です");
		}else if(kyori>=500){
			ryoukin = 1200;
			System.out.println(kyori + "先に荷物を送るための送料は" + ryoukin + "円です");
		}else{
			System.out.println("入力データエラーです");
		}

	}

}
