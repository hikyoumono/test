package rensyu;

public class tokuren {

	public static void main(String[] args) {
		int nenrei = 30;
		if (nenrei >= 20) {
			System.out.println("成人です");
			if (nenrei >= 20 && nenrei < 30) {
				System.out.println("お兄さん");
			} else if (nenrei >= 30 && nenrei < 40) {
				System.out.println("おじさん");
			} else {
				System.out.println("おじいさん");
			}
		} else if(nenrei>=0&&nenrei<20){
			System.out.println("未成年です");
		}else {
			System.out.println("エラー！");
		}

	}

}
