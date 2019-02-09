package rensyu;

public class tokuren54 {

	public static void main(String[] args) {
        //クラスから生成したオブジェクトをインスタンスと呼ぶ
		//インスタンス化せずに呼び出せるメソッドをクラスメソッド
		//インスタンス化しないと呼び出せないメソッドをインスタンスメソッドという
		abc();
		System.out.println("処理D");
	}
		static void abc(){
			int i = 0;
			
			System.out.println("処理A");
			System.out.println("処理B");
			if(i == 0) return;  //ここで処理中断してメインメソッドに戻る（abc()のところまで戻る）
			System.out.println("処理C");
			//voidがあるから返り値いらない
		
	}

}
