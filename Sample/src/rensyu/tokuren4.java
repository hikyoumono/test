package rensyu;
//論理演算子

public class tokuren4 {

	public static void main(String[] args) {
		int score = 59;
		
		if(score >=60 && score<80){
			System.out.println("合格");
		}else if(score >=80 && score <99){
			System.out.println("いい点");
		}else if(score == 100){
			System.out.println("最高");
		}else{
			System.out.println("アホ");
		}
	}

}
