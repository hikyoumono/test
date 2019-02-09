package rensyu;

public class tokuren60 {

	public static void main(String[] args) {
		
		//内部クラスについて
		/*内部クラスとは、クラスの中に宣言するクラスのこと*/
		tokuren60 wa = new tokuren60();
	    Test t = wa.new Test();
	    t.temp();//メソッド

	}
	private class Test{
		void temp(){
			System.out.println("初期化");
		}
	}
}