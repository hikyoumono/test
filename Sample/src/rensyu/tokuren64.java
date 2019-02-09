package rensyu;

public class tokuren64 {

	public static void main(String[] args) {
		//Computer com = new Computer();
		//他のクラスへのアクセス方法
		      //クラス名.フィールド名  com.os = windows;
		//他のクラスのメソッドへのアクセス方法
		      //クラス名.メソッド名    com.memory =2048;

		int a = 267;
		int b = 0413;
		int c = 0x10b;
		int d = 0b100001011;
		System.out.println(b);

		Object obj = "abc";
		System.out.println(obj);

		tokuren40 g = new tokuren40();
		tokuren40 h = new tokuren40();

		System.out.println();

		short abc = 1000;
		byte def = 0b100;
		byte lll = 0b1000000;
		System.out.println(abc);
		System.out.println(def + "byte");
		System.out.println(lll + "byte");

		System.out.println(1 == 1);
		System.out.println();

		String suzi1 = "1";
		String suzi2 = "5";
		String suzi3 = suzi1.equals(suzi2) ? "No":"Yes";

		System.out.println(suzi3);
		System.out.println();


	}

}
