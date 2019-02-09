package rensyu;

public class tokuren3 {
	public static void main(String[] args){
		
		int score = 80;
		if(score >= 60){
			System.out.println("合格");
		}else if(score >= 80){
			System.out.println("いいと思う");
		}else if(score == 100){
			System.out.println("最高");
		}else{
			System.out.println("アホ");
			//if文の中にifを入れることをネスト
			//最後のelseは絶対に省略しない
		}
	}

}
