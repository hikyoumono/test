
public class Kadainimotu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int kyori = 150;
		if(kyori >=0 && kyori<100){
			System.out.println(kyori + "キロ先に送るための送料は600円です");
		}else if(kyori >=100 && kyori <250){
			System.out.println(kyori + "キロ先に送るための送料は800円です");
		}else if(kyori >=250 && kyori <500){
			System.out.println(kyori + "キロ先に送るための送料は900円です");
		}else if(kyori >=500){
			System.out.println(kyori + "キロ先に送るための送料は1200円です");
		}else{
			System.out.println("入力エラー");
		}
	}

}
