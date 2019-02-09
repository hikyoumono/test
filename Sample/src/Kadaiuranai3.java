
public class Kadaiuranai3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String ketueki = "A";
		int nennrei = 20;
		if(ketueki == "A"){
			System.out.println("あなたの思い通りに物事がすすみそう");
		}
		if(ketueki == "A"){
			System.out.println("ゆったりとした気分で過ごせそう");
		}else if(ketueki == "B"){
			System.out.println("なりたい自分を思い描いて");
		}else  if(ketueki == "O"){
			System.out.println("情報収集が吉");
		}else if(ketueki == "AB"){
			System.out.println("本当に大切なものが見えてきそう");
		}else{
			System.out.println("余裕を持った行動を心がけて");
		}
		
		if(nennrei >= 20 && nennrei< 30){
			System.out.println("20代：人との心の距離に気を付けて");
		}else{
			System.out.println("20代以外：人との心の距離に気を付けて");
		}

	}

}

