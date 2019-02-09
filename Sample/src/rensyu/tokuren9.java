package rensyu;

public class tokuren9 {

	public static void main(String[] args) {

		// 課題1
		String ketu = "A";
		if (ketu == "A") {
			System.out.println("あなたの思い通りに物事が進みそうです");
		} else {
			System.out.println("余裕を持った行動を心がけて");
		}

		//課題2
		if(ketu == "A"){
			System.out.println("ゆったりとした気分で過ごせそう");
		}else if(ketu == "B"){
			System.out.println("なりたい自分を思い描いて");
		}else if(ketu == "O"){
			System.out.println("情報収集が吉");
		}else if(ketu =="AB"){
			System.out.println("本当に大切なものが見えてきそう");
		}else{
			System.out.println("余裕を持った行動を心がけて");
		}

		//課題3
		int nenrei = 22;
		if(ketu == "A" && nenrei >= 20 && nenrei < 30){
			System.out.println("人との心の距離に気を付けて");
		}else{
			System.out.println("短所も長所に変えられます");
		}

	}

}
