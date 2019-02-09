package rensyu;

public class tokuren68 {

	public static void main(String[] args) {
		for(int i = 0, total = 1;i <= 5;i++){
			System.out.println(i);
		}
		System.out.println();
		System.out.println("ここからスコープ外");
		//System.out.println(total);
		System.out.println("totalはスコープ外なので反映されない");
	}
	

}
