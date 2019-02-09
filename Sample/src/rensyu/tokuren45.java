package rensyu;

public class tokuren45 {
	// =のことを代入演算子という
	public static void main(String args[]) {

		// 複合代入演算子について
		int m = 20;
		System.out.println(m);
		System.out.println("もとの数" + "\n");

		m += 20;
		System.out.println(m);
		System.out.println("足し算" + "\n");
		
		m -=20;
		System.out.println(m);
		System.out.println("引き算" + "\n");
		
		m *= 20;
		System.out.println(m);
		System.out.println("掛け算" + "\n");
		
		//++インクリメント
		//--デクリメント
		
		int i = 1;
		System.out.println(i++);
		System.out.println(i);
		System.out.println();
		
		i = 1;
		System.out.println(++i);
		i = 1;
		System.out.println(i--);
		i = 1;
		System.out.println(--i);
	}
}
