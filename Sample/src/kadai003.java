
public class kadai003 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int hat1 = 5000;
		int hat2 = 8;
		int result;
		result = tax(hat1,hat2);
		System.out.println(hat1 + "の商品の税込み価格は" + (hat1 + result) + "円（消費税は" + result + "円）です。");
		
	}
		public static int tax(int hat1, int hat2){
			int result = hat1 * hat2 / 100;
			return result;
			
		}		
	}


